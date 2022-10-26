package sheet1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a1
{
        public static void main(String[]args)
        {
                Pattern gen_char_num = Pattern.compile("%([1-9]\\$)?[-#+\s0,(]?\\d+?(\\.\\d)?[bBhHcCdoxXeEfgGaA]");

                Pattern date_time = Pattern.compile("%([1-9]\\$)?[-#+\s0,(]?\\d+?[tT][HIklMSLNpzZsQBbhAaCYyjmdeRrDFc]");

                Pattern gen = Pattern.compile("%[-#+\s0,(]?\\d?\\D");

                Pattern combined_pattern = Pattern.compile(gen_char_num + "|" + date_time + "|" + gen);

                String tmp_str = args[0];

                var res = combined_pattern.matcher(tmp_str);

                int last_index = 0;
                StringBuilder result = new StringBuilder();

                while(res.find())
                {
                        if(res.start() > last_index)
                        {
                                result.append("TEXT(").append(tmp_str.substring(last_index, res.start())).append(")");
                        }
                        result.append("FORMAT(").append(tmp_str.substring(res.start(), res.end())).append(")");
                        last_index = res.end();
                }
                if(last_index < tmp_str.length()){
                        result.append("TEXT(").append(tmp_str.substring(last_index, tmp_str.length())).append(")");
                }
                System.out.println(result);
        }
}