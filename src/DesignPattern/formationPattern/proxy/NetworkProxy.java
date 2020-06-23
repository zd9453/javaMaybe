package DesignPattern.formationPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ProjectName: javaMaybe
 * Package: DesignPattern.formationPattern.proxy
 * describe:
 * create by "zhangDong"
 * createDate: 2020/5/19
 * createTime: 9:37
 */
public class NetworkProxy implements InvocationHandler {

    private INetwork iNetwork;

    public NetworkProxy(INetwork iNetwork) {
        this.iNetwork = iNetwork;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(iNetwork, args);

        return invoke;
    }
}
