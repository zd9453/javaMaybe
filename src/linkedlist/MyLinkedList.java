package linkedlist;

/**
 * ProjectName: javaMaybe
 * Package: linkedlist
 * describe:
 * create by "zhangDong"
 * createDate: 2021/9/18
 * createTime: 13:56
 */
public class MyLinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * 添加数据
     *
     * @param item 数据内容
     */
    public void add(E item) {
        addLast(item);
    }

    /**
     * 添加到指定位置
     *
     * @param index .
     * @param item  .
     */
    public void add(int index, E item) {
        if (index < 0 || index > size) return;
        if (index == size) {//最后一个位置添加
            addLast(item);//这个里面size++了
        } else {//中间添加
            Node<E> node = node(index);
            Node<E> prev = node.prev;
            Node<E> addNode = new Node<>(prev, item, node);
            node.prev = addNode;
            if (prev == null) first = addNode;
            else prev.next = addNode;
            size++;
        }
    }

    public void remove(E item) {

    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) return;
        Node<E> node = node(index);
        unLinkNode(node);
    }

    private void unLinkNode(Node<E> node) {
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev == null) {//删除头节点
            first = next;
            if (next != null)
                next.prev = null;
        } else {//非头节点
            prev.next = next;
            if (next != null) {
                next.prev = prev;
            } else {
                last = prev;
            }
        }
        node.prev = null;
        node.next = null;
    }

    /**
     * 尾部添加数据
     *
     * @param item 数据内容
     */
    public void addLast(E item) {
        Node<E> temp = last;
        Node<E> newNode = new Node<>(temp, item, null);
        last = newNode;
        if (temp == null) first = newNode;
        else temp.next = newNode;
        size++;
    }

    /**
     * 获取对应位置的值
     *
     * @param index 下标
     * @return 值
     */
    public E get(int index) {
        if (index < 0 || index > size - 1)
            return null;
        else
            return node(index).item;
    }

    //找节点
    private Node<E> node(int index) {
        Node<E> node;
        if (index <= (size >> 1)) {//前半部分
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {//后半部分
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    public void display() {
        Node<E> start = first;
        System.out.print("[ ");
        while (start != null) {
            System.out.print("{ " + start.item + " }");
            start = start.next;
        }
        System.out.print(" ]");
        System.out.println();

        Node<E> end = last;
        System.out.print("[ ");
        while (end != null) {
            System.out.print("{ " + end.item + " }");
            end = end.prev;
        }
        System.out.print(" ]");
    }

    private static class Node<E> {
        E item;         //节点内容
        Node<E> prev;   //上一个节点
        Node<E> next;   //下一个节点

        Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
}
