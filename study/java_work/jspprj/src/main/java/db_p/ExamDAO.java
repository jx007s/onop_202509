package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ExamDAO {

	String url = "jdbc:mysql://localhost:3306/onop_db?characterEncoding=utf-8";
	String user = "onop";
	String pw = "123456";
	
	Connection con = null;
	PreparedStatement ptmt = null;
	ResultSet rs = null;
	
	
	public ExamDAO() {
		try {
			
			//1. driver 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. 연결 객체 생성
			con = DriverManager.getConnection(url, user, pw);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<ExamDTO> list(){
		ArrayList<ExamDTO> res = new ArrayList<ExamDTO>();
		
		String sql = "select * from exam";
		
		try {
			//3. 쿼리문 실행하기 위한 객체 
			ptmt = con.prepareStatement(sql);
			
			//4. 쿼리문 실행
			rs = ptmt.executeQuery();
			
			//5. 실행 결과 데이터화
			while(rs.next()) {
				
				// 튜플마다 dto 생성
				ExamDTO dto = new ExamDTO();
				
				//멤버변수에 대입
				dto.setId(rs.getInt("id"));
				dto.setHakgi(rs.getInt("hakgi"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setName(rs.getString("name"));
				dto.setPid(rs.getString("pid"));
				dto.setFf(rs.getString("ff"));
				dto.setPw(rs.getString("pw"));
				dto.setRegDate(rs.getTimestamp("reg_date"));
				
				//list 항목에 dto 추가
				res.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//DB 연결 닫기
			close();
		}
		
		
		return res;
	}
	
	public void close() {
		//6. 쿼리 실행 객체 종료
		if(rs!=null) { try {rs.close();} catch (SQLException e) { }}
		if(ptmt!=null) { try {ptmt.close();} catch (SQLException e) { }}
		//7. 연결 객체 종료
		if(con!=null) { try {con.close();} catch (SQLException e) { }}
	}
}
