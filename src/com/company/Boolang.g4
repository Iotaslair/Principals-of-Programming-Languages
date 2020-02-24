grammar Boolang;
expr : val | or | and | not;
val : FALSE | TRUE;
FALSE : OPENPAREN* 'false' CLOSEPAREN*;
TRUE : OPENPAREN* 'true' CLOSEPAREN*;
or : '(' expr ')' 'or' expr || val 'or' expr;
and : OPENPAREN* val 'and' expr CLOSEPAREN*;
not : OPENPAREN* 'not' expr CLOSEPAREN*;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
OPENPAREN : '(';
CLOSEPAREN : ')';