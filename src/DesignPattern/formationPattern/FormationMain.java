package DesignPattern.formationPattern;

import DesignPattern.formationPattern.adapter.ClassAdapter;
import DesignPattern.formationPattern.adapter.ElectricMotor;
import DesignPattern.formationPattern.adapter.IMotor;
import DesignPattern.formationPattern.adapter.OpticalMotor;
import DesignPattern.formationPattern.bridge.Dog;
import DesignPattern.formationPattern.bridge.DogAction;
import DesignPattern.formationPattern.proxy.ComputerNet;
import DesignPattern.formationPattern.proxy.INetwork;
import DesignPattern.formationPattern.proxy.NetworkProxy;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 9:38
 */
public class FormationMain {

    public static void main(String[] args) {

//        proxyTest();

//        adapterTest();

//        bridgeTest();




    }

    private static void bridgeTest() {
        Dog dog = new Dog(new DogAction());

        dog.doThing();
    }

    private static void adapterTest() {
        ClassAdapter adapter = new ClassAdapter(new ArrayList<String>());
        adapter.show(1, null);

        IMotor motor = new ElectricMotor();
        motor.work();

        IMotor a = new OpticalMotor();
        a.work();
    }

    private static void proxyTest() {
        INetwork network = new ComputerNet();

        NetworkProxy networkProxy = new NetworkProxy(network);

        INetwork instance = (INetwork) Proxy.newProxyInstance(
                network.getClass().getClassLoader(),
                network.getClass().getInterfaces(),
                networkProxy);

        instance.getInformation();
    }
}
