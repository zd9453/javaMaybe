package bankSystem.bean;

import java.io.Serializable;

/**
 * ProjectName: javaMaybe
 * Package: bankSystem.bean
 * className: User
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/5 0005
 * createTime: 16:19
 */
public class User implements Serializable {

    //为序列号做准备
    private static final long serialVersionUID = 502454003316996469L;

    private String name;
    private String pass;
    private Float money;

    public User(String name, String pass, Float money) {
        this.name = name;
        this.pass = pass;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User {" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", money=" + money +
                '}';
    }
}
