package DesignPattern.more.bean.package1;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.more.bean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 10:58
 */
public class Phone extends ToolBase {

    public Phone(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("use " + name + " phone call !");
    }
}
