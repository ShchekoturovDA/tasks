package org.tasks;

public class LinkedList {
    private Node root;

    public LinkedList(){
    }

    public void add(Object item) {
        Node newNode = new Node(item);
        Node lastNode = findLast();

        if (lastNode == null) {
            root = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }

    private Node findLast() {
        Node last = root;
        while (last != null) {
            last = last.GetNext();
        }
        return last;
    }

    public Object get(int index) {
        Node n = this.root;
        int i = 1;
        while (n != null ) & (i < index){
                n = n.GetNext();
        i++;
		}
        return n;
    }

    public int size() {
        int s = 0;
        if (root != null) {
            Node n = root;
            s++;
            while (n.GetNext() != null) {
                n = n.GetNext();
                s++;
            }
        }
        return s;
    }