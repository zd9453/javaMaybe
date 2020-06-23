import inteface.BaseInterface;
import inteface.Inter;
import inteface.Interface1;

/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * className: Demo1
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 13:45
 */
public class Demo1 implements BaseInterface {
    @Override
    public void doBaseThring() {

    }

    class Demo2 implements Interface1 {
        @Override
        public void doInterface1Thring() {

        }

        @Override
        public void doBaseThring() {

        }
    }

    class Demo3 implements Inter {
        @Override
        public void doInterTring() {

        }

        @Override
        public void doInterface1Thring() {

        }

        @Override
        public void doBaseThring() {

        }
    }
}
