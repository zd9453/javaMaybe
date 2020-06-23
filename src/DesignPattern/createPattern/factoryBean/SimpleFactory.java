package DesignPattern.createPattern.factoryBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.factoryBean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 10:42
 */
public class SimpleFactory {

    public static IFunctionItem getItem(String name) {
        switch (name) {
            case "首页":
                return new HomeItem();
            case "搜索":
                return new SearchItem();
        }
        return null;
    }

}
