package Practice.Builder.a5;

import java.util.ArrayList;

public class Book {

    String tuade;
    int soTrang;
    String tacGia;
    ArrayList<String> ds;

    public Book(Builder b) {
        this.tuade = b.tuade;
        this.soTrang = b.soTrang;
        this.tacGia = b.tacGia;
        this.ds = b.ds;
    }

    public String inSach(){
        StringBuilder builder = new StringBuilder();

        builder.append("Tiêu đề: ").append(tuade).append("\n")
                .append("Số trang: ").append(soTrang).append("\n")
                .append("Tác giả: ").append(tacGia).append("\n");
        for(String chuong : ds){
            builder.append(chuong).append("\n");
        }

        return builder.toString();
    }

    public static class Builder{
        String tuade;
        int soTrang;
        String tacGia;
        ArrayList<String> ds = new ArrayList<>();

        public Builder addTitle(String title){
            this.tuade = title;
            return this;
        }

        public Builder addPage(int page){
            this.soTrang = page;
            return this;
        }

        public Builder addTacgia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }

        public Builder addChuong(String chuong){
            ds.add(chuong);
            return this;
        }

        public Book build(){
            return new Book(this);
        }

    }

}
