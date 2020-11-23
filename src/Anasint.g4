// Analizador sintáctico lenguaje expr
// NUEVO ANASINT --> 05/11/20
// Analizador sintáctico lenguaje expr

parser grammar Anasint;
options{
    tokenVocab=Analex;
}

//programa : PROGRAMA expr EOF;
//expr: variables  (subprogramas)? instrucciones;

programa : PROGRAMA secciones EOF;

secciones : variables subprogramas instrucciones;

//DECLARACIÓN DE VARIABLES

variables : VARIABLES (decl_vars)* ;

decl_vars : vars DP tipo PyC;     //ej --> s:SEQ(NUM)

vars: IDENT COMA vars
        | IDENT
    ;         // ej: int a,b,c;    modificado para semantico

tipo: NUM               #tipoNumerico
    | LOG               #tipoLog
    | seq_entera        #tipoSeqNum
    | seq_logica        #tipoSeqLog
    ;

seq_entera : SEQ PA NUM PC;
seq_logica : SEQ PA LOG PC;     // SE HA MODULARIZADO PARA LOS FUNCIONES Y PREDICADOS

/*
tipo: NUM
    | LOG
    |SEQ (PA (NUM | LOG) PC)?;     // SEQ(Tipo)
*/

//SUBPROGRAMAS

subprogramas : SUBPROGRAMAS (funciones | procedimientos)*;

funciones : FUNCION funcionAux variables instrucciones FFUNCION ;

funcionAux : funcion           #funcionAuxFunc
            | predicado         #funcionAuxPred
            ;

funcion : IDENT PA (parametros_e)? PC DEV PA parametros_s_f PC ;        // SI devuelve NUM | SEQ -> func ,sino predicado

predicado : IDENT PA (parametro_e)? PC DEV PA LOG IDENT PC ;

parametros_e : parametro_e (COMA parametros_e)*;
parametro_e : tipo IDENT;
/*
parametros_s_f : (NUM | SEQ) IDENT COMA parametros_s_f
		| (NUM | SEQ) IDENT
		;
*/
parametros_s_f : parametro_s_f (COMA parametros_s_f)?  ;
parametro_s_f   : (NUM | seq_entera | seq_logica) IDENT;     // Aqui el xq de la modularización de tipos -->MODIFICADO

procedimientos : PROCEDIMIENTO procedimientoAux variables instrucciones FPROCEDIMIENTO;

procedimientoAux : IDENT PA (parametros_e)? PC ;


//INSTRUCCIONES

instrucciones: INSTRUCCIONES (tipoInstruccion)*;
tipoInstruccion: (asignaciones | condiciones | iteracion | ruptura | mostrar | devolver);

//INSTRUCCIONES:ASIGNACIONES
asignaciones: asignacion;

asignacion: IDENT (COMA IDENT)* ASIG expr PyC;                              //MODIFICADO <-  admitir multiples variables

/* expr_num,exprlog expr_seq coinciden en IDENT,INDENT[indice]
   como antlr va por jerarquia siempre pasaria como exp_num.....  t.t
expr : (expr_num | expr_log | expr_seq | llamar_funcion) ;                  //expr_func -> llamar_funcion -> MODIFICADO

expr_num : expr_num (POR | MAS | MENOS ) expr_num       #exprNumBin
		| expr_num COMA expr_num                        #exprNumBin
		| IDENT                                         #exprNumVar
		| NUMERO                                        #exprNumNum
		| IDENT CA indice CC                            #exprNumSec
	;                        // Se debe declarar ultima_posicion? ya que devuelve una pos (NUM)

expr_log : IDENT                                        #exprLogVar
        | CIERTO                                        #exprLogCierto
        | FALSO                                         #exprLogFalso
        | IDENT CA indice CC                            #exprLogSec
    ;

expr_seq : CA (seq_elems)? CC                           #exprSeqSeq
	    | IDENT                                         #exprSeqSeq
	;

indice	: NUMERO
	    | IDENT
	    | indice (POR | MAS | MENOS) indice
	;

seq_elems : NUMERO (COMA NUMERO)*					//No dice nada de asig multiple para seq
		| (CIERTO | FALSO) (COMA ( CIERTO | FALSO))*
		| IDENT
	;
*/

expr : expr (POR | MAS | MENOS) expr        #exprBin
        | expr COMA expr                    #exprBin
        | IDENT CA indice CC                #exprSegunContSeq
        | IDENT                             #exprVar
        | NUMERO                            #exprNumero
        | CIERTO                            #exprCierto
        | FALSO                             #exprFalso
        | CA (seq_elems)? CC                #exprSeq
        | llamar_funcion                    #exprLlamadaFunc
        ;

indice	: NUMERO
	    | IDENT
	    | indice (POR | MAS | MENOS) indice
	;

seq_elems : NUMERO (COMA NUMERO)*					//No dice nada de asig multiple para seq
		| (CIERTO | FALSO) (COMA ( CIERTO | FALSO))*
	;

//INTRUCCIONES: LLAMAR_FUNCION

llamar_funcion : IDENT PA llamar_funcion PC         // funcion anidada f(f(x))
                | IDENT PA parametros_call_func PC
                ;

parametros_call_func : v_param_call_func (COMA v_param_call_func)*
                     | ()
                 ;

v_param_call_func :  NUMERO
                    | CIERTO
                    | FALSO
                    | IDENT
                    | CA (v_elems_seq) CC
                ;

v_elems_seq : NUMERO (COMA NUMERO)*
            | (CIERTO | FALSO) (COMA ( CIERTO | FALSO))*
        ;

//INSTRUCCIONES: CONDICIONAL

condiciones: SI PA expr_cond PC ENTONCES bloque (SINO bloque)? FSI ;

bloque : (tipoInstruccion)* ;

expr_cond : comparador_izq operadores_log comparador_der ((CONJUNCION | DISYUNCION) expr_cond)?       //(....) ?  : concatenar condiciones
	;

comparador_izq	: IDENT
		| NUMERO
		| IDENT CA indice CC   // S[i+1]
	;

comparador_der	: NUMERO
		| CIERTO
		| FALSO
		| IDENT
		| llamar_funcion
	;

operadores_log	: ( IGUAL | DISTINTO | MENOR | MAYOR | MENORIGUAL | MAYORIGUAL )
	;

//INSTRUCCIONES: ITERACIÓN

iteracion : MIENTRAS PA expr_cond PC HACER (tipoInstruccion)* FMIENTRAS;

//INSTRUCCIONES:RUPTURA

ruptura : RUPTURA PyC;

//INSTRUCCIONES:MOSTRAR

mostrar : MOSTRAR PA IDENT (COMA IDENT)? PC PyC ;

//INSTRUCCIONES:DEVOLVER

devolver : DEV IDENT (COMA IDENT)* PyC
            | DEV (CIERTO | FALSO) PyC
            | DEV NUMERO PyC
            ;    //El enunciado admite la multiple devolución de variables?????
