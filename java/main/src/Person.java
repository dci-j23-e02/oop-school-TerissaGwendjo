import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

interface Exam { // The Exam interface is defined to ensure that any class implementing it will have the following three methods:
    void prepareForExam(); // It doesn't return anything (void), indicating that it performs some action but doesn't provide any result.

    void takeExam();

    String getExamResult();
}

/*
* The purpose of this interface is to establish a common contract for classes that involve exams, ensuring that
* any class implementing the Exam interface must provide concrete implementations for these three methods.
* Classes like Student and Principal in the example implement this interface, and they must provide the specific
* behavior for preparing for an exam, taking an exam, and getting the exam result.

By using interfaces, you create a standardized way for different classes to express similar behaviors without enforcing a specific implementation. It promotes code flexibility and allows different classes to have their own unique implementations while adhering to a common set of methods defined by the interface.*/