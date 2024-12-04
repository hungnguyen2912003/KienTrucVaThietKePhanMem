package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb5;

public abstract class Student {
    public String learnAbility;
    public double minScore;

    public Student(String learnAbility, double minScore) {
        this.learnAbility = learnAbility;
        this.minScore = minScore;
    }

    abstract Student setStudentSmaller(Student s);

    abstract String checkLearnAbility(double score);
}
