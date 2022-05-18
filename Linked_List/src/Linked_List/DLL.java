package Linked_List;

public class DLL {
    Dnode head;
    Dnode tail;
    int size;

    public void createDsll(int value){
        head = new Dnode();
        Dnode node = new Dnode();
        node.value = value;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size++ ;
        System.out.println("list created");

    }
    public void insert(int value, int location){
        Dnode newNode = new Dnode();
        newNode.value = value;
        if (head == null){
            createDsll(value);
            return;
        }else if (location == 0 ){
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else if (location>= size){
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }else{
            Dnode temp = head;
            for(int i = 0; i < location - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            newNode.next.prev = newNode;

        }

    }
    public void trav(){
        Dnode temp = head;
        if (head == null){
            System.out.println("Empty List");
            return;
        }
        while(temp != null){
            System.out.print(temp.value + " -> " );
            temp = temp.next;
        }
        System.out.print("tail");
    }
    public void revTrav(){

    }
    public void search(int value){
        Dnode temp = head;
        int index = 0 ;
        while(temp != null){
            if(temp.value == value){
                System.out.println("Value found at index " + index);
                return;
            }
            temp = temp.next;
            index += 1;
        }
        System.out.println("value not found in LL");
    }
    public void delete(int location){
        if ( head == null ){
            System.out.println("No linked List exists");
            return;
        }else if (location == 0){
            if(size == 1){
                head = null;
                tail = null;
                size--;
                return;
            }else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }else if (location >= size){
            Dnode temp = tail.prev;
            if ( size == 1 ){
                head = null;
                tail = null;
                size--;
                return;
            }else{
                temp.next = null;
                tail = temp;
                size--;
            }
        }else {
            Dnode temp = head;
            for ( int i = 0; i < location-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
    }
    public void deleteEntire(){
        Dnode temp = head;
        while (temp != null){
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        tail = null;
    }
}
