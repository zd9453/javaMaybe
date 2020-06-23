package examSystem.utils;

import examSystem.bean.User;
import examSystem.dao.UserDao;

import java.util.HashMap;
import java.util.Map;

/**
 * ProjectName: javaMaybe
 * describe: 证据缓存机制 读取用户信息缓存起来
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 16:58
 */
public class UserFileReader {
    //提高读取的性能  还能提供修改功能再写入文件

    private Map<String, User> userMap = new HashMap<>();

    {
        System.out.println("块执行");
        userMap.putAll(new UserDao().readFile());
    }

    private static UserFileReader instance = new UserFileReader();

    private UserFileReader() {
        System.out.println("单例执行");
    }

    public static UserFileReader getInstance() {
        return instance;
    }

    public User getUser(String name) {
        return userMap.get(name);
    }
}
