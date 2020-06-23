package list;

/**
 * ProjectName: javaMaybe
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/14 0014
 * createTime: 16:56
 */
public class ListMain {
    public static void main(String[] args) {

        int[] a = {9, 10, 3, 6, 12, 0, 8, 4};

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
//
//        冒泡排序(a, false);
//
//        for (int i : a) {
//            System.out.print(i + " ");
//        }

//        System.out.println();
//        选择最大最小值(a);

//        选择排序(a);
        insertSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void 冒泡排序(int[] a, boolean bigToSmall) {

        int cont = 0;

        for (int i = 0, len = a.length; i < len - 1; i++) {

            for (int j = i + 1; j < len; j++) {
                cont++;
                if ((bigToSmall && a[i] < a[j])  //降序交换
                        || (!bigToSmall && (a[i] > a[j]))) { //升序交换
                    //可交换
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("执行次数：" + cont);
    }

    static void 选择最大最小值(int[] a) {

        int max = a[0];
        int min = a[0];

        for (int i = 1, len = a.length; i < len; i++) {

            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(max + "  " + min);

    }

    static void 选择排序(int[] a) {
        int temp;
        int minIndex;
        for (int i = 0, len = a.length; i < len; i++) {
            //假设最小值的索引下标
            minIndex = i;

            for (int j = i + 1; j < len; j++) {
                //遍历剩余元素，记录最小值下标
                if (a[minIndex] > a[j])
                    minIndex = j;
            }

            if (minIndex != i) {
                //如果下标改变了
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    static void insertSort(int[] a) {

        int temp;
        int index;

        for (int i = 1, len = a.length; i < len; i++) {
            //记录初始i位置数 ，如果前一个比它大  就会覆盖  所以提前备份
            temp = a[i];
            index = i;

            //依次比较前面的数  和 i位置初始的比较
            while (index > 0 && a[index - 1] >= temp) {
                //如果前一个大  则将前一个的覆盖后一个
                a[index] = a[index - 1];
                //继续比较 前前一个
                index--;
            }

            //如果 index的位置变化过  那么就把 index位置加入初始备份的值
            if (index != i) {
                a[index] = temp;
            }
        }
    }
}
