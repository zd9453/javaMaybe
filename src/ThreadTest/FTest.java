package ThreadTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ProjectName: javaMaybe
 * Package: ThreadTest
 * className: FTest
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/7 0007
 * createTime: 14:46
 */
public class FTest {
    public static void main(String[] args) {

      /*  //4根筷子
        B b1 = new B(1);
        B b2 = new B(2);
        B b3 = new B(3);
        B b4 = new B(4);


        PersonS 甲 = new PersonS("甲", b1, b2);
        PersonS 乙 = new PersonS("乙", b2, b3);
        PersonS 丙 = new PersonS("丙", b3, b4);
        PersonS 丁 = new PersonS("丁", b4, b1);

        甲.start();
        乙.start();
        丙.start();
        丁.start();*/


//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("------");
//            }
//        }, 2000);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(String.valueOf((char) (97 + i)));
        }

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            private long start = 0;
            @Override
            public void run() {
                long millis = System.currentTimeMillis();
                if (this.start == 0)
                    this.start = millis;
                System.out.println(millis);

                if ((millis - start) >= 3000) {
                    timer.cancel();
                }
            }
        }, 1000, 1000);


    }

}

class PersonS extends Thread {

    private B left;
    private B right;

    public PersonS(String name, B left, B right) {
        super(name);
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        synchronized (left) {
            System.out.println(getName() + " " + left.toString());
            synchronized (right) {
                System.out.println(getName() + " " + right.toString());
            }
        }
    }
}

class B {
    private int num;

    public B(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "筷子>>>{" +
                "num=" + num +
                '}';
    }
}
