# Java Polymorphism Example

## Description

This project is a simple demonstration of polymorphism in Java using a hierarchy of geometric shape classes. The project illustrates fundamental object-oriented programming concepts such as inheritance, abstract classes, and polymorphism.

## Schema

```mermaid
classDiagram
    class Shape {
        <<abstract>>
        -String name
        +Shape(String name)
        +String getName()
        +draw()* abstract
    }
    
    class Circle {
        +Circle(String name)
        +draw() override
    }
    
    class Square {
        +Square(String name)
        +draw() override
    }
    
    class Main {
        +main(String[] args)
    }
    
    Shape <|-- Circle : extends
    Shape <|-- Square : extends
    Main --> Shape : creates and uses
    Main --> Circle : instantiates
    Main --> Square : instantiates
    
    note for Shape "Abstract base class\nDefines common behavior"
    note for Circle "Concrete implementation\nDraws a circle"
    note for Square "Concrete implementation\nDraws a square"
    note for Main "Creates Shape objects\nDemonstrates polymorphism"
```

## Project Structure

`Shape.java` : Abstract base class that defines common behavior for all shapes.

`Circle.java`: Concrete implementation of a circular shape.

`Square.java`: Concrete implementation of a square shape.

`Main.java`: Main class that demonstrates the use of polymorphism.

## Features

- Use of an abstract class (Shape) with both abstract and concrete methods.

- Specific implementations for different types of shapes.

- Demonstration of polymorphism by treating different objects through their common interface.

## How to Run

To run this project:

  - Make sure you have Java installed on your system.
  - Compile all Java files: `javac *.java`

### Run the main class:
java Main
Expected Output
When running the program, you will see the following output: 
- ```Drawing a circle```
- ```Drawing a square```

## Demonstrated Concepts

`Abstraction`: The Shape class defines a common interface for all shapes.

`Inheritance`: The Circle and Square classes inherit from the base Shape class.

`Polymorphism`: The program treats different types of shapes through their common interface.

`Abstract Methods`: The draw() method must be implemented by all subclasses.

This project can be easily extended by adding new shapes that inherit from the Shape class, without needing to modify existing code (following the Open/Closed principle of SOLID).