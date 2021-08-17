package miniproject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Page1DAO {

	
	
	
	public String[] read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결성공!!");
		
		String url = "jdbc:mysql://localhost:3306/play";
		String user = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db 연결성공!");
		
		String sql = "select * from reservation where idid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공!!");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공!");
		//System.out.println(rs.next());//리턴해줄 값이 있을때만 결과값을 보여줘(없으면안보여줌)
		
		String[] result = new String[4]; //{"win", "win", "win", "win"}
		//결과값을 묶어줌! 가방에 넣음, 배운게 배열/array list이므로 일단 요기 넣어줌
		if (rs.next()) {//테이블에 검색결과가 있다는 뜻
			String idid = rs.getString(1);
			String titleid = rs.getString(2);
			String num = rs.getString(3);
			String booking = rs.getString(4);
			System.out.println(idid +" "+ titleid +" "+ num +" "+ booking);
			result[0] = idid;
			result[1] = titleid;
			result[2] = num;
			result[3] = booking;
			
		}
		return result;
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
