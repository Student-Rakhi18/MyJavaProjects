package collectionFramework.ArrayList;

public class Employee2 implements Comparable<Employee2> {
    private String name;
    private int age;

    public Employee2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "name: " + name + " Age: " + age;
    }

    public int compareTo(Employee2 e) {
        int diff = this.name.compareTo(e.name);
        if (diff > 0)
            return 1;
        else if (diff < 0)
            return -1;
        else
            return 0;
    }
}

