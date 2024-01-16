import java.util.Scanner;

public class SchoolSystemModel {
    private static School school = new School();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    removePerson();
                    break;
                case 3:
                    printAllPersons();
                    break;
                case 4:
                    interactWithExam();
                    break;
                case 5:
                    printDetails();
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 6);
    }

    private static void displayMenu() {
        System.out.println("----- School System Menu -----");
        System.out.println("1. Add a student or teacher to the school");
        System.out.println("2. Remove a student or teacher from the school");
        System.out.println("3. Print all students or teachers in the school");
        System.out.println("4. Interact with an exam");
        System.out.println("5. Print details of a specific person");
        System.out.println("6. Exit");
    }

    private static void addPerson() {
        System.out.print("Enter person type (student/teacher): ");
        String personType = scanner.nextLine().toLowerCase();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        if (personType.equals("student")) {
            System.out.print("Enter grade level: ");
            int gradeLevel = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter major subject: ");
            String majorSubject = scanner.nextLine();

            Student student = new Student(name, age, address, gradeLevel, majorSubject);
            school.addStudent(student);
            System.out.println("Student added to the school.");
        } else if (personType.equals("teacher")) {
            System.out.print("Enter subject specialty: ");
            String subjectSpecialty = scanner.nextLine();

            System.out.print("Enter years of experience: ");
            int yearsOfExperience = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Teacher teacher = new Teacher(name, age, address, subjectSpecialty, yearsOfExperience);
            school.addTeacher(teacher);
            System.out.println("Teacher added to the school.");
        } else {
            System.out.println("Invalid person type.");
        }
    }

    private static void removePerson() {
        System.out.print("Enter person type to remove (student/teacher): ");
        String personType = scanner.nextLine().toLowerCase();

        System.out.print("Enter the name of the person to remove: ");
        String name = scanner.nextLine();

        if (personType.equals("student")) {
            Student student = findStudentByName(name);
            if (student != null) {
                school.removeStudent(student);
                System.out.println("Student removed from the school.");
            } else {
                System.out.println("Student not found.");
            }
        } else if (personType.equals("teacher")) {
            Teacher teacher = findTeacherByName(name);
            if (teacher != null) {
                school.removeTeacher(teacher);
                System.out.println("Teacher removed from the school.");
            } else {
                System.out.println("Teacher not found.");
            }
        } else {
            System.out.println("Invalid person type.");
        }
    }

    private static void printAllPersons() {
        System.out.print("Enter person type to print (students/teachers): ");
        String personType = scanner.nextLine().toLowerCase();

        if (personType.equals("students")) {
            school.printStudents();
        } else if (personType.equals("teachers")) {
            school.printTeachers();
        } else {
            System.out.println("Invalid person type.");
        }
    }

    private static void interactWithExam() {
        System.out.print("Enter person type to interact with exam (student/principal): ");
        String personType = scanner.nextLine().toLowerCase();

        System.out.print("Enter the name of the person: ");
        String name = scanner.nextLine();

        if (personType.equals("student")) {
            Student student = findStudentByName(name);
            if (student != null) {
                student.prepareForExam();
                student.takeExam();
                System.out.println(student.getExamResult());
            } else {
                System.out.println("Student not found.");
            }
        } else if (personType.equals("principal")) {
            Principal principal = findPrincipalByName(name);
            if (principal != null) {
                principal.prepareForExam();
                principal.takeExam();
                System.out.println(principal.getExamResult());
            } else {
                System.out.println("Principal not found.");
            }
        } else {
            System.out.println("Invalid person type.");
        }
    }

    private static void printDetails() {
        System.out.print("Enter person type to print details (student/teacher/principal): ");
        String personType = scanner.nextLine().toLowerCase();

        System.out.print("Enter the name of the person: ");
        String name = scanner.nextLine();

        if (personType.equals("student")) {
            Student student = findStudentByName(name);
            if (student != null) {
                System.out.println(student);
            } else {
                System.out.println("Student not found.");
            }
        } else if (personType.equals("teacher")) {
            Teacher teacher = findTeacherByName(name);
            if (teacher != null) {
                System.out.println(teacher);
            } else {
                System.out.println("Teacher not found.");
            }
        } else if (personType.equals("principal")) {
            Principal principal = findPrincipalByName(name);
            if (principal != null) {
                System.out.println(principal);
            } else {
                System.out.println("Principal not found.");
            }
        } else {
            System.out.println("Invalid person type.");
        }
    }

    private static Student findStudentByName(String name) {
        for (Student student : school.getStudents()) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    private static Teacher findTeacherByName(String name) {
        for (Teacher teacher : school.getTeachers()) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

    private static Principal findPrincipalByName(String name) {
        // Assuming there's only one principal in the school
        if (school.getPrincipal().getName().equals(name)) {
            return school.getPrincipal();
        }
        return null;
    }
}

