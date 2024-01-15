public class Student extends Person implements Exam {
    private int gradeLevel;
    private String majorSubject;

    public Student(String name, int age, String address, int gradeLevel, String majorSubject) {
        super(name, age, address);
        this.gradeLevel = gradeLevel;
        this.majorSubject = majorSubject;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }

    @Override
    public void prepareForExam() {
        System.out.println(getName() + " is preparing for the exam.");
    }

    @Override
    public void takeExam() {
        System.out.println(getName() + " is taking the exam.");
    }

    @Override
    public String getExamResult() {
        return getName() + "'s exam result: Pass";
    }

    @Override
    public String getDescription() {
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade Level: " + gradeLevel + ", Major Subject: " + majorSubject;
    }
}

