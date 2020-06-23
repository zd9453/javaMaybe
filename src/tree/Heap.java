package tree;

/**
 * ProjectName: javaMaybe
 * describe: 堆  特殊的二叉树
 * create by "zhangDong"
 * createDate: 2019/11/15 0015
 * createTime: 16:40
 */
public class Heap {

    private long[] data; //下标从1开始记录数据  0位置始终为0；

    private int maxL;

    private int cunt = 0;

    public Heap(int maxL) {
        data = new long[maxL + 1];
        cunt = 0;
    }

    /**
     * 堆的插入：
     * 对于第i位置上的节点  其左节点下标为 2*i  右节点的下标 2*i+1  父节点下标 i/2
     * <p>
     * 插入节点导致堆不满足堆的条件  所以需要堆化操作
     *
     * @param dataS 新插入的元素
     */
    public void insert(long dataS) {
        if (cunt >= maxL)
            return;
        int i = ++cunt;
        data[cunt] = dataS;
        while ((i / 2 > 0) //父节点存在
                && (data[i] > data[i / 2]) //自下往上堆化
        ) {
            //交换
            long temp = data[i / 2];
            data[i / 2] = data[i];
            i = i / 2;
        }
    }

    /**
     * 移除最大值
     */
    public void remove(int dex) {
        if (cunt == 0)
            return;

        //最后一个元素直接给堆顶
        data[dex] = data[cunt];
        cunt--;
        //再堆化
        heapFly(data, cunt, dex);
    }

    /**
     * 堆化
     *
     * @param data 需要堆化的堆数组表示
     * @param cunt 总个数
     * @param i    堆化起始位置
     */
    private void heapFly(long[] data, int cunt, int i) {
        long temp;
        while (true) {
            int maxPs = i;

            //先判断左节点  再判断右节点  应为堆一般情况 右大于左

            if (i * 2 <= cunt && data[i * 2] > data[i]) {
                //左节点大于父节点
                maxPs = i * 2;
            }
            if (i * 2 + 1 <= cunt && data[i * 2 + 1] > data[i]) {
                //存在右节点大于父节点
                maxPs = i * 2 + 1;
            }

            if (maxPs == i)
                break;

            //交换
            temp = data[i];
            data[i] = data[maxPs];
            data[maxPs] = temp;

            //继续向下堆化
            i = maxPs;
        }
    }


}
