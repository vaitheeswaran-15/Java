import java.util.List;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertAtLast(int value){
        if(size == 0){
            insertAtFirst(value);
            return;
        }

        ListNode node = new ListNode(value);
        tail.next = node;
        tail = node;
        size +=1;
    }

    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertAtFirst(value);
            return;
        }

        if(index == size){
            insertAtLast(value);
            return;
        }

        ListNode temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        ListNode node = new ListNode(value, temp.next);
        temp.next = node;
        size += 1;
    }

    public void deleteFromFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -= 1;
    }

    public void deleteFromLast(){
        if(size <= 1){
            deleteFromFirst();
            return;
        }

        ListNode node = fetchNode(size - 2);
        tail = node;
        tail.next = null;

        size -= 1;
    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public ListNode fetchNode(int index){
        ListNode temp = head;
        for(int i=0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    private class ListNode{
        private int value;
        private ListNode next;


        public ListNode(int value){
            this.value = value;
        }

        public ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }
    }
}
