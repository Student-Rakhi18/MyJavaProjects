package collectionFramework.ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Amit");
        obj.add("Sumit");
        System.out.println(obj);
        obj.add(0, "Alice");
        System.out.println(obj);
    }
}
