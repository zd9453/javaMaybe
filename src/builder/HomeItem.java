package builder;

/**
 * ProjectName: javaMaybe
 * Package: builder
 * className: HomeItem
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 14:44
 */
public abstract class HomeItem {

    protected String type;
    protected String title;
    protected String classId;

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }
}
