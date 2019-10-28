package li.emily.navbar;

import java.util.HashMap;

public class TopicDB {
    private static final HashMap<Integer, String> topicMap = new HashMap();

    public static HashMap<Integer, String> getTopicMap() {
        return topicMap;
    }

    static{
        topicMap.put(1, "Asia");
        topicMap.put(2, "North America");
        topicMap.put(3, "South America");
        topicMap.put(4, "Europe");
        topicMap.put(5, "Africa");
        topicMap.put(6, "Australia");
        topicMap.put(7, "Antarctica");
    }
}
