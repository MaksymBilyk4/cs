package linkedListClass;

public class LinkedListClass {

    LinkedListNode head;
    LinkedListNode tail;


    public void addFirst(int val) {
        LinkedListNode node = new LinkedListNode(val, null, null);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.head.prev = node;
            node.next = this.head;
            this.head = node;
        }
    }

    public void addEnd(int val) {
        LinkedListNode node = new LinkedListNode(val, null, null);
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }
        this.tail = node;
    }

    public void deleteFirst() {
        this.head.next.prev = null;
        this.head = this.head.next;
    }

    public void deleteLast() {
        this.tail = this.tail.prev;
        this.tail.next = null;
    }

    public void insertAfter(int searchVal, int insertionVal) {
        LinkedListNode node = search(searchVal);
        if (node != null) {
            if (node.value == this.tail.value ||
               (this.head.next == null && this.head.value == node.value)
            ) addEnd(insertionVal);
            else {
               LinkedListNode oldNext = node.next;
               LinkedListNode newNode = new LinkedListNode(insertionVal);

               node.next = newNode;
               newNode.prev = node;
               newNode.next = oldNext;
               oldNext.prev = newNode;
            }
        }
    }

    public LinkedListNode search(int val) {
        if (this.head == null) return null;

        LinkedListNode current = this.head;

        while (current.value != val) {
            if (current.getValue() == val) break;
            if (current.next == null) {
                current = null;
                break;
            }
            current = current.next;
        }

        return current;
    }

    public void delete(int value) {
        LinkedListNode node = search(value);
        LinkedListNode prevNode = node.prev;
        prevNode.next = node.next;
        node.next.prev = prevNode;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public LinkedListNode getTail() {
        return tail;
    }

    public void setTail(LinkedListNode tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return head.toString();
    }
}
