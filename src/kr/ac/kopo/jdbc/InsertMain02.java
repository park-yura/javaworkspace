package kr.ac.kopo.jdbc;
/*
 * 아이디 입력 : park
 * 이름 입력 : 박길동
 * 1개 행을 삽입하였습니다.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
//			1단계
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
//			2단계
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
//			3단계
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id, name)";
				   sql += "values(\'" + id + "\', \'" + name + "\')";
//				   db에서는 문자열을 작은 따옴표로 구분하기 때문에 \' 넣어줘야함
			
		    stmt = conn.createStatement();
		    
//			4단계
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개의 행이 삽입되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			5단계
				if (stmt != null) {
					try {
						stmt.close();									
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				if(conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
	}
}
