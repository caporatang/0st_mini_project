package Miniproject4;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SeatDAO {
	public int create(String num, String booking) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");

		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. mega db연결 성공!!!");

		String sql = "insert into seat values (?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, num);
		ps.setString(2, booking);

		System.out.println("3. sql문 생성 성공!!!");
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result  + "개");
		return result;
	}// create end


}
