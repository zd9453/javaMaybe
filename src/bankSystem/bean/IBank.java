package bankSystem.bean;

/**
 * ProjectName: javaMaybe
 * Package: bankSystem.bean
 * className: IBank
 * describe: 定义银行的业务流程
 * create by "zhangDong"
 * createDate: 2019/11/5 0005
 * createTime: 15:33
 */
public interface IBank {

    //欢迎
    void welcome(boolean isIn);

    //用户登录
    void checkUser(String name, String pass);

    //增加用户
    void addUser(String name, String pass);

    //删除用户
    void deleteUser(String name, String pass);

    //存钱
    void saveMoney(String name, String pass, long money);

    //取钱
    void getMoney(String name, String pass, long money);

}
