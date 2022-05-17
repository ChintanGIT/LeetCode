package Linked_List;

public class Main {
    public static void main(String[] args) {
//        SLL sll = new SLL();
//        sll.createSLL(5);
//        System.out.println(sll.head.value);
//        sll.insert(6,1);
//        System.out.println(sll.head.value);
//        System.out.println(sll.head.next.value);
//        sll.insert(4,3);
//        sll.insert(5,3);
//        sll.insert(6,3);
//        sll.insert(7,3);
//        sll.insert(8,3);
//        System.out.println(sll.head.next.next.value);
//        sll.trav();
//        sll.search(67);
//        sll.deleteEntire();
//        sll.trav();



//        CSLL csll = new CSLL();
//        csll.createCSLL(5);
//        System.out.println(csll.head.value);
//        System.out.println(csll.head.next.value);
//
//        csll.insertCSLL(1,0);
//        csll.insertCSLL(2,3);
//        csll.insertCSLL(3,5);
//        csll.insertCSLL(4,2);
//        csll.insertCSLL(5,0);
//        csll.trav();
//        System.out.println("");
//        csll.search(4);

        DSLL dsll = new DSLL();
        dsll.createDsll(1);
        dsll.insert(2,1);
        dsll.insert(3,1);
        dsll.insert(4,1);
        dsll.insert(5,1);
        dsll.insert(6,1);
        dsll.insert(7,1);
        dsll.insert(8,1);
        System.out.println(dsll.head.value);
        dsll.trav();
        System.out.println();
        dsll.search(100);

   }

}
