package list;

import java.util.TreeSet;

/**
 * ProjectName: javaMaybe
 * Package: list
 * className: TestTree
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/14 0014
 * createTime: 16:17
 */
public class TestTree {
    public static void main(String[] args) {

        //无序无重复 底层 TreeMap （二叉树）
        //存入和取出的无序
        //本身有序 更加Unicode码低到高排列
        //存入里面的对象需要实现 Comparable<E>接口
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("b");
        treeSet.add("z");
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("e");

        System.out.println("a".compareTo("c"));

        System.out.println(treeSet);

        TreeSet<Per> pers = new TreeSet<>();
        pers.add(new Per("甲", 1));
        pers.add(new Per("甲", 2));
        pers.add(new Per("甲", 3));
        pers.add(new Per("甲", 4));

        System.out.println(pers);

    }

    static class Per implements Comparable<Per> {

        private String name;
        private int index;

        public Per(String name, int index) {
            this.name = name;
            this.index = index;
        }

        @Override
        public int compareTo(Per o) {
            return this.name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "Per{" +
                    "name='" + name + '\'' +
                    ", index=" + index +
                    '}';
        }
    }
}
