import java.util.LinkedList;
import java.util.List;

// Operation.java
public final class JSON_Obj extends JSON {
    public final String open;
    public final List<JSON> json_list;
    public final String close;

    public JSON_Obj(String open, List<JSON> json_list, String close) {
        this.open = open;
        this.json_list = json_list;
        this.close = close;
    }

    public JSON_Obj(String open,String close) {
        this.open = open;
        this.json_list = new LinkedList<>();
        this.close = close;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.json_list.size() - 2; i++){
            sb.append(this.json_list.get(i).toString()).append(", ");
        }
        sb.append(this.json_list.get(this.json_list.size() - 1).toString());
        return "{" + sb.toString() + "}";
    }
}

