grammar Prefix;
expr : booleanvalue | ifstatement;
booleanvalue : val | or | and | not | variable | variablename;
val : FALSE | TRUE;
or :  'or' OPENPAREN leftexpr=expr CLOSEPAREN  rightexpr=expr || 'or' leftval=val rightexpr=expr;
and : 'and' OPENPAREN leftexpr=expr CLOSEPAREN rightexpr=expr || 'and' leftval=val  rightexpr=expr;
not : 'not' expr;
ifstatement : IF OPENPAREN ifsection=booleanvalue CLOSEPAREN OPENBRACKET thensection=expr CLOSEBRACKET ||
IF OPENPAREN ifsection=booleanvalue CLOSEPAREN OPENBRACKET thensection=expr CLOSEPAREN ELSE OPENBRACKET elsesection=expr CLOSEBRACKET;
variable : OPENPAREN varname=VALIDVARIABLENAMES '=' value=booleanvalue OPENPAREN run=expr CLOSEPAREN CLOSEPAREN;
variablename : varname=VALIDVARIABLENAMES;
FALSE : 'false';
TRUE : 'true';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
OPENPAREN : '(';
CLOSEPAREN : ')';
IF : 'if';
OPENBRACKET : '{';
CLOSEBRACKET : '}';
ELSE : 'else';
VALIDVARIABLENAMES : [a-zA-Z][a-zA-Z0-9]*;