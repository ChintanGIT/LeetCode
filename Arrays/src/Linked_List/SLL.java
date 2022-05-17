package Linked_List;

public class SLL {
    public Node head;
    public Node tail;
    public int size;

    public Node createSLL(int nodeValue){
        head = new Node();
        Node node  = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insert(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createSLL(nodeValue);
            return;
        }else if (location == 0) {
            node.next = head;
            head = node;
        }else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else {
            Node temp = head;
            int index = 0;
            while ( index < location - 1){
                temp = temp.next;
                index++;
            }
            Node nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void trav(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.value + " ->" );

            tmp = tmp.next;
        }
        System.out.println("tail");
    }
    public void search(int value){
        Node tmp = head;
        int index = 0;
        while (tmp != null){
            if (tmp.value == value) {
                System.out.println(" found at index " + index);
                return;
            }
                tmp = tmp.next;
                index++;


        }
        System.out.println("value not found");
        return;
    }

    public void delete(int location){
        if (head == null){
            return;
        }else if (location == 0){
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
        }else if (location >= size){
            Node temp = head;
            int index = 0;
            while(index < location){
                temp = temp.next;
                index ++;
            }
            temp.next = null;
            tail = temp;
            size--;
        }else{
            Node temp = head;
            int index = 0;
            while(index < location - 2){
                temp = temp.next;
                index ++;
            }
            temp.next = temp.next.next;
            size--;
        }

    }
    public void deleteEntire(){
        head = null;
        tail = null;
    }
}
