package com.adi.proxy_pattern.remote_proxy.server;

import com.adi.proxy_pattern.remote_proxy.common.ISortList;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 被代理远程对象
 * 需要继承UnicastRemoteObject
 */
public class IntegerListSort extends UnicastRemoteObject implements ISortList {
    protected IntegerListSort() throws RemoteException {
        super();
    }
    @Override
    public List sortList(Collection original) throws RemoteException {
        System.out.println("------方法被调用--------");
        return  (List) original.stream()
                              .sorted((o1,o2)->{
                                  Integer v1 = (Integer) o1;
                                  Integer v2 = (Integer) o2;
                                  return v1.compareTo(v2);
                              })
                              .collect(Collectors.toList());

    }
}
