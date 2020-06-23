package list;

import java.util.*;

/**
 * ProjectName: javaMaybe
 * Package: list
 * className: ListUtils
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/14 0014
 * createTime: 13:26
 */
public class ListUtils {

    public static <T> List<T> getArrayList() {
        return new ArrayList<T>();
    }

    public static <T> List<T> getVectorList() {
        return new Vector<T>();
    }

   /*public static <T> List<T> getSetList() {
        return new <T>();
    }*/



}
