package com.adi.proxy_pattern.simple_transaction_proxy;

import com.adi.DBUtils;

import java.sql.SQLException;

public class UserDaoProxy implements UserDao {

    private UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insertUser(User user){
        try {

            DBUtils.getConnection();
            DBUtils.beginTransaction();

            userDao.insertUser(user);

            DBUtils.commitTransaction();
        } catch (SQLException e) {
            DBUtils.rollbackTransaction();
        } finally {
            DBUtils.close();
        }
    }
}
