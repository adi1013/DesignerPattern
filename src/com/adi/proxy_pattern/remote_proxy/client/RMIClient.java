package com.adi.proxy_pattern.remote_proxy.client;

import com.adi.proxy_pattern.remote_proxy.common.ISortList;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;
import java.util.List;

/**
 * 模拟客户端
 */
public class RMIClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",7070);
            //获取远程桩对象，即本地代理
            ISortList<Integer> localProxy = (ISortList)registry.lookup("listSort");
            List<Integer> list2 = localProxy.sortList(Arrays.asList(67,323,888,12,43,12,999,1));
            list2.forEach(v-> System.out.println(v));
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
