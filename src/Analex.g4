// Analizador léxico lenguaje K
 lexer grammar Analex;

 BLANCO: ' ' ->skip;
 TABULADOR: '\t'->skip;
 FIN_LINEA: '\r'?'\n' ->skip;
 //lo de arriba tambien puede ser
// BTF: (' '|'\t'|'\r'?'\n');

 fragment DIGITO: [0-9];

 fragment LETRA:[a-zA-Z];


NUM: 'NUM';
LOG: 'LOG';
SEQ: 'SEQ';

 PROGRAMA: 'PROGRAMA';
 VARIABLES: 'VARIABLES';
 SUBPROGRAMAS: 'SUBPROGRAMAS';
 FUNCION: 'FUNCION';
 FFUNCION: 'FFUNCION';
 PROCEDIMIENTO: 'PROCEDIMIENTO';
 FPROCEDIMIENTO: 'FPROCEDIMIENTO';
 INSTRUCCIONES: 'INSTRUCCIONES';
 // ASIGNACIONES: 'ASIGNACIONES';
 MOSTRAR: 'mostrar';
 RUPTURA: 'ruptura';
 DEV: 'dev';
 CIERTO: 'T';
 FALSO: 'F';

 NUMERO : ('-')?DIGITO+;


 PA : '(';
 PC : ')';
 CA: '[';
 CC: ']';
 PyC : ';';
 COMA : ',';
 ASIG: '=';
 DP: ':';

 MAYOR: '>';
 MENOR: '<';
 IGUAL: '==';
 DISTINTO: '!=';
 MENORIGUAL: '<=';
 MAYORIGUAL: '>=';

 CONJUNCION: '&&';
 DISYUNCION: '||';
 NEGACION: '!';

 MAS: '+';
 MENOS: '-';
 POR: '*';
 DIV: '/';

 SI: 'si';
 SINO: 'sino';
 ENTONCES: 'entonces';
 FSI: 'fsi';

 MIENTRAS: 'mientras';
 FMIENTRAS: 'fmientras';
 HACER: 'hacer';
 BARRABAJA: '_';

 IDENT : LETRA(LETRA|DIGITO|BARRABAJA)*;

 COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
 COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;