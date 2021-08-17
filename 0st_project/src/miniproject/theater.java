package miniproject;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.CORBA.PUBLIC_MEMBER;

public class theater {

	

	
	
	public void position() {
		JFrame fra = new JFrame("공연장 위치");
		fra.setSize(600, 600);
		fra.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><b>예술의 전당</b></html>");
		lblNewLabel.setBounds(25, 6, 197, 28);
		fra.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("<html>주소<br>서울 서초구 서초동 산144-4<br>02-580-1300</html>");
		lblNewLabel_2.setBounds(25, 27, 245, 74);
		fra.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html><b>블루 스퀘어</b></html>");
		lblNewLabel_3.setBounds(25, 213, 197, 28);
		fra.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("<html><b>샤롯데씨어터</b></html>");
		lblNewLabel_6.setBounds(25, 405, 197, 28);
		fra.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>주소<br>서울 용산구 이태원로 294<br>1544-1591</html>");
		lblNewLabel_2_1.setBounds(25, 234, 197, 74);
		fra.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("<html>주소<br>서울 송파구 올림픽로 240<br>1644-0078</html>");
		lblNewLabel_2_2.setBounds(25, 436, 197, 54);
		fra.getContentPane().add(lblNewLabel_2_2);
		
		JButton artpic = new JButton("New button");
		artpic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				
			}
		});
		artpic.setBounds(213, 6, 381, 183);
		fra.getContentPane().add(artpic);
		
		JButton bluepic = new JButton("New button");
		bluepic.setBounds(213, 190, 378, 177);
		fra.getContentPane().add(bluepic);
		
		JButton lottepic = new JButton("New button");
		lottepic.setBounds(213, 379, 378, 160);
		fra.getContentPane().add(lottepic);
		

		
		
		ImageIcon art2 = new ImageIcon("art.png");
		Image d = art2.getImage();
		Image d2 = d.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		
		ImageIcon art21 = new ImageIcon(d2);
		artpic.setIcon(art21);
		
		
		ImageIcon blue2 = new ImageIcon("blue.png");
		Image e = blue2.getImage();
		Image e2 = e.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		
		ImageIcon blue21 = new ImageIcon(e2);
		bluepic.setIcon(blue21);
		
		
		ImageIcon lotte2 = new ImageIcon("lotte.png");
		Image f = lotte2.getImage();
		Image f2 = f.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		
		ImageIcon lotte21 = new ImageIcon(f2);
		lottepic.setIcon(lotte21);
		
		
		
		
		fra.setVisible(true);
	}

	
	

	
	}

