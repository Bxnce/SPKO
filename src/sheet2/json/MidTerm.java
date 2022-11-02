// MidTerm.java
public final class MidTerm extends JSON {
    private final JSON keyvalueL;
    private final String delimiter;
    private final JSON keyvalueR;

    public MidTerm(JSON keyvalueL, String delimiter, JSON keyvalueR) {
        this.keyvalueL = keyvalueL;
        this.delimiter = delimiter;
        this.keyvalueR = keyvalueR;
    }

    public MidTerm(JSON keyvalueL){
        this.keyvalueL = keyvalueL;
        this.keyvalueR = null;
        this.delimiter = null;
    }

    public String getMidTerm() {
        if(keyvalueR == null || delimiter == null) {
            return this.keyvalueL.toString();
        } else{
            return this.keyvalueL.toString() + this.delimiter + this.keyvalueR.toString();
        }
    }

    @Override
    public String toString() {
        if(keyvalueR == null || delimiter == null) {
            return this.keyvalueL.toString();
        } else{
            return this.keyvalueL.toString() + this.delimiter + this.keyvalueR.toString();
        }    }
}

