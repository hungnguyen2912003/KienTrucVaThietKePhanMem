package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb5;

public class Main_CB5 {
    public static void main(String[] args) {
        Student xuatSac = new NormalStudent("Xuất sắc", 9);
        Student gioi = new NormalStudent("Giỏi", 8);
        Student kha = new NormalStudent("Khá", 7);
        Student trungBinh = new NormalStudent("Trung bình", 5);
        Student yeu = new WeakStudent("Yếu", 0);
        xuatSac.setStudentSmaller(gioi)
                .setStudentSmaller(kha)
                .setStudentSmaller(trungBinh)
                .setStudentSmaller(yeu);
        System.out.println(xuatSac.checkLearnAbility(6));
    }
}
