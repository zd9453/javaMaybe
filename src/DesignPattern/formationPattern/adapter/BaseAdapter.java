package DesignPattern.formationPattern.adapter;

import java.util.List;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.adapter
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 10:00
 */
public abstract class BaseAdapter<T> {

    private List<T> data;

    public BaseAdapter(List<T> data) {
        this.data = data;
    }

    public abstract void show(int position, T bean);
}
