package DesignPattern.createPattern.builderBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.builderBean
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 15:57
 */
public interface Builder {

    Builder buildColor(String color);

    Builder buildSize(String size);

    Builder buildMemory(int memory);

    Builder buildName(String name);

    Phone build();
}
