// Operation.java
public final class JSON_Obj extends JSON {
    public final String open;
    public final JSON midterm;
    public final String close;

    public JSON_Obj(String open, JSON midterm, String close) {
        this.open = open;
        this.midterm = midterm;
        this.close = close;
    }

    public JSON getTerm() {
        return this.midterm;
    }

    @Override
    public String toString() {
        return "{" + this.midterm + "}";
    }
}

