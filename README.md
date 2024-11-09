# Java Programs: Basic Fundamentals for Beginners ☕🚀

Welcome to **Java Programs for Beginners**! This repository is a collection of simple and easy-to-understand Java programs that cover the fundamental concepts of Java programming. Whether you’re just starting your journey in coding or looking to refresh your basics, this is the perfect place for you!

Java is one of the most popular programming languages, known for its portability, security, and object-oriented structure. It is used in everything from mobile apps to large-scale enterprise systems. Let’s dive into the basics and start coding!

---

## Table of Contents 📚

1. [Installing Java](#installing-java)
2. [Hello World Program](#hello-world-program)
3. [Variables and Data Types](#variables-and-data-types)
4. [Control Structures](#control-structures)
5. [Methods](#methods)
6. [Arrays](#arrays)
7. [Loops](#loops)
8. [Strings](#strings)
9. [Classes and Objects](#classes-and-objects)
10. [Exception Handling](#exception-handling)
11. [File Handling](#file-handling)

---

## 1. **Installing Java** 💻

Before you start coding in Java, you need to install the Java Development Kit (JDK) on your machine.

### Steps to Install Java:
1. **Download JDK**:
   Go to the official Java website: [Oracle JDK Download](https://www.oracle.com/java/technologies/javase-downloads.html)
   
2. **Install JDK**:
   - After downloading the JDK, follow the installation instructions for your operating system.
   
3. **Verify Installation**:
   - After installation, open a terminal/command prompt and type:
   ```bash
   java -version
   ```
   - You should see the Java version information.

Now you are all set to start writing Java code!

---

## 2. **Hello World Program** 🌍

The Hello World program is the simplest Java program that prints a message to the screen.

### Example:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Prints Hello, World! to the console
    }
}
```

---

## 3. **Variables and Data Types** 🔢

Variables in Java are used to store data, and each variable has a data type (e.g., `int`, `double`, `char`). Here’s how you define them:

### Example:
```java
public class DataTypes {
    public static void main(String[] args) {
        int age = 25;          // Integer type
        double price = 19.99;  // Double type
        char grade = 'A';      // Character type
        String name = "John";  // String type
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Price: " + price);
    }
}
```

---

## 4. **Control Structures** 🔀

Control structures such as `if`, `else`, `switch`, and `for` allow you to control the flow of the program.

### Example (if-else):
```java
public class ControlFlow {
    public static void main(String[] args) {
        int num = 10;
        
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative or zero.");
        }
    }
}
```

---

## 5. **Methods** 🔧

Methods allow you to break your program into reusable blocks of code. They are defined with a return type, name, and parameters.

### Example:
```java
public class MethodsExample {
    public static void main(String[] args) {
        greet();  // Calling the greet method
    }

    public static void greet() {
        System.out.println("Hello, welcome to Java!");
    }
}
```

---

## 6. **Arrays** 📊

Arrays in Java are used to store multiple values in a single variable. The elements of an array are accessed via an index.

### Example:
```java
public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}
```

---

## 7. **Loops** 🔄

Loops in Java help you run a block of code repeatedly. The common loops are `for`, `while`, and `do-while`.

### Example (for loop):
```java
public class LoopsExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
    }
}
```

---

## 8. **Strings** 🎤

In Java, strings are objects that store a sequence of characters. You can use many built-in methods to manipulate strings.

### Example:
```java
public class StringsExample {
    public static void main(String[] args) {
        String greeting = "Hello, Java!";
        System.out.println(greeting.toUpperCase());  // Converts to uppercase
        System.out.println(greeting.substring(7));   // Extracts substring
    }
}
```

---

## 9. **Classes and Objects** 🏗️

Java is an object-oriented language. You can create classes to define objects, and each object can have properties (fields) and methods (functions).

### Example:
```java
class Car {
    String brand;
    int year;

    void display() {
        System.out.println(brand + " - " + year);
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2020;
        
        myCar.display();  // Output: Toyota - 2020
    }
}
```

---

## 10. **Exception Handling** ⚠️

Java provides built-in exception handling using `try`, `catch`, and `finally` blocks. This allows you to handle errors gracefully.

### Example:
```java
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int division = 10 / 0;  // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } finally {
            System.out.println("This will always execute.");
        }
    }
}
```

---

## 11. **File Handling** 📂

Java allows you to read from and write to files using the `File` and `Scanner` classes.

### Example (Write to a file):
```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file written by Java.");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
```

---

## **How to Contribute** 🌱

1. Fork the repository.
2. Clone your fork to your local machine.
3. Create a new branch for your changes.
4. Add your new program or improve the existing ones.
5. Push your changes and create a pull request.

---

## **Resources** 🔗

- [Java Programming Tutorials](https://www.tutorialspoint.com/java/)
- [GeeksforGeeks Java Programming](https://www.geeksforgeeks.org/java/)
- [Official Java Documentation](https://docs.oracle.com/en/java/)

---

### **Happy Coding!** 🎉

Keep practicing and exploring the world of Java programming. The more you code, the more proficient you become. Let’s make learning fun and exciting!
