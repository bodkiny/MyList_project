import impl.MyArrayList;
import interfaces.MyList;

import java.util.Arrays;

public class MyListRunner {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>(10);
        System.out.println("Current size of myList: " + myList.size());

        for (int i = 0; i < 25; i++) {
            myList.add(i);
        }

        System.out.println("Current size of myList: " + myList.size());

        try{
            myList.add(5333, 56);
        }catch (Exception e){
            e.printStackTrace(System.out);
        }

        myList.add(10000, 5);
        System.out.println("Current size of myList: " + myList.size());

        System.out.println(Arrays.toString(myList.toArray()));

        System.out.println("myList contains a number 10000: " + myList.contains(10000));
        System.out.println("myList contains a number 523: " + myList.contains(523));
        System.out.println("The number " + myList.removeByIndex(5) + " with index 5 was removed");
        System.out.println("myList contains a number 10000: " + myList.contains(10000));
        System.out.println("Current size of myList: " + myList.size());

        System.out.println(Arrays.toString(myList.toArray()));

    }
}
