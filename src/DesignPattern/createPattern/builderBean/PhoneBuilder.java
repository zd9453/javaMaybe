package DesignPattern.createPattern.builderBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.builderBean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 16:01
 */
public class PhoneBuilder implements Builder {

    private Phone mPhone;

    public PhoneBuilder() {
        this.mPhone = new Phone();
    }

    @Override
    public Builder buildColor(String color) {
        this.mPhone.setColor(color);
        return this;
    }

    @Override
    public Builder buildSize(String size) {
        this.mPhone.setSize(size);
        return this;
    }

    @Override
    public Builder buildMemory(int memory) {
        this.mPhone.setMemory(memory);
        return this;
    }

    @Override
    public Builder buildName(String name) {
        this.mPhone.setName(name);
        return this;
    }

    @Override
    public Phone build() {
        return this.mPhone;
    }
}
