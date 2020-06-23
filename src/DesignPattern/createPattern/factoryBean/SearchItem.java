package DesignPattern.createPattern.factoryBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.factoryBean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 10:24
 */
public class SearchItem implements IFunctionItem {

    private String name;
    private int index;

    public SearchItem() {
        this.name = "搜索";
        this.index = 1;
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
        return "SearchItem{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
