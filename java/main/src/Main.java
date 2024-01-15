public class Main {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Jason", 15, "23 Reet", 9, "Math");
        Student student2 = new Student("Regina", 14, "12 Ring", 10, "Science");

        Teacher teacher1 = new Teacher("Mrs. Fahl", 35, "45 Bren", "English", 15);
        Teacher teacher2 = new Teacher("Mr. Fru", 40, "1 Bahnhofsplatz", "History", 20);

        Principal principal = new Principal("Dr. Kouamou", 50, "12 Ring");

        school.addStudent(student1);
        school.addStudent(student2);
        System.out.println("-----------------------------------------------");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        System.out.println("-----------------------------------------------");

        school.printStudents();
        System.out.println("-----------------------------------------------");
        school.printTeachers();
        System.out.println("-----------------------------------------------");

        student1.prepareForExam();
        student1.takeExam();
        System.out.println(student1.getExamResult());

        student2.prepareForExam();
        student2.takeExam();
        System.out.println(student2.getExamResult());
        System.out.println("-----------------------------------------------");

        principal.prepareForExam();
        principal.takeExam();
        System.out.println(principal.getExamResult());
        System.out.println("-----------------------------------------------");

        System.out.println(teacher1.getYearsOfExperience());
    }
}