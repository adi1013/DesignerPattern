package com.adi.proxy_pattern.simple_transaction_proxy;

import java.sql.SQLException;

public interface UserDao {

    void insertUser(User user) throws SQLException;
}
