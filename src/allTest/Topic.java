package allTest;

import java.util.Map;
import java.util.Set;

/**
 * ProjectName: javaMaybe
 * Package: allTest
 * className: Topic
 * describe: 一道题的实体类
 * create by "zhangDong"
 * createDate: 2019/10/15 0015
 * createTime: 13:18
 */
public class Topic {

    private String id;//题目编号

    private TopicType type;//题型

    private String topicTitle;//题干

    private Map<String, String> choseList;//选项集合

    private Set<String> answerList;//正确答案集合

    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Topic(String id, TopicType type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TopicType getType() {
        return type;
    }

    public void setType(TopicType type) {
        this.type = type;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public Map<String, String> getChoseList() {
        return choseList;
    }

    public void setChoseList(Map<String, String> choseList) {
        this.choseList = choseList;
    }

    public Set<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(Set<String> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", topicTitle='" + topicTitle + '\'' +
                ", choseList=" + choseList +
                ", answerList=" + answerList +
                ", answer='" + answer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof Topic) {
            if (topicTitle.equals(((Topic) obj).getTopicTitle())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return topicTitle.hashCode();
    }
}
