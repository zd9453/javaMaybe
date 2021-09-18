package tree;

import java.util.*;

/**
 * ProjectName: javaMaybe
 * Package: tree
 * describe:
 * create by "zhangDong"
 * createDate: 2021/3/24
 * createTime: 17:51
 */
public class HafManTree {

    public static void main(String[] args) {
        HafManTree hafManTree = new HafManTree();

        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(new TreeNode<>("hi", 200));
        list.add(new TreeNode<>("she", 20));
        list.add(new TreeNode<>("me", 40));
        list.add(new TreeNode<>("your", 26));
        list.add(new TreeNode<>("this", 120));

        hafManTree.createHuffmanTree(list);

        hafManTree.displayTree(hafManTree.root);

    }

    private TreeNode root;

    private void displayTree(TreeNode root) {

        LinkedList<TreeNode> stack=new LinkedList<>();
        stack.offer(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.data);
            if (null != node.left)
                stack.offer(node.left);
            if (null != node.right)
                stack.offer(root.right);
        }

    }

    public TreeNode createHuffmanTree(ArrayList<TreeNode> list) {
        while (null != list && list.size() > 1) {
            Collections.sort(list);

            TreeNode leftNode = list.get(list.size() - 1);
            TreeNode rightNode = list.get(list.size() - 2);
            TreeNode parentNode = new TreeNode<>("P", leftNode.count + rightNode.count);

            parentNode.left = leftNode;
            leftNode.parent = parentNode;
            parentNode.right = rightNode;
            rightNode.parent = parentNode;

            list.remove(leftNode);
            list.remove(rightNode);
            list.add(parentNode);
        }
        if (null != list)
            root = list.get(0);
        return root;
    }

    public static class TreeNode<T> implements Comparable<TreeNode<T>> {

        private T data;             //数据
        private int count;          //重复的次数
        private TreeNode<T> left;   //左孩子
        private TreeNode<T> right;  //右孩子
        private TreeNode<T> parent; //父节点

        public TreeNode(T data, int count) {
            this.data = data;
            this.count = count;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public TreeNode<T> getLeft() {
            return left;
        }

        public void setLeft(TreeNode<T> left) {
            this.left = left;
        }

        public TreeNode<T> getRight() {
            return right;
        }

        public void setRight(TreeNode<T> right) {
            this.right = right;
        }

        public TreeNode<T> getParent() {
            return parent;
        }

        public void setParent(TreeNode<T> parent) {
            this.parent = parent;
        }

        @Override
        public int compareTo(TreeNode<T> bean) {
            return this.count - bean.count;
        }
    }
}
