// Analizador sintáctico lenguaje expr
// NUEVO ANASINT --> 05/11/20
// Analizador sintáctico lenguaje expr

parser grammar Anasint;
options{
    tokenVocab=Analex;
}


//programa : PROGRAMA expr EOF;
//expr: variables  (subprogramas)? instrucciones;

programa : PROGRAMA secciones;    // Va bien tener EOF para comprobar errores hasta el final del programa

secciones : variables subprogramas instrucciones;     // expr -> secciones

variables : VARIABLES (decl_vars)* ;

decl_vars : tipo vars PyC
          | vars DP tipo PyC;//ej --> s:SEQ(NUM)

vars: IDENT (COMA vars)?;// ej: int a,b,c;

tipo: NUM
    | LOG
    |SEQ (PA tipo PC)?;



//SUBPROGRAMAS
subprogramas : SUBPROGRAMAS (funciones | procedimientos)*;

funciones : FUNCION funcionAux variables instrucciones FFUNCION ;   //INSTRUCCIONES debe contemplar dev a parte de las mismas instrucciones

funcionAux : (funcion | predicado);

funcion : IDENT PA (parametros_e)? PC DEV PA parametros_s_f PC ;        // SI devuelve NUM | SEQ -> func ,sino predicado

predicado : IDENT PA (parametro_e)? PC DEV PA LOG IDENT PC ;

parametros_e : parametro_e (COMA parametros_e)?;
parametro_e : (NUM | LOG | SEQ) IDENT;                                 //nuestro tipo seq es -> SEQ(NUM)  o SEQ(LOG) != SEQ

parametros_s_f : (NUM | SEQ) IDENT COMA parametros_s_f
		| (NUM | SEQ) IDENT
		;

procedimientos : PROCEDIMIENTO procedimientoAux variables instrucciones FPROCEDIMIENTO;

procedimientoAux : IDENT PA (parametros_e)? PC ;


//INSTRUCCIONES

instrucciones: INSTRUCCIONES (tipoInstruccion)*; //si es asignacion, condicional, iteracion, ruptura de control,dev resultados, mostrar por consola y aserto
tipoInstruccion: (asignaciones | condiciones | iteracion | ruptura | mostrar );

asignaciones: asignacion;

asignacion: IDENT ASIG expr PyC;
expr : (expr_num | expr_log | expr_seq | expr_funcion) ;

expr_num : expr_num (POR | MAS | MENOS ) expr_num
		| expr_num COMA expr_num
		| IDENT
		| NUMERO
		| IDENT CA IDENT CC
	;                        // Se debe declarar ultima_posicion? ya que devuelve una pos (NUM)

expr_log : IDENT | CIERTO | FALSO | IDENT CA IDENT CC;

expr_seq : CA (seq_elems)? CC
	| IDENT
	;

seq_elems : NUMERO (COMA NUMERO)*					//No dice nada de asig multiple para seq
		| (CIERTO | FALSO) (COMA ( CIERTO | FALSO))*
		| IDENT
	;


expr_funcion : IDENT PA (NUMERO | CIERTO | FALSO | IDENT) PC;

//lista: CA (seq_elems)? CC;

//funciones: IDENT PA (vars | NUM | tipoLog) PC;

//tipoLog: CIERTO | FALSO;

//seq_elems: (expr2) (COMA seq_elems)?;
//sec_elementos: CA CC | CA sec_elem CC;//Lista vacia y lista no vacia
//sec_elem: NUM (COMA sec_elem)?;

condiciones: SI PA expr_cond PC ENTONCES bloque (SINO bloque)? FSI ;

bloque : (asignaciones | devolver )* ;

devolver : DEV IDENT (COMA IDENT)* PyC;

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

indice	: NUMERO
	| IDENT
	| indice (POR | MAS | MENOS) indice
	;


operadores_log	: ( IGUAL | DISTINTO | MENOR | MAYOR | MENORIGUAL | MAYORIGUAL )
	;



iteracion : MIENTRAS PA expr_cond PC HACER (tipoInstruccion)* FMIENTRAS;

ruptura : RUPTURA PyC;

mostrar : MOSTRAR PA IDENT (COMA IDENT)? PC PyC ;







//// ANTIGUO ANASINT --> 04/11/20
/*parser grammar Anasint;
options{
    tokenVocab=Analex;
}

programa : PROGRAMA expr EOF;
expr: variables  (subprogramas)? instrucciones;

variables : VARIABLES (decl_vars)* ;

vars: IDENT (COMA vars)?;// ej: int a,b,c;

tipo: NUM
    | LOG
    |SEQ PA tipo PC;

decl_vars : tipo vars PyC
          | vars DP tipo PyC;//ej --> s:SEQ(NUM)

//SUBPROGRAMAS
subprogramas: SUBPROGRAMAS (funcionOpredicado | procedimiento)*;

funcionOpredicado: funcion | predicado;

funcion: FUNCION funcionAux variables instrucciones DEV vars PyC FFUNCION ;
funcionAux: IDENT PA (parametro)? PC DEV PA parametro PC;
parametro: tipo IDENT (COMA parametro)?;

predicado: FUNCION predicadoAux variables instrucciones (DEV tipoLog PyC)? FFUNCION;
predicadoAux: IDENT PA (parametro)? PC DEV PA LOG IDENT PC;

procedimiento: PROCEDIMIENTO procedimientoAux variables instrucciones FPROCEDIMIENTO;
procedimientoAux: IDENT PA ( parametro)? PC;

//INSTRUCCIONES

instrucciones: INSTRUCCIONES (tipoInstruccion)*; //si es asignacion, condicional, iteracion, ruptura de control,dev resultados, mostrar por consola y aserto
tipoInstruccion: (asignaciones | condiciones | iteracion | ruptura | mostrar );

asignaciones: ASIGNACIONES (asignacion)*;

asignacion: IDENT ASIG expr_arit PyC;
expr_arit: expr1 (MAS | MENOS) expr_arit
 | expr1 ;

expr1: expr2 (POR|DIV) expr1
 |expr2 ;

expr2: NUM CA expr_arit CC | PA expr_arit PC | MENOS expr_arit | funciones | sec_elementos | NUM | IDENT ;

funciones: IDENT PA (vars | NUM | tipoLog) PC;

tipoLog: CIERTO | FALSO;

sec_elementos: CA CC | CA sec_elem CC;//Lista vacia y lista no vacia
sec_elem: NUM (COMA sec_elem)?;

condiciones: SI PA expr_cond PC ENTONCES (asignacion | sino | dev)* FSI;
expr_cond: condicion
            | NEGACION expr_cond
            |expr_cond (CONJUNCION | DISYUNCION) expr_cond;
condicion: tipo_cond (operadorLog)?;
tipo_cond: expr_arit
           |sec_elementos
           |funciones;

sino: SINO (asignacion | dev)*;
operadorLog:(MAYOR | MENOR| IGUAL | DISTINTO | MENORIGUAL | MAYORIGUAL);
dev: DEV vars PyC
   | DEV tipoLog PyC;
iteracion: MIENTRAS PA expr_cond PC HACER (tipoInstruccion) FMIENTRAS;
ruptura: MIENTRAS PA expr_cond PC HACER RUPTURA FMIENTRAS;
mostrar: MOSTRAR PA vars PC PyC;


*/
