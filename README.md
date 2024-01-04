
# Java OOP Assignment

In this assignment, you will be working with the concept of Object-Oriented Programming (OOP) in Java. You will be implementing classes, interfaces, and methods to model a school system.

## Problem Statement

You are to model a school system with students, teachers, and a principal. Your task is to write classes, interfaces, and methods in Java that model the interactions between these entities.

## Starter Code

Here is some starter code to help you begin:

```java
public abstract class Person {
    // Your code goes here
}

public class Student extends Person implements Exam {
    // Your code goes here
}

public class Teacher extends Person {
    // Your code goes here
}

public class Principal extends Person implements Exam {
    // Your code goes here
}

public interface Exam {
    // Your code goes here
}

public class School {
    // Your code goes here
}

public class Main {
    public static void main(String[] args) {
        // Your code goes here
    }
}
```

## Requirements

1. Your `Person` class should have `name`, `age`, and `address` fields and getter and setter methods for these fields.
2. Your `Student` class should extend `Person` and implement `Exam`. It should have `gradeLevel` and `majorSubject` fields and getter and setter methods for these fields.
3. Your `Teacher` class should extend `Person`. It should have `subjectSpecialty` and `yearsOfExperience` fields and getter and setter methods for these fields.
4. Your `Principal` class should extend `Person` and implement `Exam`.
5. Your `Exam` interface should have `prepareForExam()`, `takeExam()`, and `getExamResult()` methods.
6. Your `School` class should have lists of `Student` and `Teacher` objects. It should have methods to add a student or teacher to the school, remove a student or teacher from the school, and to print all the students or teachers in the school.
7. All classes should override the `toString` method to return a string that includes all the details of the object.
8. The `Person` class should be abstract and have an abstract method called `getDescription` that returns a description of the person.

## Expected Output

When you run this program, it should print the details of the students, teachers, and principal in the school. It should also print the exam results of the students and principal.



# Bonus Assignment:

For extra credit, create a command-line tool that allows a user to interact with your school system model. The tool should provide a menu of options for the user to choose from, and it should be able to handle the following tasks:

1. Add a student or teacher to the school.
2. Remove a student or teacher from the school.
3. Print all the students or teachers in the school.
4. Allow a student or the principal to prepare for an exam, take an exam, and get the exam result.
5. Print the details of a specific student, teacher, or the principal.
6. Exit the program.

Here is some starter code for your command-line tool:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add a student or teacher to the school");
            System.out.println("2. Remove a student or teacher from the school");
            System.out.println("3. Print all the students or teachers in the school");
            System.out.println("4. Allow a student or the principal to prepare for an exam, take an exam, and get the exam result");
            System.out.println("5. Print the details of a specific student, teacher, or the principal");
            System.out.println("6. Exit the program");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (option) {
                case 1:
                    // Your code goes here
                    break;
                case 2:
                    // Your code goes here
                    break;
                case 3:
                    // Your code goes here
                    break;
                case 4:
                    // Your code goes here
                    break;
                case 5:
                    // Your code goes here
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 6.");
            }
        }
    }
}
```

**Note:** This bonus assignment requires knowledge of Java's `Scanner` class for reading input from the user. If you haven't learned about `Scanner` yet, you might want to read up on it before attempting this assignment.



## Submission

Once you have completed your assignment, submit your .java files for grading. Make sure your code is properly formatted and commented.

Good luck!
