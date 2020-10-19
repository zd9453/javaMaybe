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


       /* Window window1 = new Window("成都", System12306.getInstance());
        Window window2 = new Window("上海", System12306.getInstance());
        Window window3 = new Window("北京", System12306.getInstance());

        window1.start();
        window2.start();
        window3.start();*/

//        char a = '.';
//        System.out.println("-:" + ((int) a));


        /*int time = -10000;

        int ceil = (int) Math.ceil(time / 1000f);
        System.out.println(ceil);

        System.out.println(String.format(Locale.CHINA, "00:%02d", ceil));*/

        //位运算
        int sI = 5; //二进制 101
        //左位移N位 *2的N次方
        System.out.println(sI << 3);    //101 << 3 --> 101000
        //右位移N位  /2的N次方取整
        System.out.println(sI >> 1);    //101 >>1 --> 10
        //与运算 同为1则为1 不同为0
        System.out.println(sI & 1);     // 101 & 001 --> 001
        //或运算 相同位上 有1为1 同为0为0
        System.out.println(sI | 2);     // 101 | 010 --> 111
        //非运算 按位取反
        System.out.println(~sI);        // ~0101 --> 1010
        //异或 相同为0 不同为1
        System.out.println(sI ^ 3);     // 101 ^ 011 --> 110


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
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
        for (int i = 0; i < 50; i++) {
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