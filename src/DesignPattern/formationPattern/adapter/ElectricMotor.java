package DesignPattern.formationPattern.adapter;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.adapter
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 10:34
 */
public class ElectricMotor implements IMotor {


    @Override
    public void work() {
        System.out.println("ElectricMotor work");
    }
}
