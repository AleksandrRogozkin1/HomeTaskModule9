public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(100);
        myArrayList.add(200);
        myArrayList.add(300);
        System.out.println("myArrayList size="+myArrayList.size());
        System.out.println(myArrayList.toString());
        myArrayList.remove(1);
        System.out.println(myArrayList.toString());
        myArrayList.clear();
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());

        System.out.println("\n\n\n\nLinked list");
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


    }
}
