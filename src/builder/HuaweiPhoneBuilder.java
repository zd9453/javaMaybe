package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: HuaweiPhoneBuilder
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 9:29
 */
public class HuaweiPhoneBuilder extends ABuilder {

    private String type;
    Phone Phone;


    private Phone getPhone(String type) {
        if (type.equals("huawei")) {
            if (null == Phone)
                Phone = new HuaWeiPhone();

        } else {
            if (null == Phone)
                Phone = new ZXPhone();
        }
        return Phone;
    }

    public HuaweiPhoneBuilder(String type) {
        getPhone(type);
    }

    @Override
    public ABuilder buildName(String name) {
        Phone.setPhoneName(name);
        return this;
    }

    @Override
    public ABuilder buildSize(String size) {
        Phone.setPhoneSize(size);
        return this;
    }

    @Override
    public ABuilder buildColor(String color) {
        Phone.setPhoneColor(color);
        return this;
    }

    @Override
    public ABuilder buildCpu(String cpu) {
        Phone.setPhoneCpu(cpu);
        return this;
    }

    @Override
    public Phone create() {
        return Phone;
    }

    @Override
    protected void clear() {
        Phone = null;
    }
}
