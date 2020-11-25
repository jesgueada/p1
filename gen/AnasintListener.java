// Generated from C:/Users/lolim/IdeaProjects/p11/src\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#secciones}.
	 * @param ctx the parse tree
	 */
	void enterSecciones(Anasint.SeccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secciones}.
	 * @param ctx the parse tree
	 */
	void exitSecciones(Anasint.SeccionesContext ctx);
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
	 * Enter a parse tree produced by the {@code tipoNumerico}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoNumerico(Anasint.TipoNumericoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoNumerico}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoNumerico(Anasint.TipoNumericoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoLog}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoLog(Anasint.TipoLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoLog}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoLog(Anasint.TipoLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoSeqNum}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoSeqNum(Anasint.TipoSeqNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoSeqNum}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoSeqNum(Anasint.TipoSeqNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoSeqLog}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoSeqLog(Anasint.TipoSeqLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoSeqLog}
	 * labeled alternative in {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoSeqLog(Anasint.TipoSeqLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#seq_entera}.
	 * @param ctx the parse tree
	 */
	void enterSeq_entera(Anasint.Seq_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#seq_entera}.
	 * @param ctx the parse tree
	 */
	void exitSeq_entera(Anasint.Seq_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#seq_logica}.
	 * @param ctx the parse tree
	 */
	void enterSeq_logica(Anasint.Seq_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#seq_logica}.
	 * @param ctx the parse tree
	 */
	void exitSeq_logica(Anasint.Seq_logicaContext ctx);
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
	 * Enter a parse tree produced by the {@code funcionAuxFunc}
	 * labeled alternative in {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 */
	void enterFuncionAuxFunc(Anasint.FuncionAuxFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcionAuxFunc}
	 * labeled alternative in {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 */
	void exitFuncionAuxFunc(Anasint.FuncionAuxFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcionAuxPred}
	 * labeled alternative in {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 */
	void enterFuncionAuxPred(Anasint.FuncionAuxPredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcionAuxPred}
	 * labeled alternative in {@link Anasint#funcionAux}.
	 * @param ctx the parse tree
	 */
	void exitFuncionAuxPred(Anasint.FuncionAuxPredContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#parametros_e}.
	 * @param ctx the parse tree
	 */
	void enterParametros_e(Anasint.Parametros_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#parametros_e}.
	 * @param ctx the parse tree
	 */
	void exitParametros_e(Anasint.Parametros_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#parametro_e}.
	 * @param ctx the parse tree
	 */
	void enterParametro_e(Anasint.Parametro_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#parametro_e}.
	 * @param ctx the parse tree
	 */
	void exitParametro_e(Anasint.Parametro_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#parametros_s_f}.
	 * @param ctx the parse tree
	 */
	void enterParametros_s_f(Anasint.Parametros_s_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#parametros_s_f}.
	 * @param ctx the parse tree
	 */
	void exitParametros_s_f(Anasint.Parametros_s_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#parametro_s_f}.
	 * @param ctx the parse tree
	 */
	void enterParametro_s_f(Anasint.Parametro_s_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#parametro_s_f}.
	 * @param ctx the parse tree
	 */
	void exitParametro_s_f(Anasint.Parametro_s_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#procedimientos}.
	 * @param ctx the parse tree
	 */
	void enterProcedimientos(Anasint.ProcedimientosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#procedimientos}.
	 * @param ctx the parse tree
	 */
	void exitProcedimientos(Anasint.ProcedimientosContext ctx);
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
	 * Enter a parse tree produced by the {@code exprCierto}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCierto(Anasint.ExprCiertoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCierto}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCierto(Anasint.ExprCiertoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSeq}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSeq(Anasint.ExprSeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSeq}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSeq(Anasint.ExprSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNumero}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumero(Anasint.ExprNumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNumero}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumero(Anasint.ExprNumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(Anasint.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(Anasint.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBin}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBin(Anasint.ExprBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBin}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBin(Anasint.ExprBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSegunContSeq}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSegunContSeq(Anasint.ExprSegunContSeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSegunContSeq}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSegunContSeq(Anasint.ExprSegunContSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFalso}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFalso(Anasint.ExprFalsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFalso}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFalso(Anasint.ExprFalsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLlamadaFunc}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLlamadaFunc(Anasint.ExprLlamadaFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLlamadaFunc}
	 * labeled alternative in {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLlamadaFunc(Anasint.ExprLlamadaFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#indice}.
	 * @param ctx the parse tree
	 */
	void enterIndice(Anasint.IndiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#indice}.
	 * @param ctx the parse tree
	 */
	void exitIndice(Anasint.IndiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#seq_elems}.
	 * @param ctx the parse tree
	 */
	void enterSeq_elems(Anasint.Seq_elemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#seq_elems}.
	 * @param ctx the parse tree
	 */
	void exitSeq_elems(Anasint.Seq_elemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_funcion(Anasint.Llamar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_funcion(Anasint.Llamar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#parametros_call_func}.
	 * @param ctx the parse tree
	 */
	void enterParametros_call_func(Anasint.Parametros_call_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#parametros_call_func}.
	 * @param ctx the parse tree
	 */
	void exitParametros_call_func(Anasint.Parametros_call_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#v_param_call_func}.
	 * @param ctx the parse tree
	 */
	void enterV_param_call_func(Anasint.V_param_call_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#v_param_call_func}.
	 * @param ctx the parse tree
	 */
	void exitV_param_call_func(Anasint.V_param_call_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#v_elems_seq}.
	 * @param ctx the parse tree
	 */
	void enterV_elems_seq(Anasint.V_elems_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#v_elems_seq}.
	 * @param ctx the parse tree
	 */
	void exitV_elems_seq(Anasint.V_elems_seqContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(Anasint.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(Anasint.BloqueContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#comparador_izq}.
	 * @param ctx the parse tree
	 */
	void enterComparador_izq(Anasint.Comparador_izqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#comparador_izq}.
	 * @param ctx the parse tree
	 */
	void exitComparador_izq(Anasint.Comparador_izqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#comparador_der}.
	 * @param ctx the parse tree
	 */
	void enterComparador_der(Anasint.Comparador_derContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#comparador_der}.
	 * @param ctx the parse tree
	 */
	void exitComparador_der(Anasint.Comparador_derContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#operadores_log}.
	 * @param ctx the parse tree
	 */
	void enterOperadores_log(Anasint.Operadores_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#operadores_log}.
	 * @param ctx the parse tree
	 */
	void exitOperadores_log(Anasint.Operadores_logContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link Anasint#devolver}.
	 * @param ctx the parse tree
	 */
	void enterDevolver(Anasint.DevolverContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#devolver}.
	 * @param ctx the parse tree
	 */
	void exitDevolver(Anasint.DevolverContext ctx);
}