package stackClass;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackRealization<E> {
    private StackNode<E> head = null;
    private final int stackSize;
    private StackNode<E>[] vector;

    public StackRealization(int stackSize) {
        this.stackSize = stackSize;
        this.vector = new StackNode[stackSize];
    }


    public boolean isEmpty () {
        return this.head == null;
    }

    public StackNode<E> pop() {
        if (isEmpty()) throw new EmptyStackException();

        int lastElementIndex = findFirstNullValueIndex() - 1;

        StackNode<E> el = this.vector[lastElementIndex];

        this.vector[lastElementIndex] = null;
        this.head = lastElementIndex == 0 ? null : this.vector[lastElementIndex - 1];

        if (this.head != null) this.head.setNextEl(null);

        return el;
    }

    public StackNode<E> push(StackNode<E> el) {

        int nullValueIndex = findFirstNullValueIndex();

        if (isEmpty()) {
            this.head = el;
        } else {
            StackNode<E> oldHead = this.head;
            this.head = el;
            oldHead.setNextEl(this.head);
        }

        this.vector[nullValueIndex] = el;

        return el;
    }

    /** method returns index of first null-val element of vector[] */
    private int findFirstNullValueIndex() {
        int index = 0;
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] == null) {
                 index = i;
                 break;
            }
        }
        return index;
    }

    public StackNode<E> peek() {
        return this.head;
    }


    public StackNode<E> getHead() {
        return head;
    }

    public void setHead(StackNode<E> head) {
        this.head = head;
    }

    public int getStackSize() {
        return stackSize;
    }

    public StackNode<E>[] getVector() {
        return vector;
    }

    public void setVector(StackNode<E>[] vector) {
        this.vector = vector;
    }

    public void visualizeStack() {
        int maxValLength = 0;
        for (StackNode<E> node : this.vector) {
            if (String.valueOf((node == null ? "null" : node.getVal())).length() > maxValLength)
                maxValLength = String.valueOf((node == null ? "null" : node.getVal())).length();
        }

        String val = "";
        boolean isSpace;

        for (int i = this.vector.length - 1; i >= 0; i--) {
            val = (this.vector[i] == null ? "null" : this.vector[i].getVal().toString());
            isSpace = (maxValLength - val.length() - 1) > 0;

            System.out.println("|" + "-".repeat(maxValLength + 2) + "|");
            System.out.println("| " + " ".repeat(maxValLength) + " |");
            System.out.println("| " +
                    (isSpace ? " " + val : val) +
                    (isSpace ? " ".repeat(maxValLength - val.length() - 1) : "") + " |"
            );
            System.out.println("| " + " ".repeat(maxValLength) + " |");
        }
        System.out.println("|" + "-".repeat(maxValLength + 2) + "|");
    }

    @Override
    public String toString() {
        return "Stack state ---> {" +
                "\n --- head=" + head +
                "\n --- stackLength=" + stackSize +
                "\n --- vector=" + Arrays.toString(vector) +
                "\n}";
    }
}
