// MidTerm.java
public final class MidTerm extends Expr {
    private final KeyValue keyvalueL;
    private final String delimiter;
    private final KeyValue keyvalueR;

    public MidTerm(KeyValue keyvalueL, String delimiter, KeyValue keyvalueR) {
        this.keyvalueL = keyvalueL;
        this.delimiter = delimiter;
        this.keyvalueR = keyvalueR;
    }

    public String getMidTerm() {
        return this.keyvalueL + this.delimiter + this.keyvalueR;
    }

    @Override
    public String toString() {
        return this.keyvalueL.toString() + this.delimiter.toString() + this.keyvalueR.toString();
    }
}

