// Generated from C:/Users/warbo/IdeaProjects/p1/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Anasint.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(Anasint.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funcionOpredicado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionOpredicado(Anasint.FuncionOpredicadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionAux(Anasint.FuncionAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(Anasint.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#predicadoAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicadoAux(Anasint.PredicadoAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#procedimientoAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimientoAux(Anasint.ProcedimientoAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipoInstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoInstruccion(Anasint.TipoInstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(Anasint.AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_arit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_arit(Anasint.Expr_aritContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(Anasint.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(Anasint.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunciones(Anasint.FuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipoLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoLog(Anasint.TipoLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#sec_elementos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSec_elementos(Anasint.Sec_elementosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#sec_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSec_elem(Anasint.Sec_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(Anasint.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cond(Anasint.Expr_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_cond(Anasint.Tipo_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(Anasint.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#operadorLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLog(Anasint.OperadorLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#dev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDev(Anasint.DevContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuptura(Anasint.RupturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(Anasint.MostrarContext ctx);
}