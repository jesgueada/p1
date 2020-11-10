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
	 * Visit a parse tree produced by {@link Anasint#secciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecciones(Anasint.SeccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_vars(Anasint.Decl_varsContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#tipo_elemental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_elemental(Anasint.Tipo_elementalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_num(Anasint.Tipo_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_log(Anasint.Tipo_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo_no_elemental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_no_elemental(Anasint.Tipo_no_elementalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunciones(Anasint.FuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionAux(Anasint.FuncionAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#parametros_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_e(Anasint.Parametros_eContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#parametro_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro_e(Anasint.Parametro_eContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#parametros_s_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_s_f(Anasint.Parametros_s_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#procedimientos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimientos(Anasint.ProcedimientosContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Anasint.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_num(Anasint.Expr_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_log(Anasint.Expr_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_seq(Anasint.Expr_seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#indice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndice(Anasint.IndiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#seq_elems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_elems(Anasint.Seq_elemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_funcion(Anasint.Expr_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(Anasint.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(Anasint.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cond(Anasint.Expr_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#comparador_izq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparador_izq(Anasint.Comparador_izqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#comparador_der}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparador_der(Anasint.Comparador_derContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#operadores_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores_log(Anasint.Operadores_logContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link Anasint#devolver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevolver(Anasint.DevolverContext ctx);
}