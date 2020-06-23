package DesignPattern.createPattern.factoryBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.factoryBean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 15:37
 */
public class HomeFactory implements IFactory {
    @Override
    public IModuleHome createModuleHome() {
        return new MuduleHome();
    }

    @Override
    public IModuleBack createModuleBack() {
        return new MuduleBack();
    }
}
