package DesignPattern.formationPattern.bridge;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.bridge
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 16:00
 */
public abstract class Animal {

    protected IAction action;

    public Animal(IAction action) {
        this.action = action;
    }

    public abstract void doThing();
}
