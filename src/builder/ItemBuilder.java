package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: HomeItemBuilder
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 14:47
 */
public abstract class ItemBuilder {

    public abstract ItemBuilder buildType(String type);

    public abstract ItemBuilder buildClassId(String classId);

    public abstract ItemBuilder buildTitle(String title);

    public abstract HomeItem create();
}
