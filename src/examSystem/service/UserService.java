package examSystem.service;

import examSystem.bean.User;
import examSystem.utils.UserFileReader;

/**
 * ProjectName: javaMaybe
 * Package: examSystem.service
 * className: UserService
 * describe: 处理用户登录
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 16:32
 */
public class UserService {

    public boolean login(String name, String pass) {
        User user = UserFileReader.getInstance().getUser(name);
        if (null == user)
            return false;

        return pass.equals(user.getPass());
    }
}
