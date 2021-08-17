package miniproject3;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MemDAO {
	// 자바에서 db처리 할 때는 dml중심으로 클래스를 만든다.
	// db 연결할 때는 db를 단위로 연결한다.
	// db연결하여 데이터처리를 하는 클래스를 만들 때는 테이블단위로 만든다.
	// 테이블 (entity, 개체)
	// create(insert~into values)


	public int create(String id, String pw, String name, String birth, String mail, String address ) 
			throws Exception{
		// 자바와 db연결하는 프로그램을(JBDC) 순서
		// 1.JDBC CONNECTOR설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 DB로 연결 :
//		연결할 주소 URL(IP, PORT, DB명) USERNAME, PASSWORD

		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.play db연결 성공 ! ! !");

		// 3. sql문을 만든다.
		String sql = "insert into mem values (?,?,?,?,?,?)";

//		String sql = "delete from member where id = 'apple'";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// preparestatment 부품을 2단계에서 획득한 con부품이 만들어서 return.!1
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, birth);
		ps.setString(5, mail);
		ps.setString(6, address);
		System.out.println("3. sql문 생성 성공  ! ! !");

		// String url ="http://www.naver.com";
//		String file ="c:/temp/test.txt";

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 전송");
		System.out.println("SQL문 수행개수" +result+ "개");
		return result;
		
	} // creat end

	public int delete(String id) throws Exception {
		// 자바와 db연결하는 프로그램을(JBDC) 순서
		// 1.JDBC CONNECTOR설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 DB로 연결 :
//		연결할 주소 URL(IP, PORT, DB명) USERNAME, PASSWORD

		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.mem db연결 성공 ! ! !");

		// 3. sql문을 만든다.
		
		String sql = "delete from mem where id =?"; //물음표의 번호는 1번 

//		String sql = "delete from member where id = 'apple'";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// preparestatment 부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
	
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공  ! ! !");

		// String url ="http://www.naver.com";
//		String file ="c:/temp/test.txt";

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 전송");
		System.out.println(result);
		return result;

	} // creat end

	public int update(String id,String address) throws Exception {
		// 자바와 db연결하는 프로그램을(JBDC) 순서
		// 1.JDBC CONNECTOR설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 DB로 연결 :
//		연결할 주소 URL(IP, PORT, DB명) USERNAME, PASSWORD

		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.mem db연결 성공 ! ! !");

		// 3. sql문을 만든다.
		String sql = "update mem set address=? where id =?";

//		String sql = "delete from member where id = 'apple'";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// preparestatment 부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
	
		ps.setString(1, address);
		ps.setString(2, id);
		System.out.println("3. sql문 생성 성공  ! ! !");

		// String url ="http://www.naver.com";
//		String file ="c:/temp/test.txt";

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 전송");
		System.out.println(result);
		return result;

	} // update end

	public String []  read(String id,String pw) throws Exception {
		// 자바와 db연결하는 프로그램을(JBDC) 순서
		// 1.JDBC CONNECTOR설정
		System.out.println(id+pw);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 DB로 연결 :
//		연결할 주소 URL(IP, PORT, DB명) USERNAME, PASSWORD

		String url = "jdbc:mysql://localhost:3306/play";
		String username = "root";
		String password = "fender601";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.shoes db연결 성공 ! ! !");

		// 3. sql문을 만든다.

		String sql = "select * from mem where id  =? and pw=?"; // 물음표의 번호는 1번

//		String sql = "delete from member where id = 'apple'";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// preparestatment 부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
	
		System.out.println("3. sql문 생성 성공  ! ! !");
		

		// String url ="http://www.naver.com";
//		String file ="c:/temp/test.txt";

		// 4. sql문을 mysql로 전송한다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4.sql문 전송 전송");
		//System.out.println(rs.next()); // 있어야 하는 값을 가져와야한다.
		String [] result =new String [6];
//		System.out.println(rs.next());
							//{"win","win","win","win"}
		if (rs.next()) {
			//테이블에 검색 결과가 있다라는 얘기! 
			String id2 = rs.getString(1);
			String pw2 = rs.getString(2);
			String name = rs.getString(3);
			String birth = rs.getString(4);
			String mail = rs.getString(5);
			String address = rs.getString(6);
		System.out.println(id2+ " "+ pw2 + " " + name+ " "+ birth+" "+mail+" "+address);
		//여러개일때에는 리턴일때 여러가지를 리턴해야한다. 따로따로 불가능 
		result[0] =id2;
		result[1] =pw2;
		result[2] =name;
		result[3] =birth;
		result[4] =mail;
		result[5] =address;
		
		}
		
		
		return result;
	} // read end

	public String[] read() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//	public String[] read1(String id, String pw) throws Exception {
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("1. connector연결 성공!!!");
//
//		String url = "jdbc:mysql://localhost:3306/play";
//		String username = "root";
//		String password = "1234";
//		Connection con = DriverManager.getConnection(url, username, password);
//		System.out.println("2. mega db연결 성공!!!");
//
//		String sql = "select * from mem where id,pw = ?,?"; // 1
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		ps.setString(2, pw);
//		System.out.println("3. sql문 생성 성공!!!");
//
//		ResultSet rs = ps.executeQuery();
//		System.out.println("4. sql문 전송 전송");
//
//		String[] arr = new String[4];
//		// {"win", "win", "win", "win"}
//		if (rs.next()) {
//			// 테이블에 검색 결과가 있다라는 얘기!
//			String id2 = rs.getString(1);
//			String pw1 = rs.getString(2);
//
//			arr[0] = id2;
//			arr[1] = pw1;
//
//			System.out.println(id2);
//			System.out.println(pw1);
//		
//			if (id2.equals(arr[0])&& pw1.equals(arr[1])) {
//				System.out.println("로그인 성공");
//				
//			}
//			
//		}
//		return arr;
//	}// read end
//	
	
	
	
	
	
}
