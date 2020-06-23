package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: HuaWeiPhone
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 9:22
 */
public class HuaWeiPhone extends Phone {

    @Override
    public void setPhoneName(String name) {
        phoneName = name;
    }

    @Override
    public String toString() {
        return "HuaWeiPhone{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneCpu='" + phoneCpu + '\'' +
                ", phoneSize='" + phoneSize + '\'' +
                ", phoneColor='" + phoneColor + '\'' +
                '}';
    }
}
