import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anasem_visitor extends AnasintBaseVisitor<String>{


    public Map<String, String> almacen_variables_declaradas = new HashMap<>();        //Par: Variable-tipo
    public Map<String, List<String>> almacen_subprogramas = new HashMap<>();//Par: nomFunc - ls_tipos a devolver
    public Map<String, List<String>> getAlmacen_subprogramas_entrada = new HashMap<>();   //Par: numFunc-ls_tipos de entrada

    //DISEÑO 3: CÁLCULAR EL TIPO DE LAS EXPRESIONES (visitExpr)

    public String visitExprBin(Anasint.ExprBinContext ctx){
        String parteIzq = visit(ctx.expr(0));
        String parteDer = visit(ctx.expr(1));

        if(parteIzq == null){
            return "Indefinido";
        }

        if(parteIzq.equals(parteDer)){
            return parteIzq;
        } else{
            return "Indefinido";
        }
    }

    public String visitExprSegunContSeq(Anasint.ExprSegunContSeqContext ctx){
        String seqEnAsign = ctx.IDENT().getText(); // IDENT CA...CC
        int linea = ctx.start.getLine();
        //Decision 1.4
        if (!varEstaDeclarada(seqEnAsign)) {
            //throw new IllegalArgumentException("Secuencia: ->"+seqEnAsign+"<- no declarada");
            System.out.println("Secuencia: -> "+seqEnAsign+"<- no declarada en línea: "+linea);
        }

        String tipoDeLaExpr = almacen_variables_declaradas.get(seqEnAsign);

        //Decision 3.3 : Devolver apropiadamente el tipo del elemento de la secuencia (seq(1))
        String[] tipoDeLaExpr_splited_1 = tipoDeLaExpr.split("\\(");
        String[] tipoDeLaExpr_splited_2 = tipoDeLaExpr_splited_1[1].split("\\)");
        String res = tipoDeLaExpr_splited_2[0].trim();

        //System.out.println("TEST visitExprSegunContSeq: "+res);
        return res;
    }

    public String visitExprVar(Anasint.ExprVarContext ctx){
        String varComoAsign = ctx.IDENT().getText();
        //System.out.println(varComoAsign);
        int linea = ctx.start.getLine();

        //Decision 1.3
        if (!varEstaDeclarada(varComoAsign)) {
            //throw new IllegalArgumentException("Variable: ->"+varComoAsign+"<- no declarada");
            System.out.println("Variable: ->"+varComoAsign+"<- no declarada en línea: "+linea);
        }
        String tipoDeLaExpr = almacen_variables_declaradas.get(varComoAsign);

        return tipoDeLaExpr;
    }

    public String visitExprNumero(Anasint.ExprNumeroContext ctx){
        return "NUM";
    }

    public String visitExprCierto(Anasint.ExprCiertoContext ctx){
        return "LOG";
    }

    public String visitExprFalso(Anasint.ExprFalsoContext ctx){
        return "LOG";
    }

    public String visitExprSeq(Anasint.ExprSeqContext ctx){
        int linea = ctx.start.getLine();
        //DISEÑO 3.4 : Comprobar que coincidan los tipos de los elementos de una secuencia.
        if(ctx.seq_elems() != null) {
            if (!(ctx.seq_elems().CIERTO().isEmpty()) && ctx.seq_elems().NUMERO().isEmpty()) {
                return "SEQ(LOG)";
            } else if (!(ctx.seq_elems().FALSO().isEmpty()) && ctx.seq_elems().NUMERO().isEmpty()) {
                return "SEQ(LOG)";
            } else if (!(ctx.seq_elems().NUMERO().isEmpty())
                    && ((ctx.seq_elems().CIERTO().isEmpty()) && (ctx.seq_elems().FALSO().isEmpty()))) {
                return "SEQ(NUM)";
            } else {
                return "Indefinido " + linea;
            }
        } else {
            return "Null";
        }
    }

    //variables NO MULTIPLES
    public String visitExprLlamadaFunc(Anasint.ExprLlamadaFuncContext ctx){
        String nombreFuncOproc = ctx.llamar_funcion().start.getText();
        //System.out.println(nombreFuncOproc);

        //¿EStá en subprograma?
        if(!(almacen_subprogramas.containsKey(nombreFuncOproc))){
            System.out.println("ERROR : la funcion o procedimiento ->"+nombreFuncOproc+
                                    "<- no está en subprogramas.");
            return "Indefinido";
        }else{
            if(almacen_subprogramas.get(nombreFuncOproc).equals(null)){
                System.out.println("ERROR: el procedimiento ->"+nombreFuncOproc+ "<- devuelve void.");
                return "Indefinido";
            }else{
                List<String> ls_tiposAdev = almacen_subprogramas.get(nombreFuncOproc);
                if(ls_tiposAdev.size()>1){
                    System.out.println("La devolución de la función es multiple");
                    return "Indefinido";
                }else{
                    return ls_tiposAdev.get(0);
                }
            }

        }

    }
    //VARIABLES MULTIPLES
    public String visitExprLlamadaFunc(Anasint.ExprLlamadaFuncContext ctx,int indice){

        String nombreFuncOproc = ctx.llamar_funcion().start.getText();
        //System.out.println(nombreFuncOproc);

        //¿EStá en subprograma?
        if(!(almacen_subprogramas.containsKey(nombreFuncOproc))){
            System.out.println("ERROR : la funcion o procedimiento ->"+nombreFuncOproc+
                    "<- no está en subprogramas.");
            return "Indefinido";
        }else{
            //devolver el tipo de la ls_tipos de la llave nombreFuncion, en funcion del parametro indice
            return almacen_subprogramas.get(nombreFuncOproc).get(indice);
        }

    }

    public Map<String, String> getAlmacen_variables_declaradas(){
        return almacen_variables_declaradas;
    }

    public Boolean varEstaDeclarada(String s){
        if(almacen_variables_declaradas.containsKey(s)){
            return true;
        }else{
            return false;
        }
    }

    public String tipoDeVar(String var){
        //Decision 1.3
        if (!varEstaDeclarada(var)) {
           // throw new IllegalArgumentException("Variable: ->"+var+"<- no declarada");
            System.out.println("Variable: ->"+var+"<- no declarada");
        }
        return almacen_variables_declaradas.get(var);
    }


}
