lexer grammar JSONLexer;

OOPEN        :   '{';
OCLOSE       :   '}';
AOPEN        :   '[';
ACLOSE       :   ']';
BOOLEAN      :   (TRUE | FALSE);
NULL         :   'null';
NUMBER       :   NEG? DIGIT+ (DOT DIGIT+)?;
STRING       :   '"'(.)*?'"';
DELIMITER    :   ',';
TRUE         :   'true';
FALSE        :   'false';
DIGIT        :   [0-9];
SPLIT        :   ':';
NEG          :   '-';
DOT          :   '.';
WS           :   [\t\r\n]               -> skip ;
S            :   ' '                    -> skip ;