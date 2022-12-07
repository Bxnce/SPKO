// KeyValue.java
public final class KeyValue extends JSON {
    public final String key;
    public final String split;
    public final JSON value;

    public KeyValue(String key, String split, JSON value) {
        this.key = key;
        this.split = split;
        this.value = value;
    }

    public String getKeyValue() {
        return this.key + this.split + this.value;
    }

    @Override
    public String toString() {
        return key + split + value.toString();
    }
}

