package Linked_List;

public class CSLL {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int value){
        head = new Node();
        Node node = new Node();
        node.value = value;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCSLL( int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if ( head == null){
            createCSLL(nodeValue);
            return;
        } else if (location == 0){
            node.next = head;
            head = node;
            tail.next = node;
        }else if (location >= size){
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }else{
            Node temp = head;
            int index = 0;
            while(location-1 > index){
                temp = temp.next;
                index ++;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++ ;
    }
    public void trav(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
            if ( temp == head ){
                return;
            }
        }
    }
    public void search(int value){
        Node temp = head;
        int index = 0;
        while (temp != null){
            if (temp.value == value){
                System.out.println("Value found at index " + index);
                return;
            }
            temp = temp.next;
            index++;
            if (temp == head){
                System.out.println("value not found");
                return;
            }
        }

    }
    public void delete(int location){
        if (head == null){
            System.out.println("CSll doesnt exist");
            return;
        }else if (location == 0 ){
            head = head.next;
            tail.next = head;
            size --;
            if (size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
        }else if (location >= size){
            Node temp = head;
            for( int i = 0; i < size-1; i++){
                temp = temp.next;
            }
            if (temp == head){
                head.next=null;
                size = Integer.parseInt(null);
                head = null;
                size--;
                return;
            }temp.next= head;
            tail = temp;
            size--;
        }else {
            Node temp = head;
            for (int i = 0; i < location -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size --;
        }
    }
    public void deleteEntireList(){
        head = null;
        tail.next= null;
        tail = null;
        System.out.println("Deleted");
    }

}
