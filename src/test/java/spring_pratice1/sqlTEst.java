package spring_pratice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class sqlTEst {
	
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=master";
    private static final String USER = "jeon"; //DB 사용자명
    private static final String PW = "1234";   //DB 사용자 비밀번호
	
    @Test
    public void testConnection() throws Exception{

        Class.forName(DRIVER); //com.microsoft.sqlserver.jdbc.SQLServerDriver JDBC Driver class 로딩

        Connection con = DriverManager.getConnection(URL, USER, PW); // java.sql.Connection 객체생성

        try{
            System.out.println(con);
             
            System.out.println(con.isClosed()); // connection 닫힘 유무

            Statement stmt = con.createStatement(); // Statement 객체생성

            String sql = "select * from users"; // 쿼리문

            ResultSet rs = stmt.executeQuery(sql); // 

            while(rs.next()) {
                System.out.println(rs.getString("id")+"///"+rs.getString("password")+"///"+rs.getString("name"));
            }

            con.close();

            System.out.println(con.isClosed());
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            con.close();
        }
   }
    
    
}
