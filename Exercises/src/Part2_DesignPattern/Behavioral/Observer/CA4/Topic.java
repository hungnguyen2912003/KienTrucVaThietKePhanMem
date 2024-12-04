package Part2_DesignPattern.Behavioral.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    public List<TinTuc> list = new ArrayList<>();
    public List<TopicListener> listeners = new ArrayList<>();


    void dangKy(TopicListener listener){
        listeners.add(listener);
    }

    void huyDangKy(TopicListener listener){
        listeners.remove(listener);
    }

    void themMoi(TinTuc t){
        list.add(t);
        for(TopicListener listener : listeners){
            listener.listen(t);
        }
    }

    void capNhat(TinTuc t){
        if(list.contains(t)){
            list.set(t.maTin, t);
            for(TopicListener listener : listeners){
                listener.listen(t);
            }
        }
    }
}
