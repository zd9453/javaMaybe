/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * className: BaseBean
 * describe: 所有类的基类
 * create by "zhangDong"
 * createDate: 2019/9/12 0012
 * createTime: 8:55
 */
public class BaseBean {

    protected String name;

    public BaseBean() {
        System.out.println("BaseBean 的构造方法~ ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
