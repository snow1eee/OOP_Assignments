class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 26, "12 Baker St");
        Person person2 = new Person("Bob", 31, "34 River Rd");
        Person person3 = new Person("Charlie", 23, "56 Oak St");
        Person person4 = new Person("David", 29, "78 Cedar St");
        Person person5 = new Person("Eve", 36, "90 Pine St");

        person1.displayBasicInfo();
        person2.displayBasicInfo();
        person3.displayBasicInfo();
        person4.displayBasicInfo();
        person5.displayBasicInfo();
    }
}


