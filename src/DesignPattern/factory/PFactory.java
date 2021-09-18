package DesignPattern.factory;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.factory
 * describe:
 * create by "zhangDong"
 * createDate: 2021/5/20
 * createTime: 9:48
 */
public class PFactory implements IFactory {
    @Override
    public IBaseBean createBean() {
        return new MyBean();
    }
}
