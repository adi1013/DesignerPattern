package com.adi.proxy_pattern.simple_transaction_proxy;

import com.adi.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Override
    public void insertUser(User user) throws SQLException {
        Connection connection = DBUtils.getCurrentConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user(id, name) values (?,?)");
        preparedStatement.setString(1,user.getId());
        preparedStatement.setString(2,user.getName());
        preparedStatement.executeUpdate();
    }
}
