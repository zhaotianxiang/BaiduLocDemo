package com.baidu.location.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 作者：ztx
 * 时间：2018/4/7:16:32
 */
public class DBHelper {


    private static Connection con;

    public DBHelper() {
        this.con = getConnection();
    }


    private static Connection getConnection(){
        String driver_class="com.mysql.cj.jdbc.Driver";
        String driver_url="jdbc:mysql://localhost:3306/android?serverTimezone=UTC&verifyServerCertificate=false&useSSL=false";
        String database_user="root";
        String database_password="aini1314@xiaoqing";
        try {

            Class.forName(driver_class);
            con = DriverManager.getConnection(driver_url,database_user,database_password);


        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

}