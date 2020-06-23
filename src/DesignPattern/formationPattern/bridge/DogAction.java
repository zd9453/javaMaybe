package DesignPattern.formationPattern.bridge;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.bridge
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 16:03
 */
public class DogAction implements IAction {
    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep");
    }
}
