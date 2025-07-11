package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class EmpArrList1 {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        Employee e1 = new Employee("Amit", 25);
        Employee e2 = new Employee("Alice", 22);
        Employee e3 = new Employee("Bob", 20);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        Collections.sort(emp);
        System.out.println("Sorted Employee List (by Age):");
        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}
