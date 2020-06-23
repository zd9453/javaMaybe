package bankSystem.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ProjectName: javaMaybe
 * Package: bankSystem.bean
 * className: Bank
 * describe: 银行
 * create by "zhangDong"
 * createDate: 2019/11/5 0005
 * createTime: 15:32
 */
public class Bank implements IBank {

    private String name;

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public void welcome(boolean isIn) {
        if (isIn) {
            System.out.println("欢迎光临" + this.name);
        } else {
            System.out.println("欢迎下次光临" + this.name);
        }
    }

    @Override
    public void checkUser(String name, String pass) {

    }

    @Override
    public void addUser(String name, String pass) {
       /* File file = new File("src//bankSystem//data//user.txt");
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (!parentFile.exists())
                    parentFile.mkdirs();
                boolean newFile = file.createNewFile();
                System.out.println("创建用户表：" + newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, true);
            fos.write((name + "--" + pass).getBytes());
            fos.write("\n".getBytes());
            fos.flush();
            System.out.println("开户成功：" + name + ",Pass:" + pass);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }

    @Override
    public void deleteUser(String name, String pass) {

    }

    @Override
    public void saveMoney(String name, String pass, long money) {

    }

    @Override
    public void getMoney(String name, String pass, long money) {

    }

    @Override
    public String toString() {
        return "Bank {" +
                "name='" + name + '\'' +
                '}';
    }
}
