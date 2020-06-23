package DesignPattern.createPattern.builderBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern.builderBean
 * describe: 一个具体的类
 * create by "zhangDong"
 * createDate: 2020/5/15
 * createTime: 15:54
 */
public class Phone {

    private String color;
    private String size;
    private int memory;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", memory=" + memory +
                ", name='" + name + '\'' +
                '}';
    }
}
