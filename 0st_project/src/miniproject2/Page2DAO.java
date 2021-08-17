package miniproject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Page2DAO {
	//==필요에따라 ()이부분만 수정해서 사용하면됨
	public int update(int choice) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결성공!!");
		//==필요에따라 DB명 수정해서 사용하면됨
		String url = "jdbc:mysql://localhost:3306/play";
		String user = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db 연결성공!");
		//라이언이1이면
		if (choice==1) {
			String sql = "update vote set lion = lion + 1";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 연결성공!!");
			int result = ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공!");
			System.out.println("SQL문 수행개수 " + result);
			return result;
		}
		else if (choice==2) {
			String sql = "update vote set wicked = wicked + 1";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 연결성공!!");
			int result = ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공!");
			System.out.println("SQL문 수행개수 " + result);
			return result;
		}
		else {
			String sql = "update vote set turan = turan + 1";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 연결성공!!");
			int result = ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공!");
			System.out.println("SQL문 수행개수 " + result);
			return result;
		}
	}
	public String[] read() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결성공!!");
		
		String url = "jdbc:mysql://localhost:3306/play";
		String user = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db 연결성공!");
		
		String sql = "select * from vote";
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공!!");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공!");
		
		
		String[] arr = new String[4];
		
		if (rs.next()) {
			String lion = rs.getString(1);
			String wicked = rs.getString(2);
			String turan = rs.getString(3);
			
			arr[0] = lion;
			arr[1] = wicked;
			arr[2] = turan;
		}
		return arr;
	}
	
	
}



















