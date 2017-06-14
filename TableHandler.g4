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
//
// Variable declaration
declaration: t=dataType var=ID ('=' expr)?;

// Variable assignment
assignment: var=ID '=' e=expr  #assignExpr
    |       var=ID '=' NULL    #assignNull
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
    | s=stringExpr
    | t=tableExpr
    ;

// TODO: var/table ops
numExpr: e1=numExpr op=('+'|'-') e2=numExpr
    |    e1=numExpr op=('*'|'/') e2=numExpr
    |    '(' e1=numExpr ')'
    |    e3=INTEGER
    ;

boolExpr: BOOLEAN
    |     e1=boolExpr op=('||'|'&&') e2=boolExpr
    |     e1=boolExpr op=('=='|'!=') e2=boolExpr
    |     '(' e1=boolExpr ')'  
    ;

// TODO: compare vars
compareExpr: e1=numExpr op=('=='|'!='|'<'|'>'|'<='|'>=') e2=numExpr;

// TODO: Tables as vars
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
    |      eq=equals
    |      ex=export
    |      pr=printTable
    |      prf=printFirst
    |      prl=printLast
    )      ')'
    ;

newTable: 'read' file 'to' ID;
addRow: 'add row ' (ID|row) 'to' ID;
addRowFrom: 'add row ' (ID|row) 'at' INTEGER 'to' ID;
remRow: 'remove row at' INTEGER 'from' ID;
getValue: 'get value(' INTEGER ',' INTEGER ') from' ID;
setValue: 'insert into' ID 'value=' s1=expr 'at cell(' INTEGER ',' INTEGER ')';
clearRow: 'clear row at' INTEGER 'from' ID;
removeRow: 'remove row at' INTEGER 'from' ID;
addCol: 'add column' (ID|col) 'to' ID;
addColFrom: 'add column' (ID|col) 'at' INTEGER 'to' ID;
remCol: 'remove column at' INTEGER 'from' ID;
clearField: 'clear field(' INTEGER ',' INTEGER ')' 'from' ID;
numColumns: 'get col size from' ID; //return int
numRows: 'get row size from' ID;    //return int
uniqueCol: 'get unique column from' ID 'at' INTEGER; //return list
getCol: 'get column from' ID 'at' INTEGER 'header =' b1=boolExpr;
getRow: 'get row from' ID 'at' INTEGER;
getHeaderIndex: 'get index from' ID 'of value =' s1=stringExpr; //return int
subTableCol: 'col-subtable from' ID 'start=' INTEGER 'end=' INTEGER;
subTableCol2: 'col-subtable from' ID 'start=';
subTableRow: 'row-subtable from' ID 'start=' INTEGER 'end=' INTEGER;
subTableRow2: 'row-subtable from' ID 'start=' INTEGER;
add: 'add' ID 'with' ID;
sub: 'subtract' ID 'with' ID;
sort: 'sort' ID;
equals: ID 'equals' ID; //return boolean
export: 'export' ID 'to' file;
printTable: 'print' ID;
printFirst: 'print first' INTEGER 'lines of' ID;
printLast: 'print last' INTEGER 'lines of' ID;

//fragments
row: (ID ','?)+;
col: (ID ','?)+;
file: ID '.csv';

// TODO: Strings as vars
stringExpr: t1=STRING
    |       '(' t2=stringExpr ')' 
    |       NULL 
    ;

dataType: 'integer'
        | 'table' 
        | 'boolean'
        | 'char'
        | 'word'
        ;

/*
 *----------------
 *  LEXER RULES
 *----------------
 */

NULL: 'null';
BOOLEAN: ('false' | 'true');
INTEGER: [0-9]+;
ID: [a-zA-Z0-9_]+;
DELIMITER: ';';
STRING: ('"' (~'"')* '"');
SL_COMMENT: '//' .*? '\n' -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;