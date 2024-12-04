package Part2_DesignPattern.Creational.Builder_Pattern.a5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String Tuade;
    int SoTrang;
    String TacGia;
    List<String> ls;

    private Book(Builder b){
        this.Tuade = b.Tuade;
        this.SoTrang = b.SoTrang;
        this.TacGia = b.TacGia;
        this.ls = b.ls;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tựa đề: ").append(Tuade).append("\t")
                .append("Số trang: ").append(SoTrang).append("\t")
                .append("Tác giả: ").append(TacGia).append("\n")
                .append("Danh sách các chương của cuốn sách\n");
        for(String chapter : ls){
            builder.append(chapter).append("\n");
        }
        return builder.toString();
    }

    public static class Builder{
        private String Tuade;
        private int SoTrang;
        private String TacGia;
        private final List<String> ls = new ArrayList<>();

        public Builder addTuade(String tuade){
            this.Tuade = tuade;
            return this;
        }

        public Builder addSoTrang(int soTrang){
            this.SoTrang = soTrang;
            return this;
        }

        public Builder addTacgia(String tacGia){
            this.TacGia = tacGia;
            return this;
        }

        public Builder addChuong(String chuong){
            ls.add(chuong);
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
