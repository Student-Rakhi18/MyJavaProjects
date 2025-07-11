package collectionFramework.ArrayList;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "name: " + name + " Age: " + age;
    }

    public int compareTo(Employee e) {
        if (this.age > e.age)
            return 1;
        else if (this.age < e.age)
            return -1;
        else
            return 0;
    }
}

