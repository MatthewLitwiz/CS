package More;

class Person {
    String name;
    int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        // Create Person objects using constructors
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Display information
        person1.displayInfo();
        person2.displayInfo();
    }
}
