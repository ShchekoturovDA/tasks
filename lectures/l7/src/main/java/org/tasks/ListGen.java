package org.tasks;

public class ListGen {
    private NodeGen root;

    public ListGen(){
    }

    public void add(pair item) {
        NodeGen newNode = new NodeGen(item);
        NodeGen lastNode = findLast();

        if (lastNode == null) {
            root = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }

    private NodeGen findLast() {
        NodeGen last = root;
        if (last != null){
            while (last.GetNext() != null) {
                last = last.GetNext();
            }
        }
        return last;
    }

    public pair get(int index) {
        NodeGen n = this.root;
        int i = 1;
        while (n != null  & i < index){
            n = n.GetNext();
            i++;
        }
        return n.getValue();
    }

    public int size() {
        int s = 0;
        if (root != null) {
            NodeGen n = root;
            s++;
            while (n.GetNext() != null) {
                n = n.GetNext();
                s++;
            }
        }
        return s;
    }

}
