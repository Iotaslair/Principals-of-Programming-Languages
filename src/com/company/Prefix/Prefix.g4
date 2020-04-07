grammar Prefix;
expr : data | ifstatement;
data : booleanvalue | integervalue | variabledeclaration | variablename;
booleanvalue : val | or | and | not ;
integervalue : integer | add | subtract | multiply;
val : FALSE | TRUE;
or :  'or' OPENPAREN leftexpr=expr CLOSEPAREN  rightexpr=expr || 'or' leftval=val rightexpr=expr;
and : 'and' OPENPAREN leftexpr=expr CLOSEPAREN rightexpr=expr || 'and' leftval=val  rightexpr=expr;
not : 'not' expr;
ifstatement : IF OPENPAREN ifsection=booleanvalue CLOSEPAREN OPENBRACKET thensection=expr CLOSEBRACKET ||
IF OPENPAREN ifsection=booleanvalue CLOSEPAREN OPENBRACKET thensection=expr CLOSEPAREN ELSE OPENBRACKET elsesection=expr CLOSEBRACKET;
variabledeclaration : OPENPAREN varname=VALIDVARIABLENAMES '=' value=data OPENPAREN run=expr CLOSEPAREN CLOSEPAREN;
variablename : varname=VALIDVARIABLENAMES;
integer : intvalue=INTEGER;
add : OPENPAREN left=data '+' right=data CLOSEPAREN;
subtract : OPENPAREN left=data '-' right=data CLOSEPAREN;
multiply : OPENPAREN left=data '*' right=data CLOSEPAREN;
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
INTEGER : [0-9]+;