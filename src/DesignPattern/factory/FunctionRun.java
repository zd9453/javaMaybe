package DesignPattern.factory;

import linkedlist.MyLinkedList;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.factory
 * describe:
 * create by "zhangDong"
 * createDate: 2021/5/20
 * createTime: 9:46
 */
public class FunctionRun {
    public static void main(String[] args) {

//        IFactory factory = new PFactory();
//        IBaseBean bean = factory.createBean();
//        bean.doSomething();

        int[] array = {9, 21, 34, 1, 5, 2, 6};
//        maoPaoSort(array);
//        selectSort(array);

//        displayArray(array);

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("this");
        linkedList.add("this is");
        linkedList.add("this all");
        linkedList.add("this");
        linkedList.add("this is");
        linkedList.add("this all");

        linkedList.add(3, "hahha");

        linkedList.remove(1);

        linkedList.display();

    }


    /**
     * 冒泡排序
     */
    private static void maoPaoSort(int[] list) {
        for (int j = list.length - 1; j > 0; j--) {
            boolean flag = true;
            for (int i = 0; i < j; i++) {
                if (list[i] > list[i + 1]) {
                    changeIndex(list, i + 1, i);
                    flag = false;
                }
            }
            if (flag)
                break;
        }
    }

    /**
     * 选择排序
     */
    private static void selectSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }
            if (j != min) {
                System.out.println("change " + j + "  " + min);
                changeIndex(array, j, min);
            }
        }
    }

    /**
     * 交换数组中两个坐标的值
     */
    private static void changeIndex(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    /**
     * 打印数组
     */
    private static void displayArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
