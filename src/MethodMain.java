/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * describe:
 * create by "zhangDong"
 * createDate: 2020/1/16
 * createTime: 15:34
 */
public class MethodMain {

    public static void main(String[] args) {

        int[] ints = {12, 1, 3, 4, 56};

        String content = "this is my test message";

        String reg = "\\w{11}";

        boolean matches = content.matches(reg);

        System.out.println(matches);


    }

    public ListNode addTwoNumbers(ListNode oneNode, ListNode twoNode) {
        ListNode needNode = null;
        ListNode node = null;
        int more = 0;//是否进位
        while (true) {
            //加完了
            if (oneNode == null && twoNode == null) {
                if (more != 0) {
                    node.next = new ListNode(more);
                }
                break;
            }
            int sum = more;
            if (null != oneNode) {
                sum += oneNode.val;
                oneNode = oneNode.next;
            }
            if (null != twoNode) {
                sum += twoNode.val;
                twoNode = twoNode.next;
            }
            more = sum / 10;

            if (needNode == null) {
                node = needNode = new ListNode(sum % 10);
            } else
                node = node.next = new ListNode(sum % 10);

        }
        return needNode;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
