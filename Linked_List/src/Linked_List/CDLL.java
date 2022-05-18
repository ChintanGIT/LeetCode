package Linked_List;

public class CDLL {
    public Dnode head;
    public Dnode tail;
    public int size;

    public void createCDLL(int value) {
        Dnode node = new Dnode();
        node.value =value;
        head = node;
        tail = node;
        node.next = node;
        node.prev = node;
        size = 1;
    }

    public void insert(int location, int value){
        if (head == null){
            createCDLL(value);
        }
        Dnode newNode = new Dnode();
        newNode.value = value;
        if (location == 0){
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            head = newNode;
            tail.next = newNode;
        }else if (location >= size){
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            head.prev = newNode;
        }else{
            Dnode temp = head;
            int index = 0;
            while (location -1  > index){
                temp = temp.next;
                index++;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            newNode.next.prev = newNode;
            temp.next = newNode;
        }

    }
}
