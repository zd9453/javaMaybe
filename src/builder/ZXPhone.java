package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: ZXPhone
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/30 0030
 * createTime: 14:29
 */
public class ZXPhone extends Phone {
    @Override
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public String toString() {
        return "ZXPhone {" +
                "phoneName='" + phoneName + '\'' +
                ", phoneCpu='" + phoneCpu + '\'' +
                ", phoneSize='" + phoneSize + '\'' +
                ", phoneColor='" + phoneColor + '\'' +
                '}';
    }
}
