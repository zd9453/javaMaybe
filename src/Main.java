import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        String[] nameAll = {"hahha", "heheheh", "heihie"};
        String[] passAll = {"121", "222", "333"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("账号：");
        String name = scanner.nextLine();
        System.out.println("密码：");
        String passWorld = scanner.nextLine();

        boolean have = false;

        for (int i = 0; i < nameAll.length; i++) {
            if (nameAll[i].equals(name)) {
                have = true;
                if (passAll[i].equals(passWorld)) {
                    System.out.println("成功！");
                } else {
                    System.out.println("失败！");
                }
                break;
            }
        }
        if (!have)
            System.out.println("不存在");



        /*try {
            getNum(9, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

      /*  File file = new File("test.txt");
        if (file.exists())
            file.delete();*/

        /*if (!file.exists())
            file.mkdirs();

        if (file.canWrite()) {
            String path = file.getAbsolutePath();
            System.out.println(path);
        }

        request(new CallBack() {
            @Override
            public void result(byte[] content) {
                System.out.println(new String(content));
            }
        });
*/

       /* int[] te = {2, 4, 1, 5, 7, 2, 4, 6, 9, 12, 3};

        arrayList(te);
        for (int value :
                te) {
            System.out.println(value);
        }*/


    }

    private static void getNum(int a, int b) throws Exception {

        if (b == 0)
            throw new Exception("分母为 0 ");


        int i = a % b;

        System.out.println("余数" + i);
    }

    private static void request(CallBack callBack) {
        String testStr = "jdaksdjaksdjakdaksdjada";

        String substring1 = testStr.substring(2);
        callBack.result(substring1.getBytes());

        String s2 = testStr.substring(1, 4);
        callBack.result(s2.getBytes());

        int length = testStr.length();
        callBack.result(String.valueOf(length).getBytes());

    }

    interface CallBack {

        void result(byte[] content);
    }

    private static void arrayList(int[] array) {

        //冒泡比较的次数
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
