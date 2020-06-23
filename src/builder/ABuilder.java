package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: ABuilder
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 9:26
 */
public abstract class ABuilder {

    public abstract ABuilder buildName(String name);

    public abstract ABuilder buildSize(String size);

    public abstract ABuilder buildColor(String color);

    public abstract ABuilder buildCpu(String cpu);

    public abstract Phone create();

    protected abstract void clear();

}
