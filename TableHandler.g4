grammar TableHandler;

/*
 *----------------
 *  PARSER RULES
 *----------------
 */

main: stat* EOF;

stat: declaration   DELIMITER
    | assignment    DELIMITER
    | print         DELIMITER
    | condition     DELIMITER
    ;

// Variable declaration
declaration: t=dataType v=VAR ('=' expr)?;

// Variable assignment
assignment: var=VAR '=' e=expr  #assignExpr
    |       var=VAR '=' NULL    #assignNull
    ;

// Print expression to console
print: 'print' expr;

// Contitional statement
condition: ifStatement elseIfList* elseStatement?;

ifStatement: 'if' '(' b=boolExpr ')' conditionBlock;
elseIfList: 'else if' '(' b=boolExpr ')' conditionBlock;
elseStatement: 'else' conditionBlock;

conditionBlock: '{' stat* '}';

//Expressions
expr: n=numExpr
    | b=boolExpr
    | t=tableExpr
    | s=stringExpr
    ;

// TODO: var/table ops
numExpr: e1=numExpr op=('+'|'-') e2=numExpr
    |    e1=numExpr op=('*'|'/') e2=numExpr
    |    '(' e1=numExpr ')'
    ;

boolExpr: e1=boolExpr op=('||'|'&&') e2=boolExpr
    |     e1=boolExpr op=('=='|'!=') e2=boolExpr
    |     '(' e1=boolExpr ')'
    ;

// TODO: compare vars
compareExpr: e1=numExpr op=('=='|'!='|'<'|'>'|'<='|'>=') e2=numExpr;

// TODO: Tables as vars
tableExpr: 
    ;

// TODO: Strings as vars
stringExpr: '(' t1=stringExpr ')'
    |       t2=STRING
    ;

filename: STRING '.' 'csv';

open: 'open' filename;

// Para alterar
dataType: 'int'
        | 'table' 
        | 'boolean'
        | 'char'
        ;

/*
 *----------------
 *  LEXER RULES
 *----------------
 */

NULL: 'null';
INTEGER: [0-9]+;
BOOLEAN: 'false' | 'true';
DELIMITER: ';';
ID: [a-zA-Z]+;
VAR: [a-zA-Z0-9]+;
STRING: [a-zA-Z0-9]+;
WS: [ \t\r\n]+ -> skip;