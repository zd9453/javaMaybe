package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: HomeItemBuilder
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 14:49
 */
public class HomeItemBuilder extends ItemBuilder {

    private HomeHotItem homeHotItem;

    public HomeItemBuilder() {
        homeHotItem = new HomeHotItem();
    }

    @Override
    public ItemBuilder buildType(String type) {
        homeHotItem.setType(type);
        return this;
    }

    @Override
    public ItemBuilder buildClassId(String classId) {
        homeHotItem.setClassId(classId);
        return this;
    }

    @Override
    public ItemBuilder buildTitle(String title) {
        homeHotItem.setTitle(title);
        return this;
    }

    @Override
    public HomeItem create() {
        return homeHotItem;
    }
}
