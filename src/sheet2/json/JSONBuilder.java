// ExprBuilder.java
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.Stack;

public final class JSONBuilder extends JSONParserBaseListener {
    private Stack<JSON> stack = new Stack<JSON>();

    public JSON build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return this.stack.pop();
    }

    @Override
    public void exitExpr(JSONParser.Context ctx) {
        if (ctx.getChildCount() == 3) {
            JSON right = this.stack.pop();
            JSON left = this.stack.pop();
            String op = ctx.getChild(1).getText();
            this.stack.push(new Operation(left, op, right));
        }
    }

    @Override
    public void exitMultExpr(ExprParser.MultExprContext ctx) {
        if (ctx.getChildCount() == 3) {
            JSON right = this.stack.pop();
            JSON left = this.stack.pop();
            String op = ctx.getChild(1).getText();
            this.stack.push(new Operation(left, op, right));
        }
    }

    @Override
    public void exitValue(ExprParser.ValueContext ctx) {
        String s = ctx.Number().getText();
        switch (ctx.getStart().getType()) {
        case ExprLexer.PLUS:
            s = ctx.PLUS().getText() + s;
            break;
        case ExprLexer.MINUS:
            s = ctx.MINUS().getText() + s;
            break;
        }

        this.stack.push(new Value(s));
    }
}

