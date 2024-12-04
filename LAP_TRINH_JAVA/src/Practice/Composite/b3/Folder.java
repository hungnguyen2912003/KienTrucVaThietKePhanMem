package Practice.Composite.b3;

import java.util.ArrayList;

public class Folder extends Explorer{

    ArrayList<Explorer> ds = new ArrayList<>();

    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();

        builder.append(ten).append("\n");
        for(Explorer explorer : ds){
            explorer.p = this.p + "\t";
            builder.append(explorer.p)
                    .append(explorer.getStringTreeFolder()).append("\n");
            explorer.p = "";
        }

        return builder.toString();
    }

    @Override
    public String getPath() {
        return ten;
    }

    @Override
    public Explorer addItem(Explorer item) {
        ds.add(item);
        return this;
    }

    @Override
    public void removeItem(Explorer item) {
        ds.remove(item);
    }
}
