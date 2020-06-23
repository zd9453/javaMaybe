/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * className: ArrayBox
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/11 0011
 * createTime: 15:17
 */
public class ArrayBox<T> {

    private static final int DEFAULT_SIZE = 10;

    //设计存储
    Object[] listData;
    //目前存储到的个数
    int indexNow = 0;

    public ArrayBox() {
        listData = new Object[DEFAULT_SIZE];
    }

    public ArrayBox(int size) {
        listData = new Object[size];
    }

    /**
     * 存储元素
     *
     * @param item item
     * @return 是否存储成功
     */
    public boolean saveItem(T item) {
        //首先确保容量
        this.checkList(indexNow + 1);
        //存,同时有效个数+1
        listData[indexNow++] = item;
        return true;
    }

    /**
     * 获取下标下对应的item
     *
     * @param index .
     * @return .
     */
    public T getItem(int index) {
        this.checkIndex(index);
        return (T) (listData[index]);
    }

    /**
     * 移除
     *
     * @param index .
     * @return .移除的item
     */
    public T removeItem(int index) {
        this.checkIndex(index);
        T moveItem = (T) (listData[index]);
        for (int i = index; i < indexNow - 1; i++) {
            listData[i] = listData[i + 1];
        }
        listData[--indexNow] = null;
        return moveItem;
    }

    /**
     * 检查下标是否越界
     *
     * @param index .要操作的下标
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= indexNow) {
            throw new BoxException("size:" + indexNow + " ,index:" + index);
        }
    }

    /**
     * 检查容量是否够用
     *
     * @param minSize 所需最小容量
     */
    private void checkList(int minSize) {
        //存不下了
        if (minSize > listData.length) {
            //需要扩容
            this.grow(minSize);
        }
    }

    /**
     * 存储扩容
     *
     * @param minSize 所需最小容量
     */
    private void grow(int minSize) {
        int length = listData.length;
        //每次扩容原来容量的1.5倍
        int newSize = length + (length >> 1);
        //扩容之后还不够用，那就直接扩容至所需容量
        if (minSize > newSize)
            newSize = minSize;
        //创建一个新数组 把原来数组的内容转移到新数组
        listData = this.makeNewList(newSize, listData);
    }

    /**
     * 创建一个新数组 把原来数组的内容转移到新数组
     *
     * @param newSize 新数组的长度
     */
    private Object[] makeNewList(int newSize, Object[] oldArray) {
        Object[] newList = new Object[newSize];
        for (int i = 0; i < oldArray.length; i++)
            newList[i] = oldArray[i];
        //重新给容器赋值
        return newList;
    }

}
