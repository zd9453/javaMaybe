package bankSystem;

/**
 * ProjectName: javaMaybe
 * Package: bankSystem
 * className: BankTest
 * describe: 银行系统测试
 * create by "zhangDong"
 * createDate: 2019/11/5 0005
 * createTime: 15:31
 */
public class BankTest {
    public static void main(String[] args) {

        AtmService atmTest = new AtmService();
        System.out.println(atmTest.login("大客户", "999"));

        System.out.println(atmTest.checkMoney("高级客户"));

        atmTest.changeMoney("大客户", 90f);

        String s = null;
        System.out.println(s);

    }
}
