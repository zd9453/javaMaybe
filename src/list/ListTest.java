package list;

import java.util.*;

/**
 * ProjectName: javaMaybe
 * Package: list
 * className: ListTest
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/14 0014
 * createTime: 13:26
 */
public class ListTest {
    public static void main(String[] args) {
//        test();

        //  无序不重复 (发现重复的元素就不会往里面存了 只会保留第一次出现的那个)
        //  不能修改里面的元素 因为不知道位置
        //  底层是hashMap 数组+链表 --> 散列表
        Set<String> strings = new HashSet<>();
//
//        strings.add("wu");
//        strings.add("jiu");
//        strings.add("jiu");
//        strings.add("this");
//        strings.add("wu");
//
//        System.out.println(strings);
//
//        Iterator<String> iterator = strings.iterator();
//        //迭代器对象遍历
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//
//        strings.remove("wu");
//
//        System.out.println(strings);

        HashSet<Person> personHashSet = new HashSet<>();

        personHashSet.add(new Person("隔壁王", 1));
        personHashSet.add(new Person("隔壁王", 2));
        personHashSet.add(new Person("隔壁王", 3));
        personHashSet.add(new Person("隔壁王", 4));
        personHashSet.add(new Person("隔壁王", 5));

        System.out.println(personHashSet);


    }

    static class Person {
        private String name;
        private int index;

        public Person(String name, int index) {
            this.name = name;
            this.index = index;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "name='" + name + '\'' +
                    ", index=" + index +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (obj instanceof Person) {
                return this.name.equals(((Person) obj).getName());
            } else
                return false;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }

    private static void test() {
        //线程不安全的集合
        List<String> arrayList = ListUtils.getArrayList();
        arrayList.add("haha");
        for (String s : arrayList) {
            System.out.println(s);
        }
        arrayList.clear();

        //线程安全的集合
        List<Integer> vectorList = ListUtils.getVectorList();
        vectorList.add(1);
        for (Integer integer : vectorList) {
            System.out.println(integer);
        }

        Iterator<String> iterator = arrayList.iterator();

        Stack<Exception> stack = new Stack<>();

        for (int i = 0; i < 5; i++) {
            //入栈
            stack.push(new RuntimeException(String.valueOf(i)));
        }

        //判断栈内元素是否为空
        System.out.println(stack.empty());

        //查看栈顶元素
        Exception peek = stack.peek();
        System.out.println(peek.getMessage());

        //删除栈顶元素
        Exception exception = stack.pop();
        System.out.println(exception.getMessage());

        System.out.println(stack.peek().getMessage());


        Queue<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            linkedList.offer(String.valueOf(i));
        }

        System.out.println(linkedList);


        String poll = linkedList.poll();
        poll = linkedList.poll();

        System.out.println(poll);

        System.out.println(linkedList);

        System.out.println(linkedList.peek());

        System.out.println(linkedList);
    }
}
