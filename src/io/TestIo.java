package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Date;

/**
 * ProjectName: javaMaybe
 * Package: io
 * className: TestIo
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/8 0008
 * createTime: 11:10
 */
public class TestIo {

    public static void main(String[] args) {

        try {

           /* File textpakage = new File("src/io/text");
            if (textpakage.exists()) {
                textpakage.delete();
            }
            textpakage.mkdirs();

            //获取文件夹/文件名
            System.out.println(textpakage.getName());
            //获取绝对路径
            System.out.println(textpakage.getAbsolutePath());
            //获取相对路径
            System.out.println(textpakage.getPath());

            FileWriter fileWriter = new FileWriter(textpakage.getPath() + "/dimens.xml", false);

            fileWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            fileWriter.write("\n");
            fileWriter.write("<resources>");
            fileWriter.write("\n");

            for (int i = 0; i < 1701; i++) {
                fileWriter.write("<dimen name=\"px_" + i + "\">" + Math.round(i * 0.75) + "px</dimen>");
                fileWriter.write("\n");
            }
            fileWriter.write("</resources>");

            fileWriter.flush();

            fileWriter.close();
*/
//            FileReader reader = new FileReader(textpakage.getPath() + "/test2.text");
//            char[] chs = new char[reader.read()];
//            int num = 0;
//            while ((num = reader.read(chs)) != -1) {
//                Thread.sleep(1000);
//                System.out.print(new String(chs, 0, num));
//            }

//            FileInputStream inputStream = new FileInputStream(textpakage.getPath() + "/test2.text");
//            byte[] chars = new byte[inputStream.available()];
//            int read = inputStream.read(chars);
//            System.out.println(new String(chars));


        } catch (Exception e) {
            e.printStackTrace();
        }

//        checkQQ("194946091");
    }

    public static void checkQQ(String qq) {
//         "534946o910";

        String regex = "[1][3456789][0-9]{7}";

        boolean flag = qq.matches(regex);

        if (flag) {
            System.out.println("qq=" + qq + " is ok!");
        } else {
            System.out.println("您所输入的qq：" + qq + "不合法");
        }
    }

}
