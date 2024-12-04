package Practice.Composite.b3;

public class main_b3 {
    public static void main(String[] args) {
        Explorer disk = new Folder("Data (D:)", "26/3/2024");

        Explorer taiLieu = new Folder("TaiLieu", "26/3/2024");

        disk.addItem(taiLieu);

        Explorer designpattern = new Folder("Design Pattern", "26/3/2024");
        Explorer laptrinhJava = new Folder("Lap Trinh Java", "26/3/2024");
        Explorer ngonngulaptrinh = new File("NgonNguLapTrinhC.pdf", "26/3/2024");
        Explorer lttbdd = new Folder("LapTrinhThietBiDiDong", "26/3/2024");

        taiLieu.addItem(designpattern);
        taiLieu.addItem(laptrinhJava);
        taiLieu.addItem(ngonngulaptrinh);
        taiLieu.addItem(lttbdd);


        Explorer creation = new File("CreationalPattern.pptx", "26/3/2024");
        Explorer structural = new File("StructuralPattern.pptx", "26/3/2024");

        designpattern.addItem(creation);
        designpattern.addItem(structural);


        Explorer ltjavacoban = new File("LapTrinhJavaCoBan.docx", "26/3/2024");
        Explorer ltjavanangcao = new File("LapTrinhJavaNangCao.pdf", "26/3/2024");

        laptrinhJava.addItem(ltjavacoban);
        laptrinhJava.addItem(ltjavanangcao);

        Explorer coban = new File("CoBan.pptx", "26/3/2024");
        Explorer nangcao = new File("NangCao.pptx", "26/3/2024");

        lttbdd.addItem(coban);
        lttbdd.addItem(nangcao);

        System.out.println(disk.getStringTreeFolder());


    }
}
