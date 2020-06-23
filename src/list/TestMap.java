package list;

import java.util.Base64;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * ProjectName: javaMaybe
 * Package: list
 * className: TestMap
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/14 0014
 * createTime: 17:04
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "yi");
        map.put(1, "jia");
        map.put(3, "bing");
        //如果键不存在才往里面添加 存在则不添加
        map.put(3, "as");
        map.put(2, "this is 2");

        System.out.println(map);

        System.out.println(map.getOrDefault(4, "this"));


        LoginService service = new LoginService();

        System.out.println(service.loginMap("Tom", "333"));

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("", "");

        byte[] decode = "this is null".getBytes();

        //Base64编码
        String encodeToString = Base64.getEncoder().encodeToString(decode);
        System.out.println(encodeToString);
        //Base64解码
        byte[] bytes = Base64.getDecoder().decode(encodeToString);
        System.out.println(new String(bytes));


    }
}
