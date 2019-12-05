package com.adi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    private static final String userName = "root";
    private static final String password = "ladi";
    private static final String uri = "jdbc:mysql://localhost:3306/test";
    private static final String driverName = "com.mysql.jdbc.Driver";
    private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    static {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            if (null == getCurrentConnection()) {
                connection = DriverManager.getConnection(uri, userName, password);
                threadLocal.set(connection);
            } else {
                connection = getCurrentConnection();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection getCurrentConnection() {
        return threadLocal.get();
    }

    //开启事务
    public static void beginTransaction() {
        try {
            Connection conection = getCurrentConnection();
            conection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void commitTransaction(){
        try {
            Connection connection = getCurrentConnection();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollbackTransaction(){
        try {
            Connection connection = getCurrentConnection();
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //关闭连接
    public static void close() {
        try {
            Connection conection = getCurrentConnection();
            if (conection != null) {
                conection.close();
                threadLocal.remove();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
