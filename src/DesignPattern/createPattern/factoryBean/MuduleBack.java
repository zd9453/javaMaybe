package DesignPattern.createPattern.factoryBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.factoryBean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 15:38
 */
public class MuduleBack implements IModuleBack {
    @Override
    public void show() {
        System.out.println("MuduleBack create show");
    }
}
