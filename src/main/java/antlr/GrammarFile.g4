grammar GrammarFile;

program : (smpstatement SEMI)+ ;
smpstatement: assignstatement #assignStmt|   readstatement #resultReadStmt| writestatement #resultWriteStmt;
assignstatement : variable  EQUAL expression #stmtAttrib;
readstatement : READ LPAREN variable (COMMA variable)* RPAREN #readStmt;
writestatement : WRITE LPAREN expression (COMMA expression)* RPAREN #writeStmt;
expression :    term (addop term)* #smplExpression;

term :  factor (multop factor)* #termExpression;
factor: variable #varExpr | ( MINUS )? constant #constantExpr | LPAREN expression RPAREN #multExpr  ;
constant :  DIGIT (DOT DIGIT)*  | ID  ;
addop : PLUS | MINUS  ;
multop : DIV | MULT  ;
variable : ID #varID  ;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

READ : R E A D ;
WRITE : W R I T E ;

LPAREN : '(';
RPAREN: ')';
EQUAL : '=';
PLUS : '+';
MINUS : '-';

MULT : '*';
DIV: '/';

DOT: '.';
COMMA: ',';
SEMI: ';';

ID      : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;
DIGIT  : [0-9]+;
WS     : [ \t\r\n] -> skip  ;