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


Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Labrador");

        dog1.displayInfo();
        dog2.displayInfo();

        dog1.setName("Max");
        dog1.setBreed("German Shepherd");
        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        System.out.println("After update:");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
