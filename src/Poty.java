import inteface.BaseInterface;
import inteface.BuyWather;
import inteface.Wather;

/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * className: Poty
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 15:18
 */
public class Poty implements BaseInterface, BuyWather {

    private DemoTest2019092901 bean;

    @Override
    public void doBaseThring() {
        if (null == bean)
            bean = new DemoTest2019092901();

        doFirst();
        bean.doBaseThring();
        doEnd();
    }

    private void doFirst() {
        System.out.println("doFirst ");
    }

    private void doEnd() {
        System.out.println("doEnd ");
        buyWather(new Wather("dw", "1160"));
    }

    @Override
    public void buyWather(Wather wather) {

        System.out.println(wather.toString());
    }
}
