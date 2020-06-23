package DesignPattern.more;

import DesignPattern.more.bean.package1.Computer;
import DesignPattern.more.bean.package1.Phone;
import DesignPattern.more.bean.package1.ToolBase;
import DesignPattern.more.bean.package2.Animal;
import DesignPattern.more.bean.package2.Bird;
import DesignPattern.more.bean.package2.Bird1;
import DesignPattern.more.bean.package2.Bird2;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.more.bean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 11:00
 */
public class MainTest {

    public static void main(String[] args) {

//        testBase();

//        test里氏原则();



    }

    private static void test里氏原则() {
        try {

            Bird bird1 = new Bird1();
            bird1.setFlySpeed(10);
            bird1.moveTime();

            Animal bird2 = new Bird2();
            bird2.setMoveSpeed(50);
            bird2.moveTime();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testBase() {
        ToolBase toolBase = new Phone("张三");
        toolBase.doSomething();

        ToolBase toolBase2 = new Computer("公司");
        toolBase2.doSomething();
    }
}
