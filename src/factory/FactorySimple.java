package factory;

import builder.HuaweiPhoneBuilder;
import builder.Phone;

/**
 * ProjectName: javaMaybe
 * Package: factory
 * className: FactorySimple
 * describe:
 * create by "zhangDong"
 * createDate: 2019/9/29 0029
 * createTime: 13:13
 */
public class FactorySimple {

    public static Phone getHuaweiPhone() {
        return new HuaweiPhoneBuilder("huawei")
                .buildName("my hua wei phone")
                .create();
    }


}
