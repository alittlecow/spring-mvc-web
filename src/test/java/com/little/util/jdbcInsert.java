package com.little.util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

/**
 * @author pengx
 * @date 2016/11/11
 */
public class jdbcInsert {

    @Test
    public void insetBatch() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/test";
            String user = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            String insertSql = "INSERT INTO sc(s_id,c_id,score) VALUES(?,?,?);";
            PreparedStatement ps = connection.prepareStatement(insertSql);
            Random r = new Random();
            for (int i = 0; i < 1; i++) {
                int s_id = r.nextInt(8)+1;//[1,9)
                int c_id = r.nextInt(3)+1;//[1,4)
                int score = r.nextInt(101);//[0,101)
                ps.setInt(1, s_id);
                ps.setInt(2, c_id);
                ps.setInt(3, score);
                ps.executeUpdate();
            }
            System.out.println("init data success....");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }


    }

    @Test
    public void printNum() throws InterruptedException {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            int t = r.nextInt(10);
            System.out.println(t);
        }

    }

}
