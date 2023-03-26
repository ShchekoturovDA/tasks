package org.tasks;

public class NodeGen {
    private pair value;
    private NodeGen next;

    public NodeGen(pair value) {
        this.value = value;
        this.next = null;
    }

    public NodeGen(pair value, NodeGen next) {
        this.value = value;
        this.next = next;
    }

    public pair getValue() {
        return value;
    }

    public void setValue(pair value) {
        this.value = value;
    }

    public NodeGen GetNext() {
        return next;
    }

    public void setNext(NodeGen next) {
        this.next = next;
    }

}
