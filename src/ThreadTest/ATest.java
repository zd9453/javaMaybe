package ThreadTest;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectName: javaMaybe
 * Package: ThreadTest
 * className: ATest
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/7 0007
 * createTime: 11:25
 */
public class ATest {

    public static void main(String[] args) {

//        new AddUser().start();
//        new User().start();



    }


    private static void ma(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int length = arr[i].length;

            for (int j = 0; j < length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

}

//装东西的盒子
class Box {

    private static Box instance = new Box();

    private Box() {
    }

    public static Box getInstance() {
        return instance;
    }

    private List<String> list = new ArrayList<>();
    private final int MAX_SIZE = 20;

    public void add() {
        if (list.size() < MAX_SIZE) {
            list.add("addNew");
            System.out.println("add one");
        } else {
            System.out.println("盒子满了！");
        }
    }

    public void get() {
        if (list.isEmpty()) {
            System.out.println("盒子空了");
        } else {
            list.remove(0);
            System.out.println("get one");
        }
    }
}


class AddUser extends Thread {


    @Override
    public void run() {

        while (true) {
            Box.getInstance().add();
        }
    }
}

class User extends Thread {

    @Override
    public void run() {
        while (true) {
            Box.getInstance().get();
        }
    }
}