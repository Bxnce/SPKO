// Operation.java
public final class Operation extends Expr {
    public final Expr open;
    public final String midterm;
    public final Expr close;

    public Operation(Expr open, String midterm, Expr close) {
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

