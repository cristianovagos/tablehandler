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
    | tableExpr     DELIMITER
    ;

// Variable declaration
declaration: t=dataType var=ID;

// Variable assignment
assignment: var=ID '=' e=expr;

// Print expression to console
print: 'print' e1=expr;

// Contitional statement
condition: ifStatement elseIfList* elseStatement?;

ifStatement: 'if' '(' b=boolExpr ')' conditionBlock;
elseIfList: 'else if' '(' b=boolExpr ')' conditionBlock;
elseStatement: 'else' conditionBlock;
conditionBlock: '{' stat* '}';

//Expressions
expr: n=numExpr
    | b=boolExpr
    | s=stringExpr
    | t=tableExpr
    ;

// Number expressions
numExpr: e3=INTEGER                                     #Int
    |    e1=numExpr op=('+'|'-'|'*'|'/') e2=numExpr     #Arithm
    |    '(' e1=numExpr ')'                             #Par
    |    e4=DOUBLE                                      #Double
    |    v=ID                                           #Var
    ;

// Boolean expressions
boolExpr: e1=boolExpr op=('||'|'&&'|'=='|'!=') e2=boolExpr  #BoolExprRelOp
    |     '(' e1=boolExpr ')'                               #BoolPar
    |     b=BOOLEAN                                         #Bool
    |     v=ID                                              #BoolVar
    ;

// Compare expressions
compareExpr: e1=numExpr op=('=='|'!='|'<'|'>'|'<='|'>=') e2=numExpr;

// Tables
tableExpr: 'table(' 
    (      n=newTable
    |      a1=addRow
    |      a2=addRowFrom
    |      r1=remRow
    |      v=getValue
    |      s=setValue
    |      c=clearRow
    |      r2=removeRow
    |      a3=addCol
    |      a4=addColFrom
    |      r3=remCol
    |      c2=clearField
    |      x1=numColumns
    |      x2=numRows
    |      u1=uniqueCol
    |      g1=getCol
    |      g2=getRow
    |      g3=getHeaderIndex
    |      s2=subTableCol
    |      s3=subTableCol2
    |      s4=subTableRow
    |      s5=subTableRow2
    |      ad=add
    |      su=sub
    |      sr=sort
    |      sd=sortDesc
    |      eq=equals
    |      ex=export
    |      pr=printTable
    |      prf=printFirst
    |      prl=printLast
    )      ')'
    ;

// Table operations base on Table.java
newTable: 'read' f=file 'to' v=ID;      //checked
addRow: 'add row' r=STRING 'to' v=ID;      //checked
addRowFrom: 'add row' r=STRING 'at' i=INTEGER 'to' v=ID;    //checked
remRow: 'remove row at' i=INTEGER 'from' v=ID;  //checked
getValue: 'get value(' x=INTEGER ',' y=INTEGER ') from' v=ID;   //missing return
setValue: 'insert into' v=ID 'value=' s1=expr 'at cell(' x=INTEGER ',' y=INTEGER ')';   //checked
clearRow: 'clear row at' i=INTEGER 'from' v=ID; //checked
removeRow: 'remove row at' i=INTEGER 'from' v=ID;   //checked
addCol: 'add column' c=STRING 'to' v=ID;    //checked
addColFrom: 'add column' c=STRING 'at' i=INTEGER 'to' v=ID; //checked
remCol: 'remove column at' i=INTEGER 'from' v=ID;
clearField: 'clear field(' x=INTEGER ',' y=INTEGER ') from' v=ID;
numColumns: 'get col size from' v=ID; //missing return
numRows: 'get row size from' v=ID;    //missing return
uniqueCol: 'get unique column from' v=ID 'at' i=INTEGER;            //return list****
getCol: 'get column from' ID 'at' INTEGER 'header =' b1=boolExpr;   //return list****
getRow: 'get row from' ID 'at' INTEGER;                             //return list
getHeaderIndex: 'get index from' v=ID 'of value =' s1=stringExpr;    //return int
subTableCol: 'col-subtable from' v=ID 'start=' s=INTEGER 'end=' e=INTEGER;
subTableCol2: 'col-subtable from' v=ID 'start=' s=INTEGER;
subTableRow: 'row-subtable from' v=ID 'start=' s=INTEGER 'end=' e=INTEGER;
subTableRow2: 'row-subtable from' v=ID 'start=' s=INTEGER;
add: 'add' v1=ID 'with' v2=ID;
sub: 'subtract' v1=ID 'with' v2=ID;
sort: 'sort' v=ID;
sortDesc: 'sort descendent' v=ID;
equals: v1=ID 'equals' v2=ID;                   //return boolean
export: 'export' v=ID 'to' f=file;
printTable: 'print' v=ID;
printFirst: 'print first' i=INTEGER 'lines of' v=ID;
printLast: 'print last' i=INTEGER 'lines of' v=ID;

//fragments
file: ID '.csv';

// String expressions
stringExpr: t1=STRING                           #String
    |       '(' t2=stringExpr ')'               #StringPar
    |       NULL                                #StringNull
    ;
    
dataType: 'int'
        | 'double'
        | 'table' 
        | 'boolean'
        | 'string'
        ;

/*
 *----------------
 *  LEXER RULES
 *----------------
 */

NULL: 'null';
BOOLEAN: ('true' | 'false');
INTEGER: [0-9]+;
DOUBLE: [0-9]+'.'[0-9]+;
ID: [a-zA-Z0-9_]+;
DELIMITER: ';';
STRING: ('"' (~'"')* '"');
SL_COMMENT: '//' .*? '\n' -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;