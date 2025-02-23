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
