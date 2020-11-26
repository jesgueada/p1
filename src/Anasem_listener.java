import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Anasem_listener extends AnasintBaseListener {

    //LLamar a visitador, clase AnasintBaseVisitor
    Anasem_visitor visitador = new Anasem_visitor();


    //DISEÑO 1.1

    public void exitDecl_vars(Anasint.Decl_varsContext ctx){
        String tipo = ctx.tipo().getText();
        // System.out.println(ctx.tipo().getText());
        //Añadir par variable-tipo
        exitVars(ctx.vars(),tipo);
    }

    //Obtener variable
    public void exitVars(Anasint.VarsContext ctx,String tipo){
        int linea = ctx.start.getLine();
        if(ctx.getChildCount()>1){
            //System.out.println(ctx.IDENT().getText());
            visitador.almacen_variables_declaradas.put(ctx.IDENT().getText(),tipo);
            exitVars(ctx.vars(),tipo);

        }else{
            //Diseño 2: Identificador,de la variable, duplicado en VARIABLES
            String ident_var = ctx.IDENT().getText();
            if(visitador.almacen_variables_declaradas.containsKey(ident_var)){
                System.out.println("ERROR: "+ident_var+ " ya existe. Error en la línea: "+linea);
            }

            visitador.almacen_variables_declaradas.put(ident_var,tipo);
            //System.out.println("0"+ctx.IDENT().getText());
        }
    }


    public void exitAsignacion(Anasint.AsignacionContext ctx) {
        //DISEÑO 1.2 : Es necesario comprobar por asignacion la existencia
        //			   de su identificador  en :  almacen_variables_declaradas

        //Cuando hay IDENT(COMA IDENT)?   -> IDENT pasa a ser una lista de nodos en el que tiene incluido null.
        int linea = ctx.start.getLine();
        if (ctx.IDENT().size() > 2){
            System.out.println("ERROR: No se permiten más de dos asignaciones multiples "+ctx.IDENT()+ " en línea: "+ linea);

        }else if (ctx.IDENT().size() > 1 && ctx.IDENT().size() <3) {

            //DISEÑO 3
            //VARIABLES MULTIPLES
            List<String>ls_tiposAdev = new ArrayList<>();

            if(ctx.expr().getChildCount() > 1) {     //Expr: expr COMA expr
                for (int j = 0; j < ctx.expr().getChildCount(); j++) {
                    // System.out.println(j + " : " + ctx.expr().getChild(j).getText() + " (" + visitador.visit(ctx.expr().getChild(j)) + ")");
                    if (!(ctx.expr().getChild(j).getText().equals(","))) {
                        ls_tiposAdev.add(visitador.visit(ctx.expr().getChild(j)));
                    }
                }
            }else{     //Expr : Llamar_funcion.

                String nombreFuncOpred = ctx.expr().start.getText();   //Start de ctx.expr es el primer token de llamar_funcion = ident
                int numTiposDev = visitador.almacen_subprogramas.get(nombreFuncOpred).size();


                if(ctx.IDENT().size() > numTiposDev){  //DECISIÓN 3.8
                    // throw new IllegalArgumentException("ERROR: La función o predicado ->"+nombreFuncOpred+"<- devuelve menos elementos " +
                    //        "que variables asignadas.");
                    System.out.println("ERROR: La función o predicado ->"+nombreFuncOpred+"<- devuelve menos elemenos "+
                            "que variables asignadas. En línea: "+linea);
                }else{

                    for(int i = 0; i < numTiposDev; i++){
                        String centinela = visitador.visitExprLlamadaFunc((Anasint.ExprLlamadaFuncContext)ctx.expr(),i);
                        ls_tiposAdev.add(centinela);
                    }
                }
            }
            //System.out.println(ls_tiposAdev);


            //RECORRER LOS IDENTS Y COMPARAR CON LA ASIGNACION
            for (int i = 0; i < ctx.IDENT().size(); i++) {
                String varDeAsignacion = ctx.IDENT(i).getText();

                //DISEÑO 1.4
                if (!visitador.almacen_variables_declaradas.containsKey(varDeAsignacion)) {
                    System.out.println("ERROR1 : " + varDeAsignacion + " no está declarada. En línea: "+linea);
                }
                //DISEÑO 3
                if(!(visitador.almacen_variables_declaradas.get(varDeAsignacion).equals(ls_tiposAdev.get(i)))){
                    System.out.println("ERROR: el tipo de ->"+varDeAsignacion+"<- no coincide con su asignacion ("
                            +ls_tiposAdev.get(i)+") En línea: "+ linea);
                }
            }

        } else {
            String varDeAsignacion = ctx.start.getText();
            //System.out.println(ctx.start.getText());
            //System.out.println(ctx.start.getText());

            //DISEÑO 1.4
            if (!visitador.almacen_variables_declaradas.containsKey(varDeAsignacion)) {
                System.out.println("ERROR : " + varDeAsignacion + " no está declarada. En línea: "+linea);
            }

            //DISEÑO 3
            //QUiero analaizar la expresion de mi asignación para VARIABLES NO MULTIPLES
            String centinela = visitador.visit(ctx.expr());
            String tipoDeVar = visitador.almacen_variables_declaradas.get(varDeAsignacion);

            if(tipoDeVar != null) {
                //Coincide el el tipo de var y su expresion?
                if (!(tipoDeVar.equals(centinela))) {
                    System.out.println("Par:" + varDeAsignacion + "(" + tipoDeVar + ")" + "- Tipo de expr: " + centinela + " En línea: " + linea);
                    System.out.println("ERROR : " + "La variable -> " + varDeAsignacion +
                            " <- no coincide con el tipo de su expresion. En linea: " + linea);
                    System.out.println("        " + tipoDeVar + " != " + centinela);
                } else if (tipoDeVar.equals("Indefinido")) {
                    System.out.println("Par:" + varDeAsignacion + "(" + tipoDeVar + ")" + "- Tipo de expr: " + centinela + " En línea: " + linea);
                    System.out.println("ERROR : " + "La variable -> " + varDeAsignacion +
                            " <- no coincide con el tipo de su expresion. En línea: " + linea);
                }
            }

        }
    }

    //DISEÑO 3.5 : Para poder calcular el tipo que devuelve una llamada a funcion, previamente se tiene
    //             que almacenar el par nombre_funcion, tipo_dev en : almacen_subprogramas.

    public void exitFuncionAuxFunc(Anasint.FuncionAuxFuncContext ctx){
        String identFunc = ctx.funcion().IDENT().getText();

        //AÑADIR PARAMETROS DE ENTRADA
        añadirPar_ParamEntrada_tipos_func(ctx.funcion().parametros_e(),identFunc);
        //System.out.println(ctx.funcion().parametros_e().getChild(0).getText());

        //AÑADIR PARAMETROS DE SALIDA
        List<String>ls_tipos_a_dev = new ArrayList<>();

        int tam_param_salida = ctx.funcion().parametros_s_f().getChildCount();
        //System.out.println(identFunc + "-"+tam_param_entrada);
        //System.out.println(identFunc +"-"+tam_parametros);
        //System.out.println(ctx.funcion().parametros_s_f().getChild(2).getChild(0).getChild(0).getText());

        if( tam_param_salida > 1){
            String primerTipoAdev = ctx.funcion().parametros_s_f().getChild(0).getChild(0).getText();
            ls_tipos_a_dev.add(primerTipoAdev);

            //El segundo parametro es: funcion->parametros_s_f->parametros_s_f->parametro_s_f->NUM y max
            for(int i = 1; i < tam_param_salida;i++){
                String token = ctx.funcion().parametros_s_f().getChild(i).getText();
                if(!token.equals(",")){
                    //System.out.println(ctx.funcion().parametros_s_f().getChild(i).getChild(0).getChild(0).getText());

                    System.out.println("Salida:"+ctx.funcion().parametros_s_f().getChild(i).getText());
                    ls_tipos_a_dev.add(ctx.funcion().parametros_s_f().getChild(i).getChild(0).getChild(0).getText());


                }
            }
            visitador.almacen_subprogramas.put(identFunc,ls_tipos_a_dev);
        }

        if(tam_param_salida == 1){
            String tipoAdev = ctx.funcion().parametros_s_f().getChild(0).getChild(0).getText();
            //System.out.println(ctx.funcion().parametros_s_f().getChild(0).getChild(0).getText());

            //DECISION DE DISEÑO 3.5.2
            if(tipoAdev.equals("LOG")){
                System.out.println("ERROR: la función no puede devolver solamente un valor de tipo LOG"
                        +". Los predicados solo devuelven un valor LOG");
            }else{
                ls_tipos_a_dev.add(tipoAdev);
                visitador.almacen_subprogramas.put(identFunc,ls_tipos_a_dev);
            }

        }
        //Las funciones tienen un conjunto no vacio de parametros de salida
        if(tam_param_salida == 0){
            //  throw new IllegalArgumentException("La función ->"+identFunc+"<- no devuelve nada");
            System.out.println("La función ->"+identFunc+"<- no devuelve nada");
        }
    }

    public void exitFuncionAuxPred(Anasint.FuncionAuxPredContext ctx){
        String ident_pred = ctx.predicado().getStart().getText();

        //DEVOLVER LOG
        List<String>ls_tipos_a_dev = new ArrayList<>();
        ls_tipos_a_dev.add("LOG");

        visitador.almacen_subprogramas.put(ident_pred,ls_tipos_a_dev);
        //System.out.println(ident_pred);
    }

    public void exitProcedimientoAux(Anasint.ProcedimientoAuxContext ctx){
        String ident_proc = ctx.IDENT().getText();

        //AÑADIR PARAMETROS DE ENTRADA
        añadirPar_ParamEntrada_tipos_func(ctx.parametros_e(),ident_proc);
        //System.out.println(visitador.almacen_subprogramas_entrada);

        //AÑADIR SALIDA
        //System.out.println("Prueba: "+ ident_proc);
        //NO DEVUELVE NADA -->Añadir null al almacen_subproblemas el par nombre_funcion - tipos_a_devolver
        visitador.almacen_subprogramas.put(ident_proc, new ArrayList<>());
    }


    public void  exitExprLlamadaFunc(Anasint.ExprLlamadaFuncContext  ctx){
        String ident_func = ctx.start.getText();

        int numParam = ctx.llamar_funcion().parametros_call_func().v_param_call_func().size();
        int numTiposEntFunc = visitador.almacen_subprogramas_entrada.get(ident_func).size();
        int linea = ctx.start.getLine();

        //DECISION DE DISEÑO 4.2

        if(numTiposEntFunc != numParam){
            System.out.println("ERROR: No coincide el número de parámetros de entrada de la función ->"+ ident_func +"<- en la línea: "+ linea );
            //throw new IllegalArgumentException("ERROR: No coincide el número de parametros"+
            //        " de entrada de la función");
        }else{

            // Map<String, String> listaVariables = visitador.getAlmacen_variables_declaradas();
            // System.out.println(listaVariables);

            //RECORRER LOS PARAMETROS DE ENTRADA
            for(int i = 0; i < numTiposEntFunc;i++){

                String tipoParamFunc = visitador.almacen_subprogramas_entrada.get(ident_func).get(i);
                String paramLLamada = ctx.llamar_funcion().parametros_call_func().v_param_call_func().get(i).getText();
                String tipoParamLLamada = visitador.getAlmacen_variables_declaradas().get(paramLLamada);

                if (!visitador.getAlmacen_variables_declaradas().containsKey(paramLLamada)) {
                    //System.out.println(paramLLamada);
                    System.out.println("ERROR: la variable ->"+paramLLamada+"<- no existe, en la línea: "+linea);
                } else {
                    //  System.out.println(tipoParamLLamada);
                    // System.out.println(tipoParamFunc);

                    //DECISION DE DISEÑO 4.1
                    if (!(tipoParamFunc.equals(tipoParamLLamada))) {
                        System.out.println("ERROR: Los tipos de los parametros son erroneos. En línea "+linea);
                        break;
                    }
                }
            }
        }

        //System.out.println(ctx.llamar_funcion().parametros_call_func().v_param_call_func().get(1).getText());
    }

    public void exitLlamar_procedimiento(Anasint.Llamar_procedimientoContext ctx){
        String ident_proc = ctx.llamar_funcion().IDENT().getText();
        int linea_fichero = ctx.start.getLine();

        //¿Está declarado en subprogramas?
        if(!(visitador.almacen_subprogramas_entrada.containsKey(ident_proc))){
            System.out.println("Error: El procedimiento ->"+ident_proc+"<-  no está declrado en SUBPROGRAMAS"+
                                    ",linea :"+linea_fichero);
        }else{
            int numParamECall = ctx.llamar_funcion().parametros_call_func().v_param_call_func().size();
            int numParamDeclarados = visitador.almacen_subprogramas_entrada.get(ident_proc).size();

            if(numParamECall != numParamDeclarados){
                System.out.println("Error: No coinciden los parametros de entrada con los declarados, linea:"+linea_fichero);
            }
        }
    }

    // PARAMETROS DE ENTRADA
    public void añadirPar_ParamEntrada_tipos_func(Anasint.Parametros_eContext p, String f){
        List<String> ls_tipos_entrada = new ArrayList<>();

        for(int i = 0; i <p.getChildCount();i++){
            String nodoDeP = p.getChild(i).getText();
            //System.out.println(nodoDeP);

            if(!(nodoDeP.equals(","))){

                if(p.getChild(i).getChildCount() > 1){
                    //Seria un tipo seq  : parametros_e->parametro_e->tipo->seq_entera o seq_log -> SEQ + ( + NUM/LOG + )
                    String tipo_param = p.getChild(i).getChild(0).getChild(0).getChild(0).getText();

                    //System.out.println(tipo_param);
                    //ident : parametros_e-->parametro_e->Ident
                    //String ident_param = p.getChild(i).getChild(1).getText();

                    ls_tipos_entrada.add(tipo_param);
                    //System.out.println(ident_param+"-"+tipo_param);

                }else{
                    //String ident_param = p.getChild(i).getChild(0).getChild(1).getText();
                    String tipo_param = p.getChild(i).getChild(0).getChild(0).getText();
                    //System.out.println(ident_param+"-"+tipo_param);
                    ls_tipos_entrada.add(tipo_param);
                }
            }
        }
        visitador.almacen_subprogramas_entrada.put(f,ls_tipos_entrada);
    }

    //GETTERS
    public Map<String,String> getAlmacen_variables_declaradas(){
        return visitador.almacen_variables_declaradas;
    }

    public Map<String,List<String>> getAlmacen_subprogramas(){
        return visitador.almacen_subprogramas;
    }

    public Map<String,List<String>> getAlamacen_subprogramas_entrada(){
        return visitador.almacen_subprogramas_entrada;
    }
}
