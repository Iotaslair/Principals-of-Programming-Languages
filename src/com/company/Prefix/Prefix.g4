grammar Prefix;
expr : boolean | if;
boolean : val | or | and | not;
val : FALSE | TRUE;
or :  'or' OPENPAREN leftexpr=expr CLOSEPAREN  rightexpr=expr || 'or' leftval=val rightexpr=expr;
and : 'and' OPENPAREN leftexpr=expr CLOSEPAREN rightexpr=expr || 'and' leftval=val  rightexpr=expr;
not : 'not' expr;
if : IF OPENPAREN boolean CLOSEPAREN OPENBRACKET thensection=expr* CLOSEBRACKET |
IF OPENPAREN boolean CLOSEPAREN OPENBRACKET thensection=expr+ CLOSEPAREN ELSE OPENBRACKET elsesection=expr* CLOSEBRACKET;
FALSE : 'false';
TRUE : 'true';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
OPENPAREN : '(';
CLOSEPAREN : ')';
IF : 'if';
OPENBRACKET : '{';
CLOSEBRACKET : '}';
ELSE : 'else';