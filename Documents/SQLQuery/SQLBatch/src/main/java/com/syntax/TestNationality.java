package com.syntax;
import java.sql.*;
public class TestNationality {
    public static void main(String[] args) {
        String url="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String username="syntax_hrm";
        String password="syntaxhrm123";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st=conn.createStatement();
            ResultSet rset=st.executeQuery("select * from ohrm_nationality");

            rset.next();
            int fid=rset.getInt("id");
            String lName=rset.getString("Name");
            System.out.println(fid+" "+lName);

            while(rset.next()){
                fid=rset.getInt("id");
                lName=rset.getString("Name");
                System.out.println(fid + " " + lName);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
