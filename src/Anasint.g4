// Analizador sintáctico lenguaje expr
// NUEVO ANASINT --> 05/11/20
// Analizador sintáctico lenguaje expr

parser grammar Anasint;
options{
    tokenVocab=Analex;
}


//programa : PROGRAMA expr EOF;
//expr: variables  (subprogramas)? instrucciones;

programa : PROGRAMA secciones EOF;    // Va bien tener EOF para comprobar errores hasta el final del programa

secciones : variables subprogramas instrucciones;

//DECLARACIÓN DE VARIABLES

variables : VARIABLES (decl_vars)* ;

decl_vars : vars DP tipo PyC;     //ej --> s:SEQ(NUM)

vars: IDENT (COMA vars)?;         // ej: int a,b,c;

tipo: tipo_elemental | tipo_no_elemental;

tipo_elemental : tipo_num | tipo_log;

tipo_num : NUM;

tipo_log : LOG;

tipo_no_elemental : SEQ PA tipo_elemental PC;       // SE HA MODULARIZADO MÁS PARA LOS FUNCIONES Y PREDICADOS

/*
tipo: NUM
    | LOG
    |SEQ (PA (NUM | LOG) PC)?;     // SEQ(Tipo)
*/

//SUBPROGRAMAS

subprogramas : SUBPROGRAMAS (funciones | procedimientos)*;

funciones : FUNCION funcionAux variables instrucciones FFUNCION ;   //INSTRUCCIONES debe contemplar dev a parte de las mismas instrucciones

funcionAux : (funcion | predicado);

funcion : IDENT PA (parametros_e)? PC DEV PA parametros_s_f PC ;        // SI devuelve NUM | SEQ -> func ,sino predicado

predicado : IDENT PA (parametro_e)? PC DEV PA LOG IDENT PC ;

parametros_e : parametro_e (COMA parametros_e)?;
parametro_e : tipo IDENT;                                 //nuestro tipo seq es -> SEQ(NUM)  o SEQ(LOG) != SEQ

/*
parametros_s_f : (NUM | SEQ) IDENT COMA parametros_s_f
		| (NUM | SEQ) IDENT
		;
*/

parametros_s_f : tipo_num | tipo_no_elemental;   // Aqui el xq de la modularización de tipos

procedimientos : PROCEDIMIENTO procedimientoAux variables instrucciones FPROCEDIMIENTO;

procedimientoAux : IDENT PA (parametros_e)? PC ;


//INSTRUCCIONES

instrucciones: INSTRUCCIONES (tipoInstruccion)*; //si es asignacion, condicional, iteracion, ruptura de control,dev resultados, mostrar por consola y aserto
tipoInstruccion: (asignaciones | condiciones | iteracion | ruptura | mostrar | devolver);

//INSTRUCCIONES:ASIGNACIONES
asignaciones: asignacion;

asignacion: IDENT ASIG expr PyC;
expr : (expr_num | expr_log | expr_seq | expr_funcion) ;

expr_num : expr_num (POR | MAS | MENOS ) expr_num
		| expr_num COMA expr_num
		| IDENT
		| NUMERO
		| IDENT CA indice CC
	;                        // Se debe declarar ultima_posicion? ya que devuelve una pos (NUM)

expr_log : IDENT
        | CIERTO
        | FALSO
        | IDENT CA indice CC
    ;

expr_seq : CA (seq_elems)? CC
	    | IDENT
	;

indice	: NUMERO
	    | IDENT
	    | indice (POR | MAS | MENOS) indice
	;

seq_elems : NUMERO (COMA NUMERO)*					//No dice nada de asig multiple para seq
		| (CIERTO | FALSO) (COMA ( CIERTO | FALSO))*
		| IDENT
	;


expr_funcion : IDENT PA (NUMERO | CIERTO | FALSO | IDENT) PC;  //LLamada a una funcion

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
		| expr_funcion
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

devolver : DEV IDENT (COMA IDENT)* PyC;    //El enunciado admite la multiple devolución de variables?????