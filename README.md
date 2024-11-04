IntroductionToConstructors

This project demonstrates the concept of constructors in Java. A constructor is a special method used to initialize objects. It has the same name as the class and is called automatically when an object of the class is created. In this example, we use a constructor in the Person class to set initial values for attributes like name, age, and profession.
Project Structure

    IntroductionToConstructors.java: Contains the Person class with a constructor and a displayInfo method, as well as a main method to demonstrate how to create objects using the constructor.

Code Overview
Key Components

    Constructor
        Description: Initializes a new Person object with specified values for name, age, and profession.
        Syntax: A constructor has the same name as the class and does not have a return type.
        Parameters:
            String name - the name of the person.
            int age - the age of the person.
            String profession - the profession of the person.

    Attributes
        name: Stores the name of the person.
        age: Stores the age of the person.
        profession: Stores the profession of the person.

    displayInfo() Method
        Description: Displays the details of a Person object.
        Functionality: Prints name, age, and profession to the console.

Usage

Compile and run the program with the following commands:

    javac Main.java
    java Person.java

Example output:

    Name: Alice
    Age: 30
    Profession: Engineer

    Name: Bob
    Age: 25
    Profession: Doctor

Key Concepts

    Constructor: A special method to initialize object attributes when a new object is created.
    Encapsulation: The Person class encapsulates attributes and methods that are relevant to a person.
    Automatic Initialization: Constructor allows setting initial values for attributes when creating an object.

Author

This project is an educational example that introduces constructors in Java, aimed at demonstrating how to initialize objects with default values.

