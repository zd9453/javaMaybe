package allTest;

import java.util.*;

/**
 * ProjectName: javaMaybe
 * Package: allTest
 * className: GetTopMotion
 * describe: 随机抽题
 * create by "zhangDong"
 * createDate: 2019/10/15 0015
 * createTime: 16:43
 */
public class GetTopMotion {

    private Set<Topic> topicSet = new HashSet<>();//题库
    private Random random = new Random();

    {
        for (int i = 0; i < 10; i++) {
            Topic topic = new Topic(String.valueOf(i + 1), TopicType.OneChose);
            topic.setTopicTitle("单项选择题：" + (i + 1));
            HashMap<String, String> choseMap = new HashMap<>();
            for (int j = 0; j < 4; j++) {
                choseMap.put(String.valueOf((char) ('A' + j)), "chose" + (char) ('A' + j));
            }
            //选择
            topic.setChoseList(choseMap);
            Set<String> keySet = new HashSet<>(choseMap.keySet());
            keySet.remove("A");
            keySet.remove("B");
            keySet.remove("D");
            //正确答案
            topic.setAnswerList(keySet);
            topicSet.add(topic);
        }
    }


    /**
     * 获取试卷
     *
     * @param num 题目数量
     * @return 试卷
     */
    public ArrayList<Topic> getTospics(int num) {
        HashSet<Topic> topics = new HashSet<>();
        int size = topicSet.size();
        //题库
        ArrayList<Topic> topicArrayList = new ArrayList<>(topicSet);
        //抽题
        while (topics.size() < num) {
            topics.add(topicArrayList.get(random.nextInt(size)));
        }
        return new ArrayList<>(topics);
    }


}
