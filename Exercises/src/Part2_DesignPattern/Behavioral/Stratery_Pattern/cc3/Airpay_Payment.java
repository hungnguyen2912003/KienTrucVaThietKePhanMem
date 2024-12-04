package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc3;

public class Airpay_Payment implements ThanhToan{
    @Override
    public double Payment(double Dongia) {
        if(Dongia > 1000000)
            return Dongia * 0.03;
        return 0;
    }
}
