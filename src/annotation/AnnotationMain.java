package annotation;

import java.lang.reflect.Field;

/**
 * ProjectName: javaMaybe
 * Package: annotation
 * className: AnnotationMain
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/8 0008
 * createTime: 14:13
 */

public class AnnotationMain {

    public static void main(String[] args) {
        Class<PersonA> aClass = PersonA.class;

       /* Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }*/

        try {
            Field field = aClass.getDeclaredField("name");
            MyParams annotation = field.getAnnotation(MyParams.class);
            if (null != annotation) {
                String[] value = annotation.value();
                for (String s : value) {
                    System.out.println(s);
                }
            }


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

}

class PersonA {
    @MyParams("user")
    private String name;

}


