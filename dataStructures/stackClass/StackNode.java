package stackClass;

public class StackNode<T> {
    private T val;
    private StackNode<T> nextEl;

    public StackNode(T val, StackNode<T> nextEl) {
        this.val = val;
        this.nextEl = nextEl;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public StackNode<T> getNextEl() {
        return nextEl;
    }

    public void setNextEl(StackNode<T> nextEl) {
        this.nextEl = nextEl;
    }

    @Override
    public String toString() {
        T nextElVal = nextEl == null ? null : nextEl.getVal();

        return "Node{" +
                "val=" + val +
                ", nextEl=" + nextElVal +
                '}';
    }


}
