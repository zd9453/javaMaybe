package DesignPattern.createPattern.singleBean;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern
 * describe: 单例模式
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 15:41
 */
public class SingletonClass {

    private int count = 0;
    private String s;

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        System.out.println(s);
        return s;
    }

    private static SingletonClass instance;

    private SingletonClass() {
        count++;
    }

    public int getCount() {
        System.out.println("create count : " + count);
        return count;
    }

    public static SingletonClass getInstance() {
        if (null == instance)
            instance = new SingletonClass();
        return instance;
    }

}
