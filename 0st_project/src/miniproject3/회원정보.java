package miniproject3;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class 회원정보 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		f.setVisible(true);




		JButton btnNewButton_1 = new JButton("회원 탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// id 를 입력받아야 함 . 탈퇴조건

				String id = JOptionPane.showInputDialog("탈퇴할 id 입력");

				MemDAO db = new MemDAO();

				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "아이디를 다시 입력하세요.");
					}

				} catch (Exception e1) {
					e1.printStackTrace();

				}

			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(259, 304, 155, 77);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("주소 변경");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = JOptionPane.showInputDialog("수정할 id 입력");
				String address = JOptionPane.showInputDialog("수정할 address 입력");
				MemDAO db = new MemDAO();
				int result;
				try {
					result = db.update(id, address);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "수정하였습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "수정되지 않았습니다.");
					}

				} catch (Exception e1) {
					e1.printStackTrace();

				}

			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(55, 304, 155, 77);
		f.getContentPane().add(btnNewButton_1_1);
		
		JLabel la1 = new JLabel("");
	
		la1.setHorizontalAlignment(SwingConstants.CENTER);
		la1.setBounds(12, 107, 960, 644);
		f.getContentPane().add(la1);
		ImageIcon p1 = new ImageIcon("welcome.png");
		la1.setIcon(p1);
		la1.setBounds(23, 43, 393, 272);
		f.getContentPane().add(la1);

	}
}
