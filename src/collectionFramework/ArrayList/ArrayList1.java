package collectionFramework.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]) {
        ArrayList arr = new ArrayList();
        arr.add("Amit");
        arr.add(10);
        arr.add(10.5);
        String name = (String) arr.get(0);
        System.out.println(arr);
    }
}
