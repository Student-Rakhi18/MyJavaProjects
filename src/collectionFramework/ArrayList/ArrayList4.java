package collectionFramework.ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Amit");
        arr.add("Sumit");

        //System.out.println(arr.get(1));
        /*for(int i=0; i<arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }*/

        System.out.println("Before remove: ");
        for (String s1 : arr) {
            System.out.println(s1);
        }

        //arr.remove(0);

        arr.remove("Sumit");

        System.out.println("After Remove: ");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
