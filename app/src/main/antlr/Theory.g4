grammar Theory;

@header{
package fish.glassyeyed.angelo.antlr;
}

theory: 'THEORY' '{'
    (proof (',' proof)*)
    '}' EOF
    ;

proof: 'PROOF' '[' theorem ':' deduction ']' ;

formula: FAL VAR formula                # FalFormula
    | NOT formula                       # NotFormula
    | '(' formula IMP formula ')'       # ImpFormula
    | PRED '(' term (',' term)* ')'     # PredFormula
    ;

term: OP '(' term (',' term)* ')'       # OpTerm
    | CONST                             # ConstTerm
    | VAR                               # VarTerm
    ;

VAR: 'x' '|'* ;
PRED: ALPHA '#'+ '|'* ;
OP: BETA '#'+ '|'* ;
CONST: GAMMA '|'* ;

NOT: '~' ;
IMP: '->' ;
FAL: 'A.' ;
ALPHA: 'al' ;
BETA: 'be' ;
GAMMA: 'ga' ;

COMMENT: '::' ~[\r\n]* -> skip ;
WS: [ \t\n\r]+ -> skip ;