package testString;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * ProjectName: javaMaybe
 * Package: testString
 * className: TestString
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/14 0014
 * createTime: 9:03
 */
public class TestString {

    public static void main(String[] args) {

        String s = changeOrder("this is null");

        System.out.println(s);

        String appendStr = appendStr("就是这样凭借");
        System.out.println(appendStr);

        boolean isBack = isBack("你说说你");
        System.out.println(isBack);

        String mathIsTest = moveRight("thisMathIsTest", 20);
        System.out.println(mathIsTest);

        String changeFirstChar = changeFirstChar("may be a this error");
        System.out.println(changeFirstChar);

        String num = findNum("dajsjeo");
        System.out.println(num);
    }

    private static String changeOrder(String content) {
        checkContent(content);
        StringBuffer buffer = new StringBuffer();
        for (int i = content.length() - 1; i >= 0; i--) {
            buffer.append(content.charAt(i));
        }
        return buffer.toString();
    }

    private static void checkContent(String content) {
        if (null == content || content.isEmpty())
            throw new RuntimeException("content is null or empty ");
    }

    private static String appendStr(String content) {
        String order = changeOrder(content);
        return content.concat(order);
    }

    private static boolean isBack(String content) {
        return content.equals(changeOrder(content));
    }

    /**
     * 给定字符串右位移，移出的部分补在前面
     *
     * @param content 。
     * @param step    移动位数
     * @return .
     */
    private static String moveRight(String content, int step) {
        checkContent(content);
        if (step < 0)
            throw new RuntimeException("step is " + step + " it must > 0 ");
        if (content.length() <= step)
            step = step % content.length();
        return content.substring(content.length() - step).concat(content.substring(0, content.length() - step));
    }

    private static String changeFirstChar(String content) {
        checkContent(content);

        String[] split = content.split(" ");

        for (int i = 0; i < split.length; i++) {

            if (split[i].isEmpty()) {
                continue;
            }

            split[i] = split[i].substring(0, 1).toUpperCase(Locale.CHINA).concat(split[i].substring(1));

        }

        return Arrays.toString(split);

    }

    private static String findNum(String content) {
        checkContent(content);
        //默认16个长度容量的char数组
        StringBuilder builder = new StringBuilder("a1a2a");
        //字符串底层char数组容量
        System.out.println(builder.capacity());
        StringBuilder builder1 = builder.deleteCharAt(builder.indexOf("1"));
        System.out.println(builder1.toString());
//        boolean matches = builder.toString().matches("\\d");
//        System.out.println(matches);

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) >= '0' && content.charAt(i) <= '9') {
                buffer.append(content.charAt(i));
            }
        }
        return buffer.toString();
    }

    private static boolean isMatches(String content) {

//        Pattern pattern = new Pattern();

        return content.matches("a[1-9]{2}");
    }

}
