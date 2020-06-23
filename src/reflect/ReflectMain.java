package reflect;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

/**
 * ProjectName: javaMaybe
 * Package: reflect
 * className: ReflectMain
 * describe: 反射
 * create by "zhangDong"
 * createDate: 2019/11/7 0007
 * createTime: 16:55
 */
public class ReflectMain {
    public static void main(String[] args) {
        try {
            Reflect reflect = new Reflect("name");

            Class aClass1 = reflect.getClass();
//            Class aClass2 = Reflect.class;
//            Class aClass3 = Class.forName("reflect.Reflect");

//            Field fields = aClass3.getField("name");

//            Field[] declaredFields = aClass1.getDeclaredFields();
//            for (Field field : declaredFields) {
//                System.out.println(field.getName());
//            }

            Field declaredField = aClass1.getDeclaredField("name");
            //设置私有属性可操作
            declaredField.setAccessible(true);
            //修改私有属性
            declaredField.set(reflect, "changeYourPrivateField");
            declaredField.setAccessible(false);
            System.out.println(reflect);


//            System.out.println(fields.getName());


            System.out.println(aClass1.getName());

            //获取类修饰符的返回值
            int modifiers = aClass1.getModifiers();

            //获取实现的接口
            AnnotatedType[] annotatedInterfaces = aClass1.getAnnotatedInterfaces();
            if (annotatedInterfaces.length != 0) {
                for (AnnotatedType annotatedType : annotatedInterfaces) {
                    System.out.println(annotatedType.getType().getTypeName());
                }
            } else {
                System.out.println("annotatedInterfaces isEmpty");
            }


            Constructor<?>[] constructors = aClass1.getConstructors();
            if (constructors.length != 0) {
                for (Constructor<?> constructor : constructors) {
                    System.out.println(constructor.getParameterCount());
                    Parameter[] parameters = constructor.getParameters();
                    for (Parameter parameter : parameters) {
                        //获取构造方法的参数类型
                        System.out.println(parameter.getType());
                    }

                }
            } else {
                System.out.println("Constructor isEmpty");
            }


            //默认调用无参构造方法
//            Reflect newInstance = (Reflect) aClass1.newInstance();

            Class<?> superclass = aClass1.getSuperclass();
            System.out.println(superclass.getName());


        } catch (Exception e) {
            e.printStackTrace();
        }

      /*  Field[] fields = aClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }*/


    }
}


class Reflect {

    private String name;
    public String age;

    public Reflect(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void test() {

    }

    @Override
    public String toString() {
        return "Reflect{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
