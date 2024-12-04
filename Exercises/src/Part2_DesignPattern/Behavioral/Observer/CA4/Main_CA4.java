package Part2_DesignPattern.Behavioral.Observer.CA4;

public class Main_CA4 {
    public static void main(String[] args) {
        Topic topic = new Topic();
        TopicListener tvA = new ThanhVienA(topic);
        TopicListener tvB = new ThanhVienB(topic);
        System.out.println("Thêm tin mới lần 1: ");
        topic.themMoi(new TinTuc("Vụ tai nạn", 1));
        System.out.println("Thêm tin mới lần 2: ");
        topic.themMoi(new TinTuc("Vụ cháy nhà", 2));
    }
}
