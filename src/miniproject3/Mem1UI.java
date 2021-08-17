package miniproject3;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class Mem1UI {
	
	private static JTextField t1;
	private static JTextField t2;

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main1(String[] args) {
		JFrame f = new JFrame(" 로그인 ");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("I D :");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(35, 105, 110, 53);
		f.getContentPane().add(lblNewLabel);

		JLabel lblPW = new JLabel("P W : ");
		lblPW.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblPW.setBounds(35, 215, 110, 53);
		f.getContentPane().add(lblPW);

		JLabel result = new JLabel("");
		result.setFont(new Font("굴림", Font.BOLD, 15));
		result.setBounds(51, 401, 375, 34);
		f.getContentPane().add(result);
		t1 = new JTextField();

		t1.setBounds(188, 105, 184, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);

//		t2 = new JTextField();
		t2 = new JPasswordField();
		t2.setColumns(10);
		t2.setBounds(188, 215, 184, 53);
		f.getContentPane().add(t2);

		JButton b1 = new JButton("LOGIN");
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();

				MemDAO db = new MemDAO();
				
				String[] result=null;
				try {
					result = db.read(s1,s2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

//				String[] arr = db.read(s1);

				try {

					if (s1.equals(result[0]) && s2.equals(result[1])) {
						JOptionPane.showMessageDialog(f, "로그인 되었습니다");
					}

					else {
						JOptionPane.showMessageDialog(f, "로그인 실패하었습니다");
					}
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			}
		});
		b1.setBounds(53, 290, 154, 68);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("지우기");
		b2.setFont(new Font("굴림", Font.BOLD, 17));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 15));
		b1.setBounds(73, 332, 337, 59);
		f.getContentPane().add(b1);

		f.setVisible(true);

	}

	public void open1() {
		// TODO Auto-generated method stub

	}

}
