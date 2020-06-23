package ThreadTest;

import java.util.HashMap;
import java.util.Map;

/**
 * ProjectName: javaMaybe
 * Package: ThreadTest
 * className: ThreadMain
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/7 0007
 * createTime: 10:00
 */
public class ThreadMain {
    public static void main(String[] args) {

       /* ThreadM thread1 = new ThreadM("路人甲");
        ThreadM thread2 = new ThreadM("路人乙");
        ThreadM thread3 = new ThreadM("路人丙");

        thread1.start();
        thread2.start();
        thread3.start();

        new Thread(new Person("A")).start();
        new Thread(new Person("B")).start();
        new Thread(new Person("C")).start();*/


        Window window1 = new Window("成都", System12306.getInstance());
        Window window2 = new Window("上海", System12306.getInstance());
        Window window3 = new Window("北京", System12306.getInstance());

        window1.start();
        window2.start();
        window3.start();


    }
}

class ThreadM extends Thread {

    private int con = 10;

    public ThreadM(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < con; i++) {
            System.out.println(getName() + "  run " + i);
        }
    }
}

class Person implements Runnable {

    private String name;
    private int con = 10;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < con; i++) {
            System.out.println(name + "  run " + i);
        }
    }

}

class Window extends Thread {

    private System12306 system12306;

    public Window(String name, System12306 system12306) {
        super(name);
        this.system12306 = system12306;
    }

    @Override
    public void run() {
        while (system12306.have()) {
            system12306.deleteTip(getName());
        }
    }
}

class System12306 {

    private static System12306 instance = new System12306();

    private System12306() {
    }

    public static System12306 getInstance() {
        return instance;
    }

    private Map<Integer, Tip> tips = new HashMap<>();

    {
        //初始化票
        for (int i = 0; i < 100; i++) {
            tips.put(i, new Tip(i));
        }
    }

    public synchronized void deleteTip(String name) {
        if (tips.isEmpty()) {
            return;
        }
        Tip tip = tips.remove(tips.size() - 1);
        System.out.println(name + "卖出一张" + tip.toString() + "票，剩余票：" + tips.size());
    }

    public synchronized boolean have() {
        return !tips.isEmpty();
    }

}

/**
 * 车票
 */
class Tip {
    private String target;
    private int id;

    public Tip(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tip{" +
                "target='" + target + '\'' +
                ", id=" + id +
                '}';
    }
}