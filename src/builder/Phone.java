package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: Phone
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 9:20
 */
public abstract class Phone {

    protected String phoneName;
    protected String phoneCpu;
    protected String phoneSize;
    protected String phoneColor;

    public abstract void setPhoneName(String phoneName);

    public void setPhoneCpu(String phoneCpu) {
        this.phoneCpu = phoneCpu;
    }

    public void setPhoneSize(String phoneSize) {
        this.phoneSize = phoneSize;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

}
