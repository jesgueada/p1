// Analizador sintáctico lenguaje expr
parser grammar Anasint;
options{
    tokenVocab=Analex;
}

programa : PROGRAMA expr EOF;

variables : VARIABLES (decl_vars) * ;


vars: IDENT (COMA vars)?;// ej: int a,b,c;

tipo: NUM
    | LOG
    |SEQ PA tipo PC;

decl_vars : tipo vars PyC
          | vars DP tipo PyC;//ej --> s.SEQ(NUM)

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
tipoInstruccion: (asignacion | condicional | iteracion | ruptura | mostrar );

asignacion: tipoAsignacion (COMA asignacion)?;

tipoAsignacion: NUM | funciones | expreciones | sec_elementos;
funciones: IDENT PA (vars | NUM | tipoLog) PC;
expreciones: exprecionAux;

exprecionAux: MENOS? (NUM | IDENT | PA exprecionAux PC)
              |exprecionAux (MAS | MENOS |POR |DIVISION) exprecionAux;
tipoLog: T | F;

sec_elementos: CA CC | CA sec_elem CC;//Lista vacia y lista no vacia
sec_elem: NUM (COMA sec_elem)?;

condicional: ;




