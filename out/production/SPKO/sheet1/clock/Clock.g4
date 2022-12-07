lexer grammar Clock;

    Clock_am_pm: (HOUR':'MINUTES' '(AMS|PMS)) | (TOO' '(AME|PME)) | (AME|PME);

    //AM
    AMS: 'a.m.';
    AME: 'noon';

    //PM
    PMS: 'p.m.';
    PME: 'midnight';

    //12 o'sheet1.clock midnight/noon
    TOO: '12';

    //mins and hours
    HOUR: [1-9] | '1'[0-2];
    MINUTES:[0-5][0-9];

    //Skipping whitespaces, that are not between the time and the postfix
    WS:[ \t\r\n]+->skip; // skip spaces, tabs, newlines