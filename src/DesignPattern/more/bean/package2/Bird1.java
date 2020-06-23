package DesignPattern.more.bean.package2;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.more.bean.package2
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 11:17
 */
public class Bird1 extends Bird {

    @Override
    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    @Override
    public double flyTime(double total) {
        System.out.println("Bird1 fly " + total / flySpeed);
        return total / flySpeed;
    }

    @Override
    public double moveTime() {
        return flyTime(1000);
    }
}
