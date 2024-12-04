package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb5;

public class NormalStudent extends Student{
    Student studentSmaller;

    public NormalStudent(String learnAbility, double minScore) {
        super(learnAbility, minScore);
    }

    @Override
    Student setStudentSmaller(Student s) {
        this.studentSmaller = s;
        return studentSmaller;
    }

    @Override
    String checkLearnAbility(double score) {
        if (score >= this.minScore) {
            return this.learnAbility;
        } else {
            return studentSmaller.checkLearnAbility(score);
        }
    }
}