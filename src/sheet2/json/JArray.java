import java.util.LinkedList;
import java.util.List;

// Operation.java
public final class JArray extends JSON {
    public final String open;
    public final List<Value> array_values;
    public final String close;

    public JArray(String open, List<Value> array_values, String close) {
        this.open = open;
        this.array_values = array_values;
        this.close = close;
    }

    public JArray(String open, String close) {
        this.open = open;
        this.array_values = new LinkedList<>();
        this.close = close;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (JSON key_value : this.array_values) {
            sb.append(key_value.toString()).append(",");
        }
        return "[" + sb.delete(sb.length()-1, sb.length()) + "]";
    }
}
