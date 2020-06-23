package examSystem.bean;

import java.io.Serializable;

/**
 * ProjectName: javaMaybe
 * Package: examSystem.bean
 * className: User
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 16:14
 */
public class User implements Serializable {
    private static final long serialVersionUID = 2770118927274220041L;

    private String name;
    private String pass;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
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

    @Override
    public String toString() {
        return "User >> {" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
