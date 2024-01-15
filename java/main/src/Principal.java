public class Principal extends Person implements Exam {
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
}