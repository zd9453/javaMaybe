package examSystem.utils;

import java.util.HashMap;

/**
 * ProjectName: javaMaybe
 * describe: IOC 对象控制权反转
 * <p>
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 17:23
 */
public class MySpring {

    //为了管理对象的产生 将对象的控制权交给当前类完成

    //生命周期托管  实现对象的单例
    private static HashMap<String, Object> beanBox = new HashMap<>();

    public static <T> T getBean(String className) {
        Object bean = beanBox.get(className);
        if (null != bean)
            return ((T) bean);
        try {
            Class<?> aClass = Class.forName(className);
            Object instance = aClass.newInstance();
            beanBox.put(className, instance);
            return ((T) instance);
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
