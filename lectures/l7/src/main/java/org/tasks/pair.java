package org.tasks;

public class pair <K, V> {
    private K key;
    private V value;

    public pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public <K, V> K getKey() {
        return (K) key;
    }
    public <K, V> V getValue() {
        return (V) value;
    }


}
