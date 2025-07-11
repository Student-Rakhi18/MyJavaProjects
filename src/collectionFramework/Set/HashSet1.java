package collectionFramework.Set;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        hs.add("Amit");
        hs.add(10);
        hs.add(10.5);
        hs.add("Sumit");
        Object[] arr = hs.toArray();
        String name = arr[0].toString();
        System.out.println(hs);
    }
}
