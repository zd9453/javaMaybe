package bankSystem;

import bankSystem.bean.User;
import bankSystem.data.AtmDao;

/**
 * ProjectName: javaMaybe
 * Package: bankSystem
 * className: AtmService
 * describe:
 * create by "zhangDong"
 * createDate: 2019/11/5 0005
 * createTime: 16:23
 */
public class AtmService {

    private AtmDao atmDao = new AtmDao();

    public String login(String name, String pass) {
        User user = atmDao.getUser(name);
        if (null == user)
            return "error";
        if (pass.equals(user.getPass())) {
            return "success";
        }
        return "error";
    }

    public Float checkMoney(String name) {
        User user = atmDao.getUser(name);
        if (null != user)
            return user.getMoney();
        return 0f;
    }


    public void changeMoney(String name, Float money) {
        User user = atmDao.getUser(name);
        if (null == user)
            return;
        user.setMoney(money);
        this.atmDao.updateUser(user);
    }

}
