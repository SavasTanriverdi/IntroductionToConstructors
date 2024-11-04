public class Person {
    // Attributes
    private String name;
    private int age;
    private String profession;

    // Constructor to initialize Person object
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
        System.out.println();
    }
}
