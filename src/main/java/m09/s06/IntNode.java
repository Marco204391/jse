package m09.s06;

public class IntNode {
    private int value;
    private IntNode next;

    public IntNode() {
    }

    public IntNode(int value){
        this.value=value;
        this.next = null;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "IntNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
