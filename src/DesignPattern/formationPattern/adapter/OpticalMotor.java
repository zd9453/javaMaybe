package DesignPattern.formationPattern.adapter;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.adapter
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 10:35
 */
public class OpticalMotor implements IMotor {


    @Override
    public void work() {
        System.out.println("OpticalMotor work");
    }
}
