parser grammar JSONParser;

options { tokenVocab=JSONLexer;}

json_doc     : OOPEN midterm OCLOSE;

midterm      : keyvalue ((DELIMITER keyvalue)*)?;
array        : AOPEN (value (DELIMITER value)*)? ACLOSE;
keyvalue     : STRING SPLIT value;
value        : (NUMBER | BOOLEAN | NULL | STRING | json_doc | array );