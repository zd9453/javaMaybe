package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ProjectName: javaMaybe
 * Package: list
 * className: LoginService
 * describe:
 * create by "zhangDong"
 * createDate: 2019/10/15 0015
 * createTime: 9:05
 */
public class LoginService {

    String[] uses = new String[]{"Ros", "Jack", "Tom"};
    int[] passs = new int[]{111, 222, 333};

    public String loginForArray(String name, int pass) {
        for (int i = 0; i < uses.length; i++) {
            if (uses[i].equals(name)) {
                if (passs[i] == pass)
                    return "success";
                else break;
            }
        }
        return "failed";
    }

    private ArrayList<String> userInfo = new ArrayList<>();

    {
        userInfo.add("Ros-111");
        userInfo.add("Jack-222");
        userInfo.add("Tom-333");
    }

    public String loginForList(String name, String pass) {
        for (String use : userInfo) {
            String[] split = use.split("-");
            if (split[0].equals(name)) {
                if (split[1].equals(pass))
                    return "success";
                else break;
            }
        }
        return "failed";
    }

    HashMap<String, String> userMap = new HashMap<String, String>();

    {
        userMap.put("Ros", "111");
        userMap.put("Jack", "222");
        userMap.put("Tom", "333");
    }

    public String loginMap(String name, String pass) {
        Set<String> strings = userMap.keySet();
        Set<Entry<String, String>> entries = userMap.entrySet();

        Iterator<Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + "--" + next.getValue());
        }


        String passS = userMap.get(name);
        if (null != passS && passS.equals(pass))
            return "success";
        return "failed";


    }

}
