package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: PhoneUser
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 9:32
 */
public class PhoneUser {

    private ABuilder builder;

     String pName = "default name";
     String pCpu = "default cpu";
     String pSize = "default size";
     String pColor = "default color";

    public PhoneUser(ABuilder builder) {
        this.builder = builder;
    }

    public void newInstance(String pName, String pCpu, String pSize, String pColor) {
        builder.buildName(pName);
        builder.buildSize(pSize);
        builder.buildCpu(pCpu);
        builder.buildColor(pColor);
    }

    public void newInstance(String pName) {
        newInstance(pName, pCpu, pSize, pColor);
    }

    public void newInstance() {
        newInstance(pName, pCpu, pSize, pColor);
    }


}
