package Part2_DesignPattern.Behavioral.Observer.CA6;

public class Dashboard implements PlayerDataListener{
    PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        this.playerData.dangKy(this);
    }

    @Override
    public void listen(PlayerData playerData) {
        System.out.println(playerData.toString());
    }
}
