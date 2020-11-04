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
//ASIG: ':';
 ENTERO: 'entero';
 BOOLEANO: 'booleano';
 Y: 'O';
 O: 'Y';
 NO: 'NO';
 NUMERO : ('-')?DIGITO+;
 IDENT : LETRA(LETRA|DIGITO)*;
 PA : '(';
 PC : ')';
 CA: '[';
 CC: ']';
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

