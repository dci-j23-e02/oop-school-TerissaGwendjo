public class Teacher extends Person {
    private String subjectSpecialty;
    private int yearsOfExperience;

    public Teacher(String name, int age, String address, String subjectSpecialty, int yearsOfExperience) {
        super(name, age, address);
        this.subjectSpecialty = subjectSpecialty;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSubjectSpecialty() {
        return subjectSpecialty;
    }

    public void setSubjectSpecialty(String subjectSpecialty) {
        this.subjectSpecialty = subjectSpecialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String getDescription() {
        return "Teacher";
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject Specialty: " + subjectSpecialty + ", Years of Experience: " + yearsOfExperience;
    }
}
