package DesignPattern.createPattern;

import DesignPattern.createPattern.builderBean.Phone;
import DesignPattern.createPattern.builderBean.PhoneBuilder;
import DesignPattern.createPattern.cloneBean.CloneClass;
import DesignPattern.createPattern.factoryBean.*;
import DesignPattern.createPattern.singleBean.SingletonClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.createPattern
 * describe: 设计模式test
 * create by "zhangDong"
 * createDate: 2020/5/13
 * createTime: 15:41
 */
public class CreateMain {
    private static Properties properties;

    static {
        InputStream stream = null;
        try {
            //读配置文件的内容
            stream = new FileInputStream("src/DesignPattern/createPattern/m.properties");
            properties = System.getProperties();
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != stream) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

//        single();

//        cloneObject();

//        simpleFactory();

//        abstractFactory();

//        builderTest();


        System.out.println(properties.getProperty("1"));
        System.out.println(properties.getProperty("2"));


        int sin = (int) Math.round(Math.tan(Math.PI / 4));

        System.out.println(sin);

    }

    private static void builderTest() {
        Phone phone = new PhoneBuilder()
                .buildMemory(512)
                .buildName("HuaWei")
                .buildColor("red")
                .buildSize("1G")
                .build();

        System.out.println(phone.toString());
    }

    //抽象工厂
    private static void abstractFactory() {
        HomeFactory factory = new HomeFactory();
        IModuleBack moduleBack = factory.createModuleBack();
        moduleBack.show();
        IModuleHome moduleHome = factory.createModuleHome();
        moduleHome.show();
    }

    //简单工厂
    private static void simpleFactory() {
        IFunctionItem item = SimpleFactory.getItem("搜索");
        item.createFunctionItem();

        IFunctionItem functionItem = SimpleFactory.getItem("首页");
        functionItem.createFunctionItem();
    }

    //clone原型模式
    private static void cloneObject() {
        CloneClass cloneClass = new CloneClass("原型");
        try {
            CloneClass clone = cloneClass.clone();
            System.out.println(clone.getName());
            //clone出来的是两个不同的对象 只是属性相同
            System.out.println(clone == cloneClass);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    //单例模式
    private static void single() {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        SingletonClass singletonClass3 = SingletonClass.getInstance();
        SingletonClass singletonClass4 = SingletonClass.getInstance();

        singletonClass2.setS("this is 2");

        singletonClass.getS();
    }
}