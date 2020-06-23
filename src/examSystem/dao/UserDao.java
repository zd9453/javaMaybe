package examSystem.dao;

import examSystem.bean.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ProjectName: javaMaybe
 * Package: examSystem.dao
 * className: UserDao
 * describe: 负责数据的读写  操作文件  不处理逻辑  I/O操作
 * create by "zhangDong"
 * createDate: 2019/11/11 0011
 * createTime: 16:16
 */
public class UserDao {

    //用户信息存储路径
    private static final String USER_PATH = "src\\examSystem\\dao\\user.txt";

    //查询用户信息
    public User getUser(String name) {
        User user = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(USER_PATH);
            checkFile(file);

            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] split = line.split("--");
                if (split[0].equals(name)) {
                    user = new User(split[0], split[1]);
                    break;
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileReader) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return user;
    }


    public Map<String, User> readFile() {
        HashMap<String, User> map = new HashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(USER_PATH);
            checkFile(file);

            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] split = line.split("--");
                map.put(split[0], new User(split[0], split[1]));
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileReader) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("读取文件");
        return map;
    }

    //检查文件是否存在  不存在则创建
    private void checkFile(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists())
                parentFile.mkdirs();
            boolean newFile = file.createNewFile();
            System.out.println("创建新用户信息文件: " + newFile);
        }
    }
}
