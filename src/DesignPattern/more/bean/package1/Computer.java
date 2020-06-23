package DesignPattern.more.bean.package1;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.more.bean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 10:59
 */
public class Computer extends ToolBase {

    public Computer(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("use " + super.name + " Computer work !");
    }
}
