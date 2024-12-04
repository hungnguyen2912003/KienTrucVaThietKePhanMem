package Part2_DesignPattern.Structural.Composite_Pattern.b3;

public class main_b3 {
    public static void main(String[] args) {
        B3Abstract disk = new Folder("Data (D:)", "23/3/2024");

        B3Abstract folder1 = new Folder("TaiLieu", "23/3/2024");

        B3Abstract folder2 = new Folder("Design Pattern", "23/3/2024");
        B3Abstract folder3 = new Folder("Lap Trinh Java", "23/3/2024");

        B3Abstract file1 = new File("NgonNguLapTrinhC.pdf", "23/3/2024");

        B3Abstract folder4 = new Folder("LapTrinhThietBiDiDong", "23/3/2024");

        disk.addItem(folder1);


        folder1.addItem(folder2);
        folder1.addItem(folder3);
        folder1.addItem(file1);
        folder1.addItem(folder4);


        B3Abstract file_dp1 = new File("CreationalPattern.pptx", "23/3/2024");
        B3Abstract file_dp2 = new File("StructuralPattern.pptx", "23/3/2024");

        folder2.addItem(file_dp1);
        folder2.addItem(file_dp2);

        B3Abstract file_jtjava1 = new File("LapTrinhJavaCoBan.docx", "23/3/2024");
        B3Abstract file_jtjava2 = new File("LapTrinhJavaNangCao.pdf", "23/3/2024");

        folder3.addItem(file_jtjava1);
        folder3.addItem(file_jtjava2);

        B3Abstract file_lttbdd1 = new File("CoBan.pptx", "23/3/2024");
        B3Abstract file_lttbdd2 = new File("NangCao.pptx", "23/3/2024");

        folder4.addItem(file_lttbdd1);
        folder4.addItem(file_lttbdd2);

        System.out.println(disk.getStringTreeFolder());
    }
}
