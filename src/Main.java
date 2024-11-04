public class Main {
    public static void main(String[] args) {
        // Creating an object of Person class using constructor
        Person person1 = new Person("Alice", 30, "Engineer");
        Person person2 = new Person("Bob", 25, "Doctor");

        // Displaying person details
        person1.displayInfo();
        person2.displayInfo();
    }
}