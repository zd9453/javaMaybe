package allTest;

import java.util.ArrayList;
import java.util.Locale;

/**
 * ProjectName: javaMaybe
 * Package: allTest
 * className: Teacher
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/15 0015
 * createTime: 17:15
 */
public class Teacher {


    public String check(ArrayList<Topic> topics) {
        int cont = 0;

        for (Topic topic : topics) {
            String aCase = topic.getAnswer().toUpperCase(Locale.CHINA);
            if (topic.getAnswerList().contains(aCase)) {
                cont++;
            }
        }

        return "成绩：" + (cont / topics.size() * 100);

    }

}
