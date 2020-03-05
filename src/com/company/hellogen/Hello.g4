grammar Hello;
r  : 'hello' n=ID ;         // match keyword hello followed by an identifier
ID : [a-z]+;             // match lower-case
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines