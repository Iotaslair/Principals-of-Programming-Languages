grammar Boolang;
expr : val | or | and | not;
val : FALSE | TRUE;
FALSE : 'false';
TRUE : 'true';
or : OPENPAREN leftexpr=expr CLOSEPAREN 'or' rightexpr=expr || leftval=val 'or' rightexpr=expr;
and : OPENPAREN leftexpr=expr CLOSEPAREN 'and' rightexpr=expr || leftval=val  'and' rightexpr=expr;
not : 'not' expr;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
OPENPAREN : '(';
CLOSEPAREN : ')';