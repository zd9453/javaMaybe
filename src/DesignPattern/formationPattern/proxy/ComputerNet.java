package DesignPattern.formationPattern.proxy;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.proxy
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 9:36
 */
public class ComputerNet implements INetwork {
    @Override
    public void getInformation() {
        System.out.println("use computer get info");
    }

    @Override
    public void display() {
        System.out.println("computer show");
    }
}
