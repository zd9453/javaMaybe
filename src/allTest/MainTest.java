package allTest;

import java.util.ArrayList;

/**
 * ProjectName: javaMaybe
 * Package: allTest
 * className: MainTest
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/15 0015
 * createTime: 15:08
 */
public class MainTest {

    public static void main(String[] args) {

        GetTopMotion motion = new GetTopMotion();
        //抽取试卷
        ArrayList<Topic> topics = motion.getTospics(5);
        System.out.println(topics.size());

        Student student = new Student();
        ArrayList<Topic> anwser = student.anwser(topics);

        Teacher teacher = new Teacher();
        String check = teacher.check(anwser);

        System.out.println(check);


    }

}
