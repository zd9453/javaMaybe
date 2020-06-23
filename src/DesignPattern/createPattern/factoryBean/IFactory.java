package DesignPattern.createPattern.factoryBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.factoryBean
 * describe:抽象工厂
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 15:34
 */
public interface IFactory {

    IModuleHome createModuleHome();

    IModuleBack createModuleBack();
}
