package tree;

/**
 * ProjectName: javaMaybe
 * describe: 树的一个节点
 * create by "zhangDong"
 * createDate: 2019/11/15 0015
 * createTime: 14:26
 */
public class Node<T> {

    //比较来决定左右挂的位置
    private int data;
    //数据
    private T bean;
    //左节点
    private Node<T> left;
    //右节点
    private Node<T> right;

    public Node(int data, T bean) {
        this.data = data;
        this.bean = bean;
    }

    public int getData() {
        return data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", bean=" + bean +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
