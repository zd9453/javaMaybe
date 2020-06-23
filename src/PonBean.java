/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * className: PonBean
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/12 0012
 * createTime: 8:59
 */
public class PonBean extends BaseBean {

    public PonBean() {
        System.out.println("PonBean 的构造! ");
    }

    @Override
    public String toString() {
        return "PonBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
