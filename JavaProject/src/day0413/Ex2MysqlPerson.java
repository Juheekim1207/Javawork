package day0413;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex2MysqlPerson {

	static final String DRIVER="com.mysql.cj.jdbc.Driver";
	static final String URL="jdbc:mysql://localhost:3306/bitcamp?serverTimezone=Asia/Seoul";
	Scanner sc = new Scanner(System.in);
	
	public Ex2MysqlPerson() {
		try {
			Class.forName(DRIVER);
			System.out.println("mysql 드라이버 성공!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("mysql 드라이버 실패!!" + e.getMessage());
		}
	}
	
	public Connection getConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,"root","!wngml7750");
			//System.out.println("mysql 접근 성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("mysql 접근 실패!" + e.getMessage());
		}
		return conn;
	}

	public int getMenu()
	{
		System.out.println("**메뉴 선택**");
		System.out.println("1.추가 2.전체출력 3.삭제 4.분석 5.수정 6.종료");
		int n=Integer.parseInt(sc.nextLine());
		return n;
	}
	
	public void personInsert()
	{
		Connection conn = this.getConnection();
		PreparedStatement pstmt=null;
		String sql="";
		//필요한 데이터 입력
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("혈액형 입력");
		String blood = sc.nextLine();
		System.out.println("나이 입력");
		int age = Integer.parseInt(sc.nextLine());
		
		//db 연결
		conn = this.getConnection();
		sql="insert into person (name,blood,age,writeday) values (?,?,?,now())";

		try {
			//sql 검사
			pstmt=conn.prepareStatement(sql);
			//? 갯수만큼 반드시 바인딩 : ?는 1번부터 시작
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setInt(3, age);
			//실행
			pstmt.execute();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {}
		}
		
	}
	
	public void personUpdate()
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = " ";
		
		//수정 항목
		int num,age;
		String blood;
		
		System.out.println("수정할 num 값 입력");
		num = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 blood 값");
		blood = sc.nextLine();
		System.out.println("수정할 나이 입력");
		age = Integer.parseInt(sc.nextLine());
		
		sql = "update person set blood=?, age=? where num=?";
		
		//db연결
		conn = this.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			//바인딩
			pstmt.setString(1, blood);
			pstmt.setInt(2, age);
			pstmt.setInt(3, num);
			//실행
			int n = pstmt.executeUpdate();
			if(n == 0)
				System.out.println("해당번호가 존재하지 않습니다");
			else 
				System.out.println("수정되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {}
		}
	}
	
	public void personAllwrite()
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		String sql="select * from person order by name";
		
		//db연결
		conn=this.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("\t** Person DB 목록 **");
			System.out.println();
			System.out.println("번호\t이름\t혈액형\t나이\t작성일");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		while(rs.next())
		{
			String num = rs.getString("num");
			String name = rs.getString("name");
			String blood = rs.getString("blood").toUpperCase(); //대문자로 변환
			int age=rs.getInt("age");
			Timestamp ts=rs.getTimestamp("writeday");
			
			System.out.println(num + "\t" + name + "\t" + blood + "\t" + sdf.format(ts));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {}
		}
		
	}
	
	public void personDelete()
	{
		String name=" ";
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="delete from person where name=?";
		
		//이름을 입력후 해당 데이터 삭제 
		System.out.println("삭제할 이름 입력");
		name = sc.nextLine();
		
//		//이름을 입력후 해당 데이터 삭제 
//		System.out.println("삭제할 이름 :");
//		String name = sc.nextLine();
//		
		//db연결
		conn=this.getConnection();
		try {
			//sql검사
			pstmt=conn.prepareStatement(sql); //실행때가 아닌 이때 넣어줌
			
			//?갯수만큼 반드시 바인딩 : ?는 1번부터 시작 
			pstmt.setString(1, name);
			
			//실행
			int n = pstmt.executeUpdate(); //성공한 레코드의 갯수 반환
			if(n == 0)
				System.out.println(name + "님은 명단에 없습니다");
			else
				System.out.println("총 " + n + "명의" + name + "님이 삭제되었습니다");
				
			//pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {}
		}	
	}
	
	public void personBloodGroup()
	{
		//mysql에서 먼저 실행
		String sql="select upper(blood) blood,count(blood) count,round(avg(age),0) age from person group by blood;";
		
		Connection conn = this.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		//db연결
		conn=this.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
						
			System.out.println("\t** 혈액형 Info List **");
			System.out.println();
			System.out.println("혈액형\t인원수\t평균나이");
		while(rs.next()) {
			String blood = rs.getString("blood").toUpperCase();
			int age = rs.getInt("age"); 
			int count = rs.getInt("count"); 
			
			System.out.println(blood + "형\t" + count + "명\t" + age + "세");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2MysqlPerson ex = new Ex2MysqlPerson();
		while(true)
		{
			int n=ex.getMenu();
			switch(n)
			{
			case 1:
				ex.personInsert();
				break;
			case 2:
				ex.personAllwrite();
				break;
			case 3:
				ex.personDelete();
				break;
			case 4:
				ex.personBloodGroup();
				break;
			case 5:
				ex.personUpdate();
				break;
			default:
				System.out.println("**프로그램 종료!!**");
				System.exit(0);
			}
		}
	}

}

















