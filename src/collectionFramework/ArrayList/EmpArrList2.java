package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class EmpArrList2 {
    public static void main(String[] args) {
        ArrayList<Employee2> emp = new ArrayList<>();
        Employee2 e1 = new Employee2("Bob", 25);
        Employee2 e2 = new Employee2("Alice", 22);
        Employee2 e3 = new Employee2("Amit", 20);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        Collections.sort(emp);
        System.out.println("Sorted Employee List (by Name):");
        for (Employee2 e : emp) {
            System.out.println(e);
        }
    }
}
