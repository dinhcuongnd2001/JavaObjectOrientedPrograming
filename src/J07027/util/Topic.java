package J07027.util;

import java.util.LinkedList;

public class Topic {
    private String nameTopic;
    private static LinkedList<String> store = new LinkedList<>();
    public Topic(String nameTopic) {
        this.nameTopic = nameTopic;
        store.add(this.nameTopic);
    }
    
    public static String getTopic(int i){
        return store.get(i-1);
    }

    public String getNameTopic() {
        return nameTopic;
    }
    
}
