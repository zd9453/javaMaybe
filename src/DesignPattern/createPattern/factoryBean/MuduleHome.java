package DesignPattern.createPattern.factoryBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.factoryBean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 15:37
 */
public class MuduleHome implements IModuleHome {

    @Override
    public void show() {
        System.out.println("MuduleHome create show");
    }
}
