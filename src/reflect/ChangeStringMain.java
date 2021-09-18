package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ProjectName: javaMaybe
 * Package: reflect
 * className: ChangeStringMain
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/8 0008
 * createTime: 10:03
 */
public class ChangeStringMain {
   /* public static void main(String[] args) {

        String content = "thisTestString";

        System.out.println(content.length());

        Class<? extends String> aClass = content.getClass();

        try {
            Field field = aClass.getDeclaredField("value");

            field.setAccessible(true);
            char[] chars = (char[]) field.get(content);
            chars[0] = 'T';

            field.set(content, chars);

            field.setAccessible(false);

            System.out.println(content);

            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/


    public static void main(String[] args) {

       /* Class<PersonT> aClass = PersonT.class;
        PersonT personT = new PersonT("甲");

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            //方法的权限修饰
            int modifiers = method.getModifiers();
            //方法的返回值类型
            Class<?> returnType = method.getReturnType();
            System.out.println(returnType.getName());
            //参数类型
            Class<?>[] parameterTypes = method.getParameterTypes();

            if (parameterTypes.length != 0) {
                try {
                    method.invoke(personT, "something");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

            for (Class<?> type : parameterTypes) {
                System.out.println(type.getName());
            }

        }
*/

        try {
            Class<?> aClass = Class.forName("reflect.Anim");
            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Object bean = getBean("reflect.Anim");

        System.out.println(bean);
    }

    private static Object getBean(String classPath) {

        Object obj = null;
        try {
            Class<?> aClass = Class.forName(classPath);
            obj = aClass.newInstance();

            Scanner scanner = new Scanner(System.in);
            //获取所有属性
            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields) {

                String fieldName = field.getName();
                String first = fieldName.substring(0, 1).toUpperCase();
                String other = fieldName.substring(1);

                StringBuilder setMethodName = new StringBuilder("set");
                setMethodName.append(first);
                setMethodName.append(other);

                //获取set方法
                Method method = (Method) aClass.getMethod(setMethodName.toString(), field.getType());
                if (null != method) {

                    System.out.println("请给" + fieldName + "赋值：");
                    //输入的值
                    String nextLine = scanner.nextLine();

                    Class<?> type = field.getType();
                    Constructor<?> constructor = type.getConstructor(String.class);
                    Object value = constructor.newInstance(nextLine);
                    method.invoke(obj, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }

}


class PersonT extends Anim {

    private String name;
    private int age;

    private PersonT() {
        super("甲");
    }

    public PersonT(String name) {
        super(name);
        this.name = name;
    }

    public PersonT(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + " 的无参eat");
    }

    public void eat(String str) {

        System.out.println(this.name + " 的有参eat " + str);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Anim {

    private String type;
    private Integer ages;

    public Anim() {
    }

    public Anim(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAges(Integer ages) {
        this.ages = ages;
    }

    public String toString() {
        return "Anim{" +
                "type='" + type + '\'' +
                ", ages=" + ages +
                '}';
    }
}