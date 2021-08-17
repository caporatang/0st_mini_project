package miniproject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;

import Miniproject4.seat;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 공연및공연장정보 {

	public void upp() {
				JFrame f = new JFrame();
				f.setSize(1000, 800);
				f.getContentPane().setLayout(null);
				
				JLabel lblNewLabel = new JLabel("이번주 인기 공연 TOP3");
				lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
				lblNewLabel.setBounds(39, 6, 290, 77);
				f.getContentPane().add(lblNewLabel);
				
				JLabel musical = new JLabel("<html>뮤지컬 엑스칼리버<br>6세기 영국, 암흑의 시대. 분열된 영국은,<br>각 영토의 왕들의 내전으로 피비린내로 가득하다.<br>색슨족의 침략까지 예언된 가운데, <br>드루이드(Druid)교의 마법사이자 예언가인 멀린은 엑스칼리버를 자신의 부와 권력,\n 복수를 얻는 수단으로만 사용해 온 무자비한 왕,\n우더 펜드라곤을 죽이고, 혼돈의 시대를 벗어나게 할 \n새로운 왕 아더를 왕좌에 앉히기 위한 오래된 계획을 실행에 옮긴다.</html>");
				musical.setBounds(6, 465, 323, 149);
				f.getContentPane().add(musical);
				
				JLabel yunha = new JLabel("<html>2021 YOUNHA CONCERT MINDSET<br>해의 길이가 길어지고 그림자의 길이는 짧아졌습니다.그 사이 활짝 피었다 져버린 꽃도 있고, 때를 기다리는 꽃봉오리도 있습니다.<br>각자의 개화 시기가 다르기에 볼 수 있는 아름다움, 저마다 조금,<br> 다른 순서로 사는 우리의 이야기. 여름의 한가운데 서서, <br>그동안의 마음을 어루만져 보려고 합니다.<br>윤하와 함께 2021년 여름을 함께 건너요.</html>");
				yunha.setBounds(341, 465, 323, 149);
				f.getContentPane().add(yunha);
				
				JLabel perfect = new JLabel("<html>연극 완벽한 타인<br>에바와 로코 부부는 친구들을 저녁 식사에 초대한다.<br>저녁 식사를 하던 중, 최근 남편 핸드폰에 온 문자로 외도가 발각되어 이혼하게 된 부부에 관한 이야기가 나오게 되자 에바는 모두에게 게임 하나를 제안한다.<br>식탁 위에 핸드폰을 올려놓고, 저녁 시간 동안 오는 전화나 메시지를 다른 사람들에게 그대로 공유하는 게임.<br>식사 자리는 어느새 예측불허의 상황만 펼쳐지게 되는데.. </html>");
				perfect.setBounds(671, 465, 323, 149);
				f.getContentPane().add(perfect);
				
				JButton rankingbutton = new JButton("장르별 인기순위");
				rankingbutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Ranklist li = new Ranklist();
						try {
							li.listup();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
				rankingbutton.setFont(new Font("Papyrus", Font.BOLD, 13));
				rankingbutton.setBounds(811, 29, 167, 42);
				f.getContentPane().add(rankingbutton);
				
				JButton musicalpic = new JButton("New button");
				musicalpic.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				musicalpic.setBounds(6, 95, 274, 358);
				f.getContentPane().add(musicalpic);
				
				JButton concertpic = new JButton("New button");
				concertpic.setBounds(341, 95, 274, 358);
				f.getContentPane().add(concertpic);
				
				JButton dramapic = new JButton("New button");
				dramapic.setBounds(681, 95, 274, 358);
				f.getContentPane().add(dramapic);
				
				JButton btnNewButton_2 = new JButton("1");
				btnNewButton_2.setBounds(46, 630, 142, 51);
				f.getContentPane().add(btnNewButton_2);
				
				JButton location = new JButton("공연장 위치");
				location.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						theater up = new theater();
						up.position();
						
						
					}
				});
				location.setBounds(380, 704, 167, 69);
				f.getContentPane().add(location);
				
				
				//엑스칼리버 이미지 변환, 버튼에 입히기.
				ImageIcon concertimage = new ImageIcon("concert1.png"); // 엑스칼리버 포스터를 이미지 아이콘으로 불러오기
				Image a =concertimage.getImage(); // 사이즈 설정을 위해 이미지로 불러온다.
				Image a2 = a.getScaledInstance(300, 400, 300); // 이미지 사이즈를 조정한다.
				
				ImageIcon concertimage2 = new ImageIcon(a2); //사이즈 설정한 이미지를 다시 새로운 이미지 아이콘으로 만든다.
				musicalpic.setIcon(concertimage2); //버튼에 넣어주기..
				//엑스칼리버 이미지.
				
				//윤하 포스터 이미지 
				ImageIcon yunhaconcert = new ImageIcon("concert2.png"); 
				Image b = yunhaconcert.getImage();
				Image b2 = b.getScaledInstance(300, 400, 300);
				
				ImageIcon yunhaconcert2 = new ImageIcon(b2);
				concertpic.setIcon(yunhaconcert2);
				//윤하 포스터 이미지.
				
				//완벽한타인 이미
				ImageIcon c = new ImageIcon("concert3.gif");
				dramapic.setIcon(c);
				
				JButton po = new JButton("2");
				po.setBounds(391, 630, 142, 51);
				f.getContentPane().add(po);
				po.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						seat poo = new seat();
						poo.opne10();
					}
				});
				
				
				JButton btnNewButton_2_2 = new JButton("3");
				btnNewButton_2_2.setBounds(746, 630, 142, 51);
				f.getContentPane().add(btnNewButton_2_2);
				
				JLabel lblNewLabel_1 = new JLabel("           예매하기");
				lblNewLabel_1.setBounds(56, 681, 127, 16);
				f.getContentPane().add(lblNewLabel_1);
				
				
				JLabel lblNewLabel_1_1 = new JLabel("           예매하기");
				lblNewLabel_1_1.setBounds(401, 681, 127, 16);
				f.getContentPane().add(lblNewLabel_1_1);
				
				JLabel lblNewLabel_1_2 = new JLabel("           예매하기");
				lblNewLabel_1_2.setBounds(756, 681, 127, 16);
				f.getContentPane().add(lblNewLabel_1_2);
				//완벽한타인 이미지.
				
				
				
				f.setVisible(true);
	}
}
