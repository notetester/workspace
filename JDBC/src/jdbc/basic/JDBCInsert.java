package jdbc.basic;

import java.sql.*;
import java.util.Scanner;

public class JDBCInsert {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디>");
		String id=scan.next();
		System.out.print("비밀번호>");
		String pw=scan.next();
		System.out.print("이름>");
		String name=scan.next();
		System.out.print("이메일>");
		String email=scan.next();
		System.out.print("주소>");
		String address=scan.next();
		// 1. DB 연결에 필요한 변수
		String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid="TEST01";
		String upw="TEST01";
		String sql="insert into member01 values(?,?,?,?,?)";
		// 2. DB 연동에 사용할 클래스 변수들을 선언
		// ResultSet은 select 구문이 아니라면 필요 없습니다~
		Connection conn=null; // DB 연결
		PreparedStatement pstmt=null; // SQL 전송 객체
		try {
			// 3. Connector 안에 연결 드라이버를 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 4. 커넥션 객체 생성
			// 커넥션 객체 생성시에는 직접 new로 사용할 수 없고, DriverManager 클래스가 제공하는 getter 메서드를 통해서 생성
			conn=DriverManager.getConnection(url,uid,upw);
			// 5. SQL 쿼리문을 실행해주는 Statement 객체를 생성
			// SQL문의 ?의 순서대로 인덱스 번호를 가지고 1부터 시작합니다. pstmt에 전달된 sql문의 ?를 채우는 작업.
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,pw);
			pstmt.setString(3,name);
			pstmt.setString(4,email);
			pstmt.setString(5,address);
			// 6. SQL문의 실행 (insert, delete, update)문은 Update()문을 실행합니다.
			int result=pstmt.executeUpdate(); // 인서트 성공시 1을 반환, 실패하면 0을 반환
			if(result==1) {
				System.out.println("DB 입력 성공");
			}else {
				System.out.println("DB 입력 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {conn.close();}
				if(pstmt!=null) {pstmt.close();}
				scan.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
