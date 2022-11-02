// Operation.java
public final class Operation extends JSON {
    public final JSON open;
    public final String midterm;
    public final JSON close;

    public Operation(JSON open, String midterm, JSON close) {
        this.open = open;
        this.midterm = midterm;
        this.close = close;
    }

    public String getTerm() {
        return this.midterm;
    }

    @Override
    public String toString() {
        return "(" + this.open + this.midterm + this.close + ")";
    }
}

