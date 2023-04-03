grammar Angelo;

@header{
package fish.glassyeyed.angelo.antlr;
}

prog_r: '"' wff_r '"' EOF               # Program
    ;

wff_r: ID                               # AtomicWff
    | NOT wff_r                         # NegWff
    | '(' wff_r IMP wff_r ')'           # ImpWff
    ;

NOT: '~' ;
IMP: '->' ;

ID: [A-Z][a-zA-Z]* ;

COMMENT: '#' ~[\r\n]* -> skip ;
WS: [ \t\n\r]+ -> skip ;