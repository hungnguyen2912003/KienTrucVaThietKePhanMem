package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc3;

public class COD_Payment implements ThanhToan{
    @Override
    public double Payment(double Dongia) {
        if(Dongia > 2000000){
            return Dongia * 0.02;
        }
        return 0;
    }
}
