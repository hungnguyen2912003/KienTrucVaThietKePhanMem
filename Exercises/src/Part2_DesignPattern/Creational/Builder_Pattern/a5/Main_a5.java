package Part2_DesignPattern.Creational.Builder_Pattern.a5;

public class Main_a5 {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .addTuade("Con vịt vàng")
                .addSoTrang(200)
                .addTacgia("Hưng Nguyễn")
                .addChuong("Chương 1: Trứng vịt")
                .addChuong("Chương 2: Vịt con")
                .addChuong("Chương 3: Vịt vàng trưởng thành")
                .addChuong("Chương 4: Thịt vịt nướng")
                .build();
        System.out.println(book.toString());

        Book book2 = new Book.Builder()
                .addTuade("63CNTT")
                .addSoTrang(100)
                .addTacgia("Nha Trang University")
                .addChuong("Chương 1: Sinh viên năm nhất")
                .addChuong("Chương 2: Sinh viên năm hai")
                .addChuong("Chương 3: Sinh viên năm ba")
                .addChuong("Chương 4: Sinh viên năm bốn")
                .addChuong("Chương 5: Tốt nghiệp")
                .build();
        System.out.println(book2.toString());
    }
}
