package DesignPattern.formationPattern.adapter;

import java.util.List;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.adapter
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 10:01
 */
public class ClassAdapter extends BaseAdapter<String> {

    public ClassAdapter(List<String> data) {
        super(data);
        System.out.println(" "+data);
    }

    @Override
    public void show(int position, String bean) {
        System.out.println("show ");
    }
}
