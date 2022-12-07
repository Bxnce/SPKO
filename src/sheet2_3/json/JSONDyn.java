import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class JSONDyn {
    public static void main(String[] args) throws IOException {
        JSONLexer lexer = new JSONLexer(CharStreams.fromStream(System.in));
        JSONParser parser = new JSONParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.json_doc();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        JSON ast = new JSONBuilder().build(tree);
        System.out.println(create_readable_string(ast.toString()));
    }

    public static String create_readable_string(String ast){
            StringBuilder readable_string = new StringBuilder();
            int current_indentation = 0;
            for (char c : ast.toCharArray()) {
                if (c == '{' || c == ',' || c == '}') {
                    if (c == '{') {
                        readable_string.append("\n").append("\t".repeat(current_indentation)).append(c).append("\n")
                                .append("\t".repeat(current_indentation + 1));
                        current_indentation += 1;
                    }

                    if (c == '}') {
                        current_indentation -= 1;
                        readable_string.append("\n").append("\t".repeat(current_indentation)).append(c);
                    }

                    if (c == ',') {
                        readable_string.append(c).append("\n")
                                .append("\t".repeat(current_indentation));
                    }

                } else {
                    readable_string.append(c);
                }

            }
                return readable_string.toString();
    }
}
