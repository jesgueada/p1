// Generated from C:/Users/warbo/IdeaProjects/p1/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Anasint.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Anasint.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(Anasint.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(Anasint.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Anasint.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Anasint.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 */
	void enterDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 */
	void exitDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 */
	void enterSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 */
	void exitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funcionOpredicado}.
	 * @param ctx the parse tree
	 */
	void enterFuncionOpredicado(Anasint.FuncionOpredicadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funcionOpredicado}.
	 * @param ctx the parse tree
	 */
	void exitFuncionOpredicado(Anasint.FuncionOpredicadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(Anasint.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 */
	void enterFuncionAux(Anasint.FuncionAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 */
	void exitFuncionAux(Anasint.FuncionAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(Anasint.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(Anasint.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 */
	void enterPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 */
	void exitPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#predicadoAux}.
	 * @param ctx the parse tree
	 */
	void enterPredicadoAux(Anasint.PredicadoAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#predicadoAux}.
	 * @param ctx the parse tree
	 */
	void exitPredicadoAux(Anasint.PredicadoAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#procedimientoAux}.
	 * @param ctx the parse tree
	 */
	void enterProcedimientoAux(Anasint.ProcedimientoAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#procedimientoAux}.
	 * @param ctx the parse tree
	 */
	void exitProcedimientoAux(Anasint.ProcedimientoAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipoInstruccion}.
	 * @param ctx the parse tree
	 */
	void enterTipoInstruccion(Anasint.TipoInstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipoInstruccion}.
	 * @param ctx the parse tree
	 */
	void exitTipoInstruccion(Anasint.TipoInstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_arit}.
	 * @param ctx the parse tree
	 */
	void enterExpr_arit(Anasint.Expr_aritContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_arit}.
	 * @param ctx the parse tree
	 */
	void exitExpr_arit(Anasint.Expr_aritContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(Anasint.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(Anasint.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(Anasint.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(Anasint.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFunciones(Anasint.FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFunciones(Anasint.FuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipoLog}.
	 * @param ctx the parse tree
	 */
	void enterTipoLog(Anasint.TipoLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipoLog}.
	 * @param ctx the parse tree
	 */
	void exitTipoLog(Anasint.TipoLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#sec_elementos}.
	 * @param ctx the parse tree
	 */
	void enterSec_elementos(Anasint.Sec_elementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#sec_elementos}.
	 * @param ctx the parse tree
	 */
	void exitSec_elementos(Anasint.Sec_elementosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#sec_elem}.
	 * @param ctx the parse tree
	 */
	void enterSec_elem(Anasint.Sec_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#sec_elem}.
	 * @param ctx the parse tree
	 */
	void exitSec_elem(Anasint.Sec_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condiciones}.
	 * @param ctx the parse tree
	 */
	void enterCondiciones(Anasint.CondicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condiciones}.
	 * @param ctx the parse tree
	 */
	void exitCondiciones(Anasint.CondicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_cond}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cond(Anasint.Expr_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_cond}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cond(Anasint.Expr_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(Anasint.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo_cond}.
	 * @param ctx the parse tree
	 */
	void enterTipo_cond(Anasint.Tipo_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo_cond}.
	 * @param ctx the parse tree
	 */
	void exitTipo_cond(Anasint.Tipo_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(Anasint.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(Anasint.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#operadorLog}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLog(Anasint.OperadorLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#operadorLog}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLog(Anasint.OperadorLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#dev}.
	 * @param ctx the parse tree
	 */
	void enterDev(Anasint.DevContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#dev}.
	 * @param ctx the parse tree
	 */
	void exitDev(Anasint.DevContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void enterIteracion(Anasint.IteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void exitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void enterRuptura(Anasint.RupturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void exitRuptura(Anasint.RupturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(Anasint.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(Anasint.MostrarContext ctx);
}