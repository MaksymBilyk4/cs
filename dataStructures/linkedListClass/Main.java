package linkedListClass;

public class Main {

    public static void main(String[] args) {
        LinkedListClass linkedList = new LinkedListClass();

        linkedList.addFirst(5);
        System.out.println(linkedList);
        linkedList.addFirst(6);
        System.out.println(linkedList);
        linkedList.addEnd(10);
        System.out.println(linkedList);
        linkedList.deleteFirst();
        System.out.println(linkedList);
        linkedList.addEnd(100);
        linkedList.addEnd(200);
        linkedList.addFirst(229);
        System.out.println(linkedList);
        linkedList.deleteLast();
        System.out.println(linkedList);
        System.out.println("Search 5 --->" + linkedList.search(5));
        linkedList.insertAfter(100, 999);
        System.out.println(linkedList);
        linkedList.delete(100);
        System.out.println(linkedList);

        System.out.println();
        System.out.println("Head --> " + linkedList.getHead().getValue());
        System.out.println("Tail --> " + linkedList.getTail().getValue());

    }

}
