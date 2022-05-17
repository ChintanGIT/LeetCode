package Linked_List;

public class DSLL {
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

}
