/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author TuanDuc
 */
public class Bai1 {
    public static void main(String[] args) {
        try 
        {   String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost\\DESKTOP-VVQ6IJD\\SQLEXPRESS:1433;databaseName=Lab5"; 
            Connection conn = DriverManager.getConnection(url,user,pass);
            String sql = "select * from SINHVIEN";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                System.out.print(rs.getString("MASV") + ", ");
                System.out.print(rs.getString("HOTEN") + ", ");
                System.out.print(rs.getString("EMAIL") + ", ");
                System.out.print(rs.getString("SDT") + ", ");
                System.out.print(rs.getString("GIOITINH") + ", ");
                System.out.println(rs.getString("DIACHI"));
            }
            conn.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
