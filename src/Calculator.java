import java.util.Scanner;

/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * className: Calculator
 * describe: 模拟计算器
 * create by "zhangDong"
 * createDate: 2019/9/11 0011
 * createTime: 14:24
 */
public class Calculator {

    private float aNum(float a, float b) {
        return a + b;
    }

    private float bNum(float a, float b) {
        return a - b;
    }

    private float cNum(float a, float b) {
        return a * b;
    }

    private float dNum(float a, float b) {
        return a / b;
    }

    public void startCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        String one = scanner.nextLine();
        float a = Float.parseFloat(one);

        while (true) {
            System.out.println("输入符号：");
            String str = scanner.nextLine();
            if (str.equals("=")) {
                System.out.println("结束");
                break;
            }
            if (!(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))) {
                System.out.println("只能是【+ - * / =】里面的符号！");
                continue;
            }
            System.out.println("输入第二个数：");
            String two = scanner.nextLine();
            float b = Float.parseFloat(two);

            switch (str) {
                case "+":
                    a = aNum(a, b);
                    break;
                case "-":
                    a = bNum(a, b);
                    break;
                case "*":
                    a = cNum(a, b);
                    break;
                case "/":
                    a = dNum(a, b);
                    break;
            }
            System.out.println(a);
        }
    }
}
