package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class PlayrankDAO {
			//자바에서 db처리할 때는 DML중심으로 클래스를 만든다.
			//db연결할 때는 "db를 단위로 연결" 한다.
		//db연결하여 데이터처리를 하는 클래스를 만들 때는 테이블 단위로 만든다.
		//테이블(enity, 개체)
		//create(insert~into values)
	
	//public int create(String id, String pw, String name, String tel) throws Exception {
		public int create(String pic) throws Exception {
		//자바와 db연결하는 프로그램(JDBC) 순서
		//1. jdbc connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공");
		
		//2. java에서 db로 연결:
		//연결할 주소 url(ip, port , db명), username, password
		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. play db연결 성공!!!");
		//3. sql문을 만든다.
		//String sql = "insert into member values (?, ?, ?, ?)";
		String sql = "insert into showrank values ('11', ?, 'test', 'test', 'test')";
		//String sql = "delete from member where id ='win''";
		//PrearedStatment : sql을 나타내는 부품이다.
		//부품을램에 넣어놓은 주소만 있으면 된다.
		//ps부품을 2단계에서 획득한 con 부품에 만들어서 리턴한다. 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pic);
		//ps.setString(2, picture);
		//ps.setString(3, genre);
		//ps.setString(4, title);
		//ps.setString(5, share);
		
		System.out.println("3. sql문 생성 성공");
		 
		
		//4.sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공.");
		System.out.println(result);
		System.out.println("SQL문 수행 개수 " + result + "개" );
		return result;
		
		
	} // create end
	
	public int update(String id, String tel) throws Exception {
		//자바와 db연결하는 프로그램(JDBC) 순서
		//1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		//2. java에서 db로 연결: 
		//   연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db연결 성공!!!");
		
		//3. sql문을 만든다.
		String sql = "update member set tel = ? where id= ?";
		//PrepareStatment : sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 잇으면 됨.
		//ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);
		
		//4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		System.out.println("리턴한 SQL문 개수 " + result);
		return result;
	
	}
	
	public int delete(String id) throws Exception {
		//자바와 db연결하는 프로그램(JDBC) 순서
		//1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		//2. java에서 db로 연결: 
		//   연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db연결 성공!!!");
		
		//3. sql문을 만든다.
		String sql = "delete from member where id = ?";
		//PrepareStatment : sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 잇으면 됨.
		//ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File file2 = new File(file);
		
		//4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
		return result;
		
	}//create end
	
	public String[] read(String n ) throws Exception {
		//자바와 db연결하는 프로그램(JDBC) 순서
		//1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		//2. java에서 db로 연결: 
		//   연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. play db연결 성공!!!");
		
		//3. sql문을 만든다.
		String sql = "select * from showrank where no = ?";
		//PrepareStatment : sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 잇으면 됨.
		//ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, n);
		System.out.println("3. sql문 생성 성공!!!");
	//	String url = "http://www.naver.com";
	//	URL u = new URL(url);
	//	String file = "c:/temp/test.txt";
	//	File file2 = new File(file);
		
		//4. sql문을 mysql로 전송한다.
		ResultSet rs = ps.executeQuery();
		
		System.out.println("4. sql문 전송 전송");
		System.out.println();
		String[] red = new String[5];
		
		if (rs.next()) {
			String rank = rs.getString(1);
			String picture = rs.getString(2);
			String genre = rs.getString(3);
			String title = rs.getString(4);
			String share = rs.getString(5);
			
	System.out.println(rank + " " + picture + " " + genre + " " + title + " " + share);
			
			red[0] = rank;
			red[1] = picture;
			red[2] = genre;
			red[3] = title;
			red[4] = share;
		}
		return red;
		
		

		
		
		
		
	}//delete end

	
	
	
	
	
}
