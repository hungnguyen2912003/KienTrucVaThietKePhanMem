package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb5;

public class WeakStudent extends Student{
    public WeakStudent(String learnAbility, double minScore) {
        super(learnAbility, minScore);
    }

    @Override
    Student setStudentSmaller(Student s) {
        return null;
    }

    @Override
    String checkLearnAbility(double score) {
        return this.learnAbility;
    }
}
