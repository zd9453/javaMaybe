package tree;

/**
 * ProjectName: javaMaybe
 * describe: 模拟二叉树的实现
 * create by "zhangDong"
 * createDate: 2019/11/15 0015
 * createTime: 14:30
 */
public class Tree<T> {

    //记录树的根节点
    private Node<T> root;

    public boolean insert(int dex, T bean) {
        Node<T> tNode = new Node<>(dex, bean);
        //插入根节点
        if (null == root) {
            root = tNode;
            return true;
        }
        //已存在根节点,则从根节点开始往下比较 决定数据存储位置
        Node current = root;
        while (true) {
            Node node = current;
            current = current.getData() > dex ? current.getLeft() : current.getRight();
            if (null == current) {
                if (node.getData() > dex) {
                    node.setLeft(tNode);
                } else {
                    node.setRight(tNode);
                }
                return true;
            }
        }
    }

    public Node<T> find(int dex) {
        if (null == root)
            return null;
        Node current = root;
        while (current.getData() != dex) {
            current = current.getData() > dex ? current.getLeft() : current.getRight();
            if (null == current) {
                return null;
            }
        }
        return current;
    }

    /**
     * 前序遍历:
     * 先打印此节点 ，然后遍历左子树，最后遍历右子树
     */
    public void topOrder(Node<T> node) {
        if (null == node)
            return;
        System.out.println(node);
        topOrder(node.getLeft());
        topOrder(node.getRight());
    }

    public void bottwnOrder(Node<T> node) {
        if (null == node)
            return;
        bottwnOrder(node.getRight());
        bottwnOrder(node.getLeft());
        System.out.println(node);
    }

    /**
     * 中序遍历：
     * 先遍历左子树，然后打印自己，最后遍历右子树   ( 升序输出 )
     */
    public void inOrder(Node<T> node) {
        if (null == node)
            return;
        inOrder(node.getLeft());
        System.out.println(node);
        inOrder(node.getRight());
    }

    public boolean delete(int dex) {
        if (null == root)
            return false;

        Node<T> current = root;
        Node<T> parent = root;
        boolean isLeft = false;

        while (current.getData() != dex) {
            parent = current;
            if (current.getData() > dex) {
                isLeft = true;
                current = current.getLeft();
                if (null == current) {
                    return false;
                }
                continue;
            } else {
                isLeft = false;
                current = current.getRight();
                if (null == current)
                    return false;
                continue;
            }
        }

        if (null == current.getLeft() && null == current.getRight()) {
            //删除的是叶子节点
            //如果删除的是根节点
            if (current == root) {
                root = null;
            } else if (isLeft) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
            return true;
        } else if (null == current.getLeft()) {
            //删除的是只有一个右叶子节点的节点
            if (current == root) {
                root = current.getRight();
            } else if (isLeft) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
            return true;
        } else if (null == current.getRight()) {
            //删除的是只有一个左叶子节点的节点
            if (current == root) {
                root = current.getLeft();
            } else if (isLeft) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
            return true;
        } else {
            //删除的是有两个子节点的节点

            //找到中继后续节点
            Node<T> tNode = getSuccessNode(current);

            if (current == root) {
                root = tNode;
            } else if (isLeft) {
                parent.setLeft(tNode);
            } else {
                parent.setRight(tNode);
            }
        }
        return true;
    }

    /**
     * 寻找该节点的中继 后继
     *
     * @param node .
     * @return .
     */
    private Node<T> getSuccessNode(Node<T> node) {
        //选找到的中继后续节点
        Node<T> tagNode = node;
        //中继后续节点的父节点
        Node<T> currentParent = node;
        //查找移动 首先右移一个子节点
        Node<T> currentNode = node.getRight();

        while (currentNode != null) {
            currentParent = tagNode;
            tagNode = currentNode;
            //然后一直往左边找到底  就是存储值最接近删除节点的一个节点
            currentNode = currentNode.getLeft();
        }

        if (tagNode != node.getRight()) {
            //将找到节点的右子节点设置给 父节点的左节点
            currentParent.setLeft(tagNode.getRight());
            //中继后续设置左右节点为要删除节点的左右节点
            tagNode.setRight(node.getRight());
        }
        tagNode.setLeft(node.getLeft());
        return tagNode;
    }

    public static void main(String[] args) {
        Tree<String> objectTree = new Tree<String>();

        objectTree.insert(20, "this");
        objectTree.insert(2, "this");
        objectTree.insert(19, "this");
        objectTree.insert(222, "this");
        objectTree.insert(232, "this");
        objectTree.insert(78, "this");
        objectTree.insert(1, "this");
        objectTree.insert(80, "this");
        objectTree.insert(10, "this");
        objectTree.insert(36, "this");


//        System.out.println(objectTree.find(78));

//        objectTree.topOrder(objectTree.root);

//        objectTree.inOrder(objectTree.root);

//        objectTree.bottwnOrder(objectTree.root);

        boolean delete = objectTree.delete(222);

        System.out.println(delete);

        objectTree.inOrder(objectTree.root);

    }


}
