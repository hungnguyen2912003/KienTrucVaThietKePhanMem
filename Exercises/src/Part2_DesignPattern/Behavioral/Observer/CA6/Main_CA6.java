package Part2_DesignPattern.Behavioral.Observer.CA6;

public class Main_CA6 {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData(200, 3,100);
        PlayerDataListener dashBoard = new Dashboard(playerData);
        System.out.println("Thiết lập thời gian mới: ");
        playerData.setThoiGian(400);
        System.out.println("Thiết lập số lượt chơi mới: ");
        playerData.setSoLuotChoi(4);
        System.out.println("Thiết lập điểm số mới: ");
        playerData.setDiemSo(200);
    }
}
