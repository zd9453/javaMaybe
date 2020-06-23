package DesignPattern.formationPattern.decorator;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.decorator
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 17:00
 */
public abstract class MyHome implements IHome {

    protected IHome home;

    public MyHome(IHome home) {
        this.home = home;
    }

    @Override
    public void displayHome() {
        home.displayHome();
        System.out.println("get a home ");
    }
}
