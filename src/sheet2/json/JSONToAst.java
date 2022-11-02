// ExprToAst.java
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public final class JSONToAst {
    private JSONToAst() { }

    public static void main(String[] args) throws Exception {
        JSONLexer lexer = new JSONLexer(CharStreams.fromStream(System.in));
        JSONParser parser = new JSONParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.json_doc();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        JSON ast = new JSONBuilder().build(tree);
        System.out.printf("Expr.toString() = \"%s\"%n", ast);
    }
}

