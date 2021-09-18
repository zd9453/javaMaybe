import builder.HomeItem;
import builder.HomeItemBuilder;
import builder.ZXPhoneBuilder;
import linkedlist.MyLinkedList;

/**
 * ProjectName: javaMaybe
 * Package: PACKAGE_NAME
 * className: TestMain
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/11 0011
 * createTime: 13:14
 */
public class TestMain {

    public static void main(String... args) {

        System.out.println("this is testMain");

//        Calculator calculator = new Calculator();
//
//        calculator.startCalculator();


       /* ArrayBox<Integer> arrayBox = new ArrayBox<>(12);

        for (int i = 1; i <= 10; i++) {
            arrayBox.saveItem(10 * i);
        }

        System.out.println(arrayBox.indexNow + "");

        for (int i = 0; i < arrayBox.listData.length; i++) {
            System.out.print(arrayBox.listData[i] + "\t");
        }

        System.out.println();
        System.out.println(arrayBox.getItem(2));


        arrayBox.removeItem(9);


        System.out.println(arrayBox.indexNow + "");
        for (int i = 0; i < arrayBox.listData.length; i++) {
            System.out.print(arrayBox.listData[i] + "\t");
        }
*/

//        PonBean ponBean = new PonBean();

//        HuaweiPhoneBuilder huaweiPhoneBuilder = new HuaweiPhoneBuilder();
//
//        new PhoneUser(huaweiPhoneBuilder).newInstance("华为手机");
//
//        System.out.println(huaweiPhoneBuilder.create().toString());
//
//        Phone phone1 = new HuaweiPhoneBuilder().buildName("huawei").buildSize("102*99").buildCpu("2he").buildColor("yellow").create();
//
//        System.out.println(phone1.toString());
//
//        Phone huaweiPhone = FactorySimple.getHuaweiPhone();
//
//        System.out.println(huaweiPhone.toString());

        HomeItem item = new HomeItemBuilder()
                .buildType("热门")
                .buildClassId("123")
                .buildTitle("test builder")
                .create();

        System.out.println(item.toString());


        Poty poty = new Poty();
        poty.doBaseThring();

        PonBean ponBean = new PonBean();

        ponBean.setName("this is test name Set so you happy my happy are you ok ?");
        System.out.println(ponBean.toString());


        System.out.println(new ZXPhoneBuilder().buildColor("color").buildCpu("cpu").create().toString());

    }

}
