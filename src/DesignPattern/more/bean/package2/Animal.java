package DesignPattern.more.bean.package2;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.more.bean.package2
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 11:12
 */
public abstract class Animal {

    protected double moveSpeed;

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public abstract double moveTime();
}
