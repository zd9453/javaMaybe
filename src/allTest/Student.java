package allTest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ProjectName: javaMaybe
 * Package: allTest
 * className: Student
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/15 0015
 * createTime: 17:06
 */
public class Student {

    //答题
    public ArrayList<Topic> anwser(ArrayList<Topic> topics) {
        Scanner scanner = new Scanner(System.in);
        for (Topic topic : topics) {
            System.out.println(topic.getTopicTitle());
            topic.setAnswer(scanner.nextLine());
        }
        return topics;
    }

}
