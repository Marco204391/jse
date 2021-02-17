package m09.s06;

public class MyIntList {
    private IntNode head;


    public MyIntList() {
        this.head = null;
    }

    void add(int value){
        IntNode node = new IntNode(value);
        if(head==null){
            this.head = node;
            return;
        }
        IntNode tail = head;
        while(tail.getNext() != null){
            tail = tail.getNext();
        }
        tail.setNext(node);
    }

    void addFirst(int value){
        IntNode node = new IntNode(value);
        node.setNext(head);
        this.head = node;

    }

    int removeHead(){
        if(head==null){
            throw new IllegalStateException("My list is empty");
        }
        int result = head.getValue();
        head = head.getNext();
        return result;
    }

    public boolean isEmpty(){
        return head==null;
    }

    @Override
    public String toString() {
        IntNode cur = head;
        StringBuilder result = new StringBuilder("[ ");
        while(cur!=null){
            result.append(cur.getValue()+" ");
            cur = cur.getNext();
        }
        result.append("]");
        return result.toString();
    }
}
