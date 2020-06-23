package DesignPattern.more.bean.package2;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.more.bean.package2
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 13:42
 */
public class Bird2 extends Animal {
    @Override
    public double moveTime() {
        System.out.println("Bird2 moveTime " + moveSpeed);
        return 0;
    }
    /*@Override
    public void setFlySpeed(double flySpeed) {
        this.flySpeed = 0;
    }

    @Override
    public double flyTime(double total) {
        System.out.println("Bird2 fly " + total / flySpeed);
        return total / flySpeed;
    }*/
}
