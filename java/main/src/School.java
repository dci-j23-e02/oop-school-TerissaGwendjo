import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;

    public List<Student> getStudents() {
        return students;
    }



    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void printStudents() {
        System.out.println("Students in the school:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printTeachers() {
        System.out.println("Teachers in the school:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public Principal getPrincipal() {
        return null;
    }
}