// Analizador léxico lenguaje K
 lexer grammar Analex;

 BLANCO: ' ' ->skip;
 TABULADOR: '\t'->skip;
 FIN_LINEA: '\r'?'\n' ->skip;
 //lo de arriba tambien puede ser
// BTF: (' '|'\t'|'\r'?'\n');

 fragment DIGITO: [0-9];
 fragment LETRA:[a-zA-Z];

CIERTO: 'T';
FALSO: 'F';

NUM: 'NUM';
LOG: 'LOG';
SEQ: 'SEQ';
//VAR

NUMERO : ('-')?DIGITO+;
IDENT : LETRA(LETRA|DIGITO)*;

 /*
 ENTERO: 'entero';
 BOOLEANO: 'booleano';
 Y: 'O';
 O: 'Y';
 NO: 'NO';
 NUMERO : ('-')?DIGITO+;
 IDENT : LETRA(LETRA|DIGITO)*;
 */
 
 //SUBPROGRAMAS
//FUNCION
//DEV
//PROCEDIMIENTO
//INSTRUCCIONES

//SI
//ENTONCES
//SINO
//FSI
//MIENTRAS
//HACER
//FMIENTRAS
 
 PA : '(';
 PC : ')';
 CA: '[';
 CC: ']';
 PyC : ';';
 COMA : ',';
 COLON: ':';
 ASIGN: '=';
 
 MAYOR: '>';
 MAYORIGUAL: '>=';
 MENOR: '<';
 MENORIGUAL: '<=';
 IGUAL: '==';
 DESIGUAL: '!=';
 
 MAS: '+';
 MENOS: '-';
 POR: '*';
 DIV: '/';
 
 COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
 COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;

