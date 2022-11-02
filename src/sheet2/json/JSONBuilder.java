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
    public void exitJson_doc(JSONParser.Json_docContext ctx) {
        if (ctx.getChildCount() == 3) {
            String open = ctx.getChild(0).getText();
            String close = ctx.getChild(2).getText();
            JSON midTerm = this.stack.pop();
            this.stack.push(new JSON_Obj(open, midTerm, close));
        }
    }

    @Override
    public void exitMidterm(JSONParser.MidtermContext ctx) {
        if (ctx.getChildCount() == 3) {
            JSON keyvalueR = this.stack.pop();
            JSON keyvalueL = this.stack.pop();
            String delimiter = ctx.getChild(1).getText();
            this.stack.push(new MidTerm(keyvalueL, delimiter, keyvalueR));
        } else if (ctx.getChildCount() == 1){
            JSON keyvalue = this.stack.pop();
            this.stack.push(new MidTerm(keyvalue));
        }
    }

    @Override
    public void exitKeyvalue(JSONParser.KeyvalueContext ctx){
        String key = ctx.getChild(0).getText();
        String split = ctx.getChild(1).getText();
        JSON value = this.stack.pop();
        this.stack.push(new KeyValue(key, split, value));
    }

    @Override
    public void exitValue(JSONParser.ValueContext ctx) {
        String s = ctx.getText();
        this.stack.push(new Value(s));
    }
}

