package bankSystem.data;

import bankSystem.FileUtils;
import bankSystem.bean.User;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

/**
 * ProjectName: javaMaybe
 * Package: bankSystem.data
 * className: AtmDao
 * describe: 实际操作数据
 * create by "zhangDong"
 * createDate: 2019/11/5 0005
 * createTime: 17:07
 */
public class AtmDao {

    //用户信息读取
    private HashMap<String, User> userHashMap = new HashMap<>();

    private static final String DATA_URL = "src//bankSystem//data//user.txt";

    {
        //静态代码块读取用户表，缓存到userHashMap
        File file = new File(DATA_URL);
        FileUtils.createFile(file, false);

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String readLine = br.readLine();
            while (null != readLine) {
                String[] split = readLine.split("--");
                User user = new User(split[0], split[1], Float.parseFloat(split[2]));
                userHashMap.put(user.getName(), user);
                readLine = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fr) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 更新用户信息
     *
     * @param user .
     */
    public void updateUser(User user) {
        if (null == user)
            return;
        //更新缓存
        userHashMap.put(user.getName(), user);
        this.updateData();
    }

    /**
     * 查询一个用户
     *
     * @param name .
     * @return .
     */
    public User getUser(String name) {
        return userHashMap.get(name);
    }

    private void updateData() {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(new File(DATA_URL));
            bw = new BufferedWriter(fw);

            //更新本地文件
            Iterator<String> iterator = userHashMap.keySet().iterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                User user = userHashMap.get(name);
                StringBuilder builder = new StringBuilder(user.getName());
                builder.append("--");
                builder.append(user.getPass());
                builder.append("--");
                builder.append(user.getMoney());

                bw.write(builder.toString());
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
