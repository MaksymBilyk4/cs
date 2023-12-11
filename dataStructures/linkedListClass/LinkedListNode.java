package linkedListClass;

public class LinkedListNode {

    int value;
    LinkedListNode prev;
    LinkedListNode next;

    public LinkedListNode(int value, LinkedListNode prev, LinkedListNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }


    public LinkedListNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "( " + value + " ) ⇄ " + next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(LinkedListNode prev) {
        this.prev = prev;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
