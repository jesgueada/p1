// Generated from C:/Users/lolim/IdeaProjects/p11/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by the {@code tipoNumerico}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoNumerico(Anasint.TipoNumericoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoLog}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoLog(Anasint.TipoLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoSeqNum}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoSeqNum(Anasint.TipoSeqNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoSeqLog}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoSeqLog(Anasint.TipoSeqLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#seq_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_entera(Anasint.Seq_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#seq_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_logica(Anasint.Seq_logicaContext ctx);
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
	 * Visit a parse tree produced by the {@code funcionAuxFunc}
	 * labeled alternative in {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionAuxFunc(Anasint.FuncionAuxFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcionAuxPred}
	 * labeled alternative in {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionAuxPred(Anasint.FuncionAuxPredContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#parametro_s_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro_s_f(Anasint.Parametro_s_fContext ctx);
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
	 * Visit a parse tree produced by the {@code exprCierto}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCierto(Anasint.ExprCiertoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSeq}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSeq(Anasint.ExprSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNumero}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumero(Anasint.ExprNumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(Anasint.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBin}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBin(Anasint.ExprBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSegunContSeq}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSegunContSeq(Anasint.ExprSegunContSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFalso}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalso(Anasint.ExprFalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLlamadaFunc}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLlamadaFunc(Anasint.ExprLlamadaFuncContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#llamar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_funcion(Anasint.Llamar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#parametros_call_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_call_func(Anasint.Parametros_call_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#v_param_call_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_param_call_func(Anasint.V_param_call_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#v_elems_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_elems_seq(Anasint.V_elems_seqContext ctx);
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