package com.adi.proxy_pattern.remote_proxy.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.List;

/**
 * 公共接口
 * 实现远程调用接口需要继承Remote接口
 * @param <T>
 */
public interface ISortList<T> extends Remote {

    List<T> sortList(Collection<T> original) throws RemoteException;

}
