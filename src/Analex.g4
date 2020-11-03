// Analizador léxico lenguaje K
 lexer grammar Analex;

 BLANCO: ' ' ->skip;
 TABULADOR: '\t'->skip;
 FIN_LINEA: '\r'?'\n' ->skip;

 fragment DIGITO: [0-9];
 fragment LETRA:[a-zA-Z];

 CIERTO: 'cierto';
 FALSO: 'falso';
 ENTERO: 'entero';
 BOOLEANO: 'booleano';
 Y: 'O';
 O: 'Y';
 NO: 'NO';
 NUMERO : ('-')?DIGITO+;
 IDENT : LETRA(LETRA|DIGITO)*;
 PA : '(';
 PC : ')';

 PyC : ';';
 COMA : ',';
 ASIG: '=';
 MAYOR: '>';
 MENOR: '<';
 IGUAL: '==';
 MAS: '+';
 MENOS: '-';
 POR: '*';
 DIV: '/';
 COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
 COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;


//// AÑADIDO ->


/*
BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];

CIERTO: 'T';
FALSO: 'F';
NUM: 'NUM';
LOG: 'LOG';
SEQ: 'SEQ';
ASIG: ':';
PA: '(';
PC: ')';
CA: '[';
CC: ']';
PyC: ';';
COMA: ',';
POR: '*';
MAS: '+';
MENOS: '-';
DIV: '/';
MAYOR: '>';
MENOR: '<';
IGUAL: '==';
COMENTARIO_LINEA : '//' .*?
FIN_LINEA -> skip ;
COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;

*/