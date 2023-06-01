grammar Angelo;

@header{
package fish.glassyeyed.angelo.antlr;
}

prog_r: stmt_r+ EOF               # Program
    ;

stmt_r: wff_r ';'                       # Statement
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