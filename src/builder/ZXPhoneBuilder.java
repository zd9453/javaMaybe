package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: ZXPhoneBuilder
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/30 0030
 * createTime: 14:28
 */
public class ZXPhoneBuilder extends ABuilder {

    private ZXPhone zxPhone;

    public ZXPhoneBuilder() {
        if (null == zxPhone)
            zxPhone = new ZXPhone();
    }

    @Override
    public ABuilder buildName(String name) {
        zxPhone.setPhoneName(name);
        return this;
    }

    @Override
    public ABuilder buildSize(String size) {
        zxPhone.setPhoneSize(size);
        return this;
    }

    @Override
    public ABuilder buildColor(String color) {
        zxPhone.setPhoneColor(color);
        return this;
    }

    @Override
    public ABuilder buildCpu(String cpu) {
        zxPhone.setPhoneCpu(cpu);
        return this;
    }

    @Override
    public Phone create() {
        return zxPhone;
    }

    @Override
    protected void clear() {
        zxPhone = null;
    }
}
