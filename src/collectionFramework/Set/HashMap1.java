package collectionFramework.Set;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> stu = new HashMap<>();
        stu.put(101, "Amit");
        stu.put(102, "Sumit");
        stu.put(103, "Ravi");
        stu.put(104, "Amit");

        /*System.out.println(stu.get(101));
        System.out.println(stu.get(102));
        System.out.println(stu.get(103));
        System.out.println(stu.get(104));
        System.out.println(stu.get(105));
         */

        for (Map.Entry<Integer, String> e : stu.entrySet()) {
            System.out.println("Keys: " + e.getKey() + "\nValues: " + e.getValue());
        }

        /*
        Set<Integer> keys = stu.keySet();
        for(Integer i : keys)
        {
            System.out.println(i);
        }
        */

        /*
        Collection<String> name =stu.values();
        for(String s : name)
        {
            System.out.println(s);
        }*/
    }
}
