package Practice.Builder.a5;

public class main {
    public static void main(String[] args) {
        Book b1 = new Book.Builder()
                .addTitle("Vịt vàng")
                .addPage(50)
                .addTacgia("Hưng")
                .addChuong("Chương 1")
                .addChuong("Chương 2")
                .addChuong("Chương 3")
                .addChuong("Chương 4")
                .build();
        System.out.println(b1.inSach());
    }
}

