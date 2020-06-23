package DesignPattern.formationPattern.bridge;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.bridge
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 16:02
 */
public class Dog extends Animal {

    public Dog(IAction action) {
        super(action);
    }

    @Override
    public void doThing() {
        action.eat();
        action.sleep();
    }
}
