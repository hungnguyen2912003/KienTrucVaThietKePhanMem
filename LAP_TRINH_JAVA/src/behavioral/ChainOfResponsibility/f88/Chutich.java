package behavioral.ChainOfResponsibility.f88;

public class Chutich extends ChoVayF88{

    public Chutich(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }

    @Override
    ChoVayF88 capCaoHon(ChoVayF88 capCao) {
        return null;
    }

    @Override
    String xuLyVay(int soTienVay) {
        if(soTienVay <= hanMucXuLyVay)
        {
            StringBuilder builder = new StringBuilder();
            builder.append(chucVu).append("\t").append(ten).append("\t")
                    .append("Duyệt số tiền vay: ").append(soTienVay)
                    .append(". Nhớ trả tiền lại đúng hạn!");
            return builder.toString();
        }
        return "Ra ngân hàng vay!";
    }
}
