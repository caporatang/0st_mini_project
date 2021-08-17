package miniproject;

	import java.awt.Color;

	import javax.swing.JFrame;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;

import miniproject2.Page1UI;
import miniproject2.Page2UI;
import miniproject3.Mem1UI;
import miniproject3.MemUI;
import miniproject3.로그인;
import miniproject3.회원정보;

import java.awt.Font;

	public class MiniMainPage {
	public static void main(String[] args) {
	
		
		로그인 logg = new 로그인();
				JFrame f = new JFrame("예 매 프 로 그 램");
				f.getContentPane().setBackground(Color.white);
				f.getContentPane().setLayout(null);
				
				JLabel lblNewLabel = new JLabel("========================================================================================================================================");
				lblNewLabel.setBounds(12, 82, 960, 15);
				f.getContentPane().add(lblNewLabel);
				
				JLabel wel = new JLabel("");
				wel.setHorizontalAlignment(SwingConstants.CENTER);
				wel.setBounds(12, 107, 960, 644);
				f.getContentPane().add(wel);
				ImageIcon p1 = new ImageIcon("welcome.png");
				wel.setIcon(p1);
				
				JButton b1 = new JButton("로그인");
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Mem1UI www = new Mem1UI();
						www.main1(null);
						f.setVisible(false);// b1버튼을 누르면 main창이 안보여짐
					}
				});
				b1.setBounds(93, 33, 90, 25);
				f.getContentPane().add(b1);
				
				
				
				
				JButton b2 = new JButton("회원가입");
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						MemUI ww = new MemUI();
						
						ww.main(null);
						f.setVisible(true);// b1버튼을 누르면 main창이 안보여짐
					}
				});
				b2.setBounds(193, 33, 90, 25);
				f.getContentPane().add(b2);
				
				JButton b3 = new JButton("정보수정");
				b3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						회원정보 ho = new 회원정보();
						ho.main(null);
					}
				});
				b3.setBounds(293, 33, 90, 25);
				f.getContentPane().add(b3);
				
				JButton b4 = new JButton("공연정보");
				b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						공연및공연장정보 sel = new 공연및공연장정보();
						
					sel.upp();
						
						
					}
				});
				b4.setBounds(485, 33, 90, 25);
				f.getContentPane().add(b4);
				
				
				
				JButton b8 = new JButton("예매확인");
				b8.setBounds(693, 33, 90, 25);
				f.getContentPane().add(b8);
				b8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Page1UI w1 = new Page1UI();
						w1.open1();
					}
				});
				
				JButton b9 = new JButton("투표하기");
				b9.setBounds(793, 33, 90, 25);
				f.getContentPane().add(b9);
				
				b9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Page2UI w2 = new Page2UI();
						w2.open2();
						//f.setVisible(false);//b9버튼을 누르면 main창이 안보여짐
					}
				});
				
				
						//f.setVisible(false);//b9버튼을 누르면 main창이 안보여짐
				
				
				f.setSize(1000, 800);
				f.setVisible(true);

			}
		


	


}