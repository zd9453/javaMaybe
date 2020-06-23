package DesignPattern.more.bean.package2;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.more.bean.package2
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 11:16
 */
public abstract class Bird extends Animal {

    protected double flySpeed;

    public abstract void setFlySpeed(double flySpeed);

    public abstract double flyTime(double total);
}
