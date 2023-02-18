public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nMy Array List");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(100);
        myArrayList.add(200);
        myArrayList.add(300);
        System.out.println("My Array List size="+myArrayList.size());
        System.out.println(myArrayList.toString());
        myArrayList.remove(1);
        System.out.println(myArrayList.toString());
        myArrayList.clear();
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());

        System.out.println("\n\n\nMy Linked List");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Madrid");
        myLinkedList.add("Paris");
        myLinkedList.add("Amsterdam");
        System.out.println("myLinkedList = " + myLinkedList.toString());
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(1);
        System.out.println("myLinkedList = " + myLinkedList.toString());
        myLinkedList.clear();
        System.out.println("myLinkedList = " + myLinkedList.toString());
        myLinkedList.add("Kyiv");
        System.out.println("myLinkedList = " + myLinkedList.toString());

        System.out.println("\n\n\nMy Queue");
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("10");
        myQueue.add("20");
        myQueue.add("30");
        System.out.println("My Queue = "+myQueue.toString());
        System.out.println("My Queue size = "+myQueue.size());
        System.out.println("My Queue peek element = "+myQueue.peek());
        System.out.println("My Queue after peek = "+myQueue.toString());
        System.out.println("My Queue poll element = "+myQueue.poll());
        System.out.println("My Queue after poll = "+myQueue.toString());




    }
}
