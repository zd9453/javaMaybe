package DesignPattern.createPattern.cloneBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 10:06
 */
public class CloneClass implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public CloneClass(String name) {
        this.name = name;
    }

    @Override
    public CloneClass clone() throws CloneNotSupportedException {
        System.out.println("clone object");
        return ((CloneClass) super.clone());
    }

    public CloneClass() {
        System.out.println("原型创建成功！~");
    }
}
