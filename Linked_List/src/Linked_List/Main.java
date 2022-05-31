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

//        DLL DLL = new DLL();
//        DLL.createDsll(1);
//        DLL.insert(2,1);
//        DLL.insert(3,1);
//        DLL.insert(4,1);
//        DLL.insert(5,1);
//        DLL.insert(6,1);
//        DLL.insert(7,1);
//        DLL.insert(8,1);
//        System.out.println(DLL.head.value);
//        DLL.trav();
//        System.out.println();
//        DLL.search(100);
//        DLL.deleteEntire();
//        DLL.trav();

        CDLL CDLL = new CDLL();
        CDLL.createCDLL(0);
        CDLL.insert(1,1);
        CDLL.insert(1,2);
        CDLL.insert(1,3);
        CDLL.insert(1,4);
        CDLL.insert(1,5);
        CDLL.insert(1,6);
        CDLL.insert(1,7);
        CDLL.insert(1,8);
        CDLL.trav();
        CDLL.search(6);
   }

}
