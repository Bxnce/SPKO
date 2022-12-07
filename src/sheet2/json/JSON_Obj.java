import java.util.LinkedList;
import java.util.List;

// Operation.java
public final class JSON_Obj extends JSON {
    public final String open;
    public final List<KeyValue> json_list;
    public final String close;

    public JSON_Obj(String open, List<KeyValue> json_list, String close) {
        this.open = open;
        this.json_list = json_list;
        this.close = close;
    }

    public JSON_Obj(String open, String close) {
        this.open = open;
        this.json_list = new LinkedList<>();
        this.close = close;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (JSON key_value : this.json_list) {
            sb.append(key_value.toString()).append(",");
        }
        return "{" + sb.delete(sb.length()-1, sb.length()) + "}";
    }
}
