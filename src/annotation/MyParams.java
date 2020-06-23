package annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ProjectName: javaMaybe
 * Package: annotation
 * className: MyParams
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/8 0008
 * createTime: 16:11
 */

@Target({TYPE, FIELD, METHOD, CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyParams {

    String TAG = "MyParams";

    String[] value() default TAG;

}
