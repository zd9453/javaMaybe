package DesignPattern.createPattern.factoryBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.factoryBean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 10:22
 */
public class HomeItem implements IFunctionItem {

    private String name;
    private int index;

    public HomeItem() {
        this.name = "首页";
        this.index = 0;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public void createFunctionItem() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "HomeItem{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
