package collectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSet2 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("Jan");
        hs.add("Feb");
        hs.add("Mar");
        hs.add("Apr");
        hs.add("May");
        hs.add("Jun");
        hs.add("Jul");

        /*for(String s: hs)
        {
            System.out.println(s);
        }*/

        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
