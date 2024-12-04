package Part2_DesignPattern.Structural.Composite_Pattern.b3;

import java.util.ArrayList;

public class Folder extends B3Abstract{

    ArrayList<B3Abstract> ls = new ArrayList<>();

    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();

        builder.append(ten).append("\n");
        for(B3Abstract file : ls){
            file.p = this.p + "\t";
            builder.append(file.p)
                    .append(file.getStringTreeFolder()).append("\n");
            file.p = "";
        }

        return builder.toString();
    }

    @Override
    String getPath() {
        return ten;
    }

    @Override
    B3Abstract addItem(B3Abstract file) {
        ls.add(file);
        return file;
    }

    @Override
    void removeItem(B3Abstract file) {
        ls.remove(file);
    }
}
