// ExprBuilder.java
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.Stack;

public final class JSONBuilder extends JSONParserBaseListener {
    private Stack<JSON_Obj> object_stack = new Stack<JSON_Obj>();
    private Stack<JSON> value_stack = new Stack<JSON>();
    private Stack<JArray> array_stack = new Stack<JArray>();

    public JSON build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);

        System.out.println("DEBUG: "+this.object_stack);
        System.out.println("DEBUG: "+this.value_stack);
        return this.object_stack.pop();
    }

    @Override
    public void enterJson_doc(JSONParser.Json_docContext ctx) {
        String open = ctx.getChild(0).getText();
        String close = ctx.getChild(2).getText();
        JSON_Obj json_obj = new JSON_Obj(open, close);
        System.out.println("DEBUG: enterJson");
        this.object_stack.push(json_obj);
    }



    @Override
    public void exitJson_doc(JSONParser.Json_docContext ctx) {
        if (object_stack.size() > 1) {
            JSON json_obj = this.object_stack.pop();

            System.out.println("DEBUG: list of key_values: " + json_obj.toString());

            this.value_stack.push(json_obj);
            System.out.println("DEBUG: push json_doc to value_stack: " + json_obj);
        }
    }


    @Override
    public void exitKeyvalue(JSONParser.KeyvalueContext ctx){
        String key = ctx.getChild(0).getText();
        String split = ctx.getChild(1).getText();
        JSON value = this.value_stack.pop();
        System.out.println("DEBUG: pop of value_stack: "+value);
        JSON_Obj json_obj = this.object_stack.peek();
        for (KeyValue existing_key: json_obj.json_list) {
            if(key.equals(existing_key.key)){
                System.err.printf("Given key '%s' already exists, keys must be unique in a dictionary", key);
                System.exit(1);
            }
        }
        json_obj.json_list.add(new KeyValue(key, split, value));

        System.out.println("DEBUG: add key_value to json_list: " + new KeyValue(key, split, value));
    }


    @Override
    public void enterArray(JSONParser.ArrayContext ctx) {
        String open = ctx.getChild(0).getText();
        String close = ctx.getChild(ctx.getChildCount()-1).getText();
        JArray arr = new JArray(open, close);
        this.array_stack.push(arr);
    }

    @Override
    public void exitArray(JSONParser.ArrayContext ctx) {
        JArray jarr = this.array_stack.pop();
        this.value_stack.push(jarr);
}

    @Override
    public void exitValue(JSONParser.ValueContext ctx) {
        String s = ctx.getText();
        if(ctx.getParent() instanceof JSONParser.ArrayContext){
            JArray jarr = this.array_stack.peek();
            jarr.array_values.add(new Value(s));
        } else {
            if(ctx.getChild(0).getChildCount() == 0){
                this.value_stack.push(new Value(s));
            }
        }
    }

}

