package collectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class EmpHashSet {
    public static void main(String[] args) {
        Set<Employee1> emp = new HashSet<>();
        Employee1 e1 = new Employee1("Amit");
        Employee1 e2 = new Employee1("Amit");
        Employee1 e3 = new Employee1("Bob");
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        for (Employee1 e : emp) {
            System.out.println(e);
        }
    }
}
