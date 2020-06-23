package DesignPattern.more.bean.package1;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.more.bean
 * describe: 工具的抽象类
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 10:56
 */
public abstract class ToolBase {

    protected String name;

    public ToolBase(String name) {
        this.name = name;
    }

    public abstract void doSomething();
}
