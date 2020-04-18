grammar Prefix;
expr : data | ifstatement;
data :  functiondeclaration | integervalue | variablename | functioncall | variabledeclaration | booleanvalue;
booleanvalue : val | not | or | and;
integervalue : integer | add | subtract | multiply;
val : FALSE | TRUE;
ifstatement : IF OPENPAREN ifsection=booleanvalue CLOSEPAREN OPENBRACKET thensection=expr CLOSEBRACKET ||
IF OPENPAREN ifsection=booleanvalue CLOSEPAREN OPENBRACKET thensection=expr CLOSEPAREN ELSE OPENBRACKET elsesection=expr CLOSEBRACKET;
variabledeclaration : OPENPAREN varname=variablename '=' value=data OPENPAREN run=expr CLOSEPAREN CLOSEPAREN;
variablename : varname=VALIDVARIABLENAMES;
integer : intvalue=INTEGER;
add : OPENPAREN left=expr '+' right=expr CLOSEPAREN;
subtract : OPENPAREN left=expr '-' right=expr CLOSEPAREN;
multiply : OPENPAREN left=expr '*' right=expr CLOSEPAREN;
functiondeclaration : OPENPAREN DEF functionname=variablename variable=variablename OPENPAREN functionbody=expr
run=expr CLOSEPAREN CLOSEPAREN;
functioncall : CALL functionname=variablename variable=expr;
or :  OR OPENPAREN leftexpr=expr CLOSEPAREN  rightexpr=expr || OR leftval=val rightexpr=expr;
and : AND OPENPAREN leftexpr=expr CLOSEPAREN rightexpr=expr || AND leftval=val  rightexpr=expr;
not : NOT expr;
OR : 'or';
AND : 'and';
NOT : 'not';
FALSE : 'false';
TRUE : 'true';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
OPENPAREN : '(';
CLOSEPAREN : ')';
IF : 'if';
OPENBRACKET : '{';
CLOSEBRACKET : '}';
ELSE : 'else';
DEF : 'def';
CALL : 'call';
VALIDVARIABLENAMES : [a-zA-Z][a-zA-Z0-9]*;
INTEGER : [0-9]+;