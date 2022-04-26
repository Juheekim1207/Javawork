package mysql.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuDao {
	DbConnect db = new DbConnect();
	
	//출력
	public List<StuDto> getAllDatas()
	{
		List<StuDto> list = new ArrayList<StuDto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = "select * from stu order by name";
		
		conn = db.getConnection();		
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				StuDto dto = new StuDto();
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setPhoto(rs.getString("photo"));
				dto.setHp(rs.getString("hp"));
				dto.setAddr(rs.getString("addr"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				//list에 추가
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbCLose(rs, pstm, conn);
		}
		return list;
	}
	
	//insert method
	public void insertStudent(StuDto dto)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into stu (name,hp,addr,photo,writeday) values (?,?,?,?,now())";
		
		conn = db.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			//바인딩
			pstmt.setString(1,dto.getName());
			pstmt.setString(2,dto.getHp());
			pstmt.setString(3,dto.getAddr());
			pstmt.setString(4,dto.getPhoto());
			//실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbCLose(pstmt, conn);
		}
	}
	
	//삭제 메서드
	public void deleteStudent(String num)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from stu where num = ?";
		
		conn = db.getConnection();	
		try {
			pstmt = conn.prepareStatement(sql);
			//바인딩
			pstmt.setString(1, num);
			//실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbCLose(pstmt, conn);
		}
	}
}














