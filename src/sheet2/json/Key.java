// Key.java
public final class Key extends Expr {
    private final String key;


    public Key(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

    @Override
    public String toString() {
        return key.toString();
    }
}

