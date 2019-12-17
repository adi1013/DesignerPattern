package com.adi.proxy_pattern.remote_proxy.server;

import com.adi.proxy_pattern.remote_proxy.common.ISortList;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * 模拟服务端
 */
public class RMIServer {

    public static void main(String[] args) {
        try {
            ISortList<Integer> listSort = new IntegerListSort();
            Registry registry = LocateRegistry.createRegistry(7070);
            registry.rebind("listSort",listSort);  //注册被代理对象
            System.out.println("方法已注册");
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
