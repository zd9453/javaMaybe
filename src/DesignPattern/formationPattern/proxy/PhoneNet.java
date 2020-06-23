package DesignPattern.formationPattern.proxy;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.proxy
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 9:35
 */
public class PhoneNet implements INetwork {
    @Override
    public void getInformation() {
        System.out.println("use phone get info");
    }

    @Override
    public void display() {
        System.out.println("phone show");
    }
}
