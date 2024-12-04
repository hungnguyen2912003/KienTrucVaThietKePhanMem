package Part2_DesignPattern.Behavioral.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener {
    Topic topic;
    List<TinTuc> list = new ArrayList<>();

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        this.topic.dangKy(this);
        this.list = this.topic.list;
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println("Thành viên B");
        for (TinTuc l : list) {
            if (list.contains(t)){
                System.out.println(l.toString());
                return;
            }
        }
        list.add(t);
        for(TinTuc l : list){
            System.out.println(l.toString());
        }
    }
}