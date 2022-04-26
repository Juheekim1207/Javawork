package mysql.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnect {
	static final String DRIVER="com.mysql.cj.jdbc.Driver";
	static final String URL="jdbc:mysql://localhost:3306/bitcamp?serverTimezone=Asia/Seoul";
	
	public DbConnect() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Mysql 드라이버 오류:" + e.getMessage());
		}	
	}
	
	public Connection getConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,"root","!wngml7750");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Mysql 연결 실패:" + e.getMessage());
		}
		return conn;
	}
	
	public void dbCLose(ResultSet rs, PreparedStatement pstm, Connection conn)
	{
		try {
			rs.close();
			pstm.close();
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	public void dbCLose(PreparedStatement pstm, Connection conn)
	{
		try {
			pstm.close();
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}







