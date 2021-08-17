package miniproject;

import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Ranklist {

    public void listup() throws Exception {
		JFrame f = new JFrame("인기순위");
		f.setSize(1300, 800);
		f.getContentPane().setLayout(null);
		PlayrankDAO pd = new PlayrankDAO();
		
		
		JLabel lblNewLabel = new JLabel("이번 주 인기공연 순위");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(6, 6, 234, 70);
		f.getContentPane().add(lblNewLabel);
		
		JButton pic1 = new JButton();
		pic1.setBounds(16, 88, 224, 218);
		f.getContentPane().add(pic1);
		
		String[] fav = pd.read("1");
		ImageIcon icon = new ImageIcon(fav[1]);
		Image icon1 = icon.getImage();
		Image icon2 = icon1.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon3 = new ImageIcon(icon2);
		pic1.setIcon(icon3);
		
		JLabel lblNewLabel_1 = new JLabel("<html>순위 : 1<br> 장르 : 뮤지컬 <br>제목 : 엑스칼리버<br> 점유율 : 13.2%</html>");
		lblNewLabel_1.setBounds(26, 319, 214, 93);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton pic2 = new JButton("New button");
		pic2.setBounds(265, 90, 224, 218);
		f.getContentPane().add(pic2);
		String[] fav2 = pd.read("2");
		ImageIcon icon21 = new ImageIcon(fav2[1]);
		Image icon22 = icon21.getImage();
		Image icon23 = icon22.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon24 = new ImageIcon(icon23);
		pic2.setIcon(icon24);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html>순위 : 2 <br> 장르 : 콘서트 <br>제목 : 윤하 단독 콘서트<br> 점유율 : 12.7%</html>");
		lblNewLabel_1_1.setBounds(265, 319, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JButton pic3 = new JButton("New button");
		pic3.setBounds(514, 89, 224, 218);
		f.getContentPane().add(pic3);
		
		
		String[] fav3 = pd.read("3");
		ImageIcon icon31 = new ImageIcon(fav3[1]);
		Image icon32 = icon31.getImage();
		Image icon33 = icon32.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon34 = new ImageIcon(icon33);
		pic3.setIcon(icon34);
		
		
		JButton pic4 = new JButton("New button");
		pic4.setBounds(759, 89, 224, 218);
		f.getContentPane().add(pic4);
		
		String[] fav4 = pd.read("4");
		ImageIcon icon41 = new ImageIcon(fav4[1]);
		Image icon42 = icon41.getImage();
		Image icon43 = icon42.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon44 = new ImageIcon(icon43);
		pic4.setIcon(icon44);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("<html>순위 : 3<br> 장르 : 연극 <br>제목 : 완벽한 타인<br> 점유율 : 11.3%</html>\n");
		lblNewLabel_1_1_1.setBounds(520, 317, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("<html>순위 : 4<br> 장르 : 뮤지컬 <br>제목 : 드라큘라<br> 점유율 : 10.8%</html>\n");
		lblNewLabel_1_1_1_1.setBounds(766, 317, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JButton pic5 = new JButton("New button");
		pic5.setBounds(1008, 88, 224, 218);
		f.getContentPane().add(pic5);
		
		String[] fav5 = pd.read("5");
		ImageIcon icon51 = new ImageIcon(fav5[1]);
		Image icon52 = icon51.getImage();
		Image icon53 = icon52.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon54= new ImageIcon(icon53);
		pic5.setIcon(icon54);
		
		
		
		
		
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("<html>순위 : 5<br> 장르 : 뮤지컬 <br>제목 : 시카고<br> 점유율 : 10.3%</html>\n");
	//	JLabel lblNewLabel_1_1_1_1_1 = new JLabel("ㅁㄴㅇㄹ매ㅔㄴㅇ레ㅐㄴㅇ");
		lblNewLabel_1_1_1_1_1.setBounds(1019, 316, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("<html>순위 : 6<br> 장르 : 연극 <br>제목 : 렁스<br> 점유율 : 9.5%</html>\n");
		lblNewLabel_1_1_1_1_2.setBounds(19, 650, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("<html>순위 : 7<br> 장르 : 뮤지컬 <br>제목 : 빌리 엘리어트<br> 점유율 : 8.8%</html>\n");
		lblNewLabel_1_1_1_1_3.setBounds(268, 650, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_4 = new JLabel("<html>순위 : 8<br> 장르 : 연극 <br>제목 : 작업의 정석<br> 점유율 : 7.1%</html>\n");
		lblNewLabel_1_1_1_1_4.setBounds(520, 647, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_1_5 = new JLabel("<html>순위 : 9<br> 장르 : 연극 <br>제목 : 늘근도둑 이야기<br> 점유율 : 5.6%</html>\n");
		lblNewLabel_1_1_1_1_5.setBounds(767, 646, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_1_6 = new JLabel("<html>순위 : 10<br> 장르 : 연극 <br>제목 : 일리어드<br> 점유율 : 3.3%</html>\n");
		lblNewLabel_1_1_1_1_6.setBounds(1020, 647, 214, 93);
		f.getContentPane().add(lblNewLabel_1_1_1_1_6);
		
		JButton pic6 = new JButton("New button");
		pic6.setBounds(16, 433, 224, 218);
		f.getContentPane().add(pic6);
		
		String[] fav6 = pd.read("6");
		ImageIcon icon61 = new ImageIcon(fav6[1]);
		Image icon62 = icon61.getImage();
		Image icon63 = icon62.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon64= new ImageIcon(icon63);
		pic6.setIcon(icon64);
		
		JButton pic7 = new JButton("New button");
		pic7.setBounds(265, 432, 224, 218);
		f.getContentPane().add(pic7);
		
		
		String[] fav7 = pd.read("7");
		ImageIcon icon71 = new ImageIcon(fav7[1]);
		Image icon72 = icon71.getImage();
		Image icon73 = icon72.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon74= new ImageIcon(icon73);
		pic7.setIcon(icon74);
		
		JButton pic8 = new JButton("New button");
		pic8.setBounds(517, 431, 224, 218);
		f.getContentPane().add(pic8);
		
		
		String[] fav8 = pd.read("8");
		ImageIcon icon81 = new ImageIcon(fav8[1]);
		Image icon82 = icon81.getImage();
		Image icon83 = icon82.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon84= new ImageIcon(icon83);
		pic8.setIcon(icon84);
		
		JButton pic9 = new JButton("New button");
		pic9.setBounds(761, 426, 224, 218);
		f.getContentPane().add(pic9);
		String[] fav9 = pd.read("9");
		ImageIcon icon91 = new ImageIcon(fav9[1]);
		Image icon92 = icon91.getImage();
		Image icon93 = icon92.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon94= new ImageIcon(icon93);
		pic9.setIcon(icon94);
		
		JButton pic10 = new JButton("New button");
		pic10.setBounds(1013, 424, 224, 218);
		f.getContentPane().add(pic10);
			
		
		String[] fav10 = pd.read("10");
		ImageIcon icon101 = new ImageIcon(fav10[1]);
		Image icon102 = icon101.getImage();
		Image icon103 = icon102.getScaledInstance(240, 250, Image.SCALE_SMOOTH);
		
		ImageIcon icon104= new ImageIcon(icon103);
		pic10.setIcon(icon104);
		
		
		f.setVisible(true);
		
		
		
	}
}



