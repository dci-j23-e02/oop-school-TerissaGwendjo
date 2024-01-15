public class Principal extends Person implements Exam {
    // This indicates that the Principal class is inheriting from (extending) the Person class and is implementing the Exam interface.
    // When a class implements an interface, it agrees to provide concrete implementations for all the methods declared
    // in that interface. In this context, the Principal class must provide implementations for the prepareForExam(),
    // takeExam(), and getExamResult() methods defined in the Exam interface.
    public Principal(String name, int age, String address) {
        super(name, age, address);
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
        return "Principal";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /*
    * So, the Principal class is a specialized kind of Person (inheriting its properties) and also has the additional
    * responsibility of being able to participate in exams, as specified by the Exam interface. It must define its own
    * unique behavior for preparing for exams, taking exams, and getting exam results.
    */
}