public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        System.out.println(myArrayList.toString());

        System.out.println("------");
        myArrayList.remove(1);
        System.out.println(myArrayList.toString());
        myArrayList.clear();
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());


    }
}
