package com.example.layeredarchitecture.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface OrderDao {
    ResultSet getCurrentOrderId() throws SQLException, ClassNotFoundException;

}
