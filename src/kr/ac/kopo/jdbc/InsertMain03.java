package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);
			
			String id = "kim";
			String name = "김길동";
			
//			쿼리를 가지고 있는 애를 전처리
			String sql = "insert into t_test(id, name)";
				   sql += "values(?, ?)";
//				   뭐가 들어갈지 모를 때는 ? 작성 - only prepareStatement만
				   
//		    미리 준비되어있는 객체 넣어줌
		    pstmt = conn.prepareStatement(sql);
//		    ? 세팅 = set
		    pstmt.setString(1, id);
		    pstmt.setString(2, name);
		    
		    int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 삽입되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
