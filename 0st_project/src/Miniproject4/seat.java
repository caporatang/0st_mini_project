package Miniproject4;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class seat {

	public static int count = 0;
	public static int count1 = 0;
	public static int count2 = 0;
	public static int price1 = 16000;
	public static int price2 = 12000;

	//public static void main(String[] args) {
	public void opne10() {
	
	
		JFrame f = new JFrame();
		f.getContentPane().setForeground(Color.BLACK);
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(1000, 800);

		f.getContentPane().setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("공연좌석 예매");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 55));
		lblNewLabel_1.setBounds(306, 23, 476, 147);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_4_1 = new JLabel("B\uC5F4");
		lblNewLabel_4_1.setFont(new Font("����", Font.PLAIN, 42));
		lblNewLabel_4_1.setBounds(42, 437, 93, 68);
		f.getContentPane().add(lblNewLabel_4_1);

		JLabel lblNewLabel_5 = new JLabel("1\uBC88");
		lblNewLabel_5.setBounds(175, 238, 50, 34);
		f.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("2\uBC88");
		lblNewLabel_5_1.setBounds(283, 238, 50, 34);
		f.getContentPane().add(lblNewLabel_5_1);

		JLabel lblNewLabel_5_2 = new JLabel("3\uBC88");
		lblNewLabel_5_2.setBounds(391, 238, 50, 34);
		f.getContentPane().add(lblNewLabel_5_2);

		JLabel lblNewLabel_5_3 = new JLabel("4\uBC88");
		lblNewLabel_5_3.setBounds(506, 238, 50, 34);
		f.getContentPane().add(lblNewLabel_5_3);

		JLabel lblNewLabel_5_4 = new JLabel("5\uBC88");
		lblNewLabel_5_4.setBounds(621, 238, 50, 34);
		f.getContentPane().add(lblNewLabel_5_4);

		JLabel lblNewLabel_5_5 = new JLabel("6\uBC88");
		lblNewLabel_5_5.setBounds(732, 238, 50, 34);
		f.getContentPane().add(lblNewLabel_5_5);

		JLabel lblNewLabel_5_6 = new JLabel("1\uBC88");
		lblNewLabel_5_6.setBounds(165, 547, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6);

		JLabel lblNewLabel_5_6_1 = new JLabel("2\uBC88");
		lblNewLabel_5_6_1.setBounds(283, 547, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_1);

		JLabel lblNewLabel_5_6_2 = new JLabel("3\uBC88");
		lblNewLabel_5_6_2.setBounds(391, 547, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_2);

		JLabel lblNewLabel_5_6_3 = new JLabel("4\uBC88");
		lblNewLabel_5_6_3.setBounds(506, 547, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_3);

		JLabel lblNewLabel_5_6_4 = new JLabel("5\uBC88");
		lblNewLabel_5_6_4.setBounds(610, 547, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_4);

		JLabel lblNewLabel_5_6_5 = new JLabel("6\uBC88");
		lblNewLabel_5_6_5.setBounds(732, 547, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_5);

		JLabel lblNewLabel_5_6_7 = new JLabel("7\uBC88");
		lblNewLabel_5_6_7.setBounds(175, 370, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_7);

		JLabel lblNewLabel_5_6_1_2 = new JLabel("8\uBC88");
		lblNewLabel_5_6_1_2.setBounds(283, 376, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_1_2);

		JLabel lblNewLabel_5_6_2_2 = new JLabel("9\uBC88");
		lblNewLabel_5_6_2_2.setBounds(391, 376, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_2_2);

		JLabel lblNewLabel_5_6_3_2 = new JLabel("10\uBC88");
		lblNewLabel_5_6_3_2.setBounds(506, 376, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_3_2);

		JLabel lblNewLabel_5_6_4_2 = new JLabel("11\uBC88");
		lblNewLabel_5_6_4_2.setBounds(610, 376, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_4_2);

		JLabel lblNewLabel_5_6_5_2 = new JLabel("12\uBC88");
		lblNewLabel_5_6_5_2.setBounds(732, 376, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_5_2);

		JLabel lblNewLabel_5_6_5_2_1 = new JLabel("12\uBC88");
		lblNewLabel_5_6_5_2_1.setBounds(732, 686, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_5_2_1);

		JLabel lblNewLabel_5_6_7_1 = new JLabel("7\uBC88");
		lblNewLabel_5_6_7_1.setBounds(165, 686, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_7_1);

		JLabel lblNewLabel_5_6_1_2_1 = new JLabel("8\uBC88");
		lblNewLabel_5_6_1_2_1.setBounds(283, 686, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_1_2_1);

		JLabel lblNewLabel_5_6_2_2_1 = new JLabel("9\uBC88");
		lblNewLabel_5_6_2_2_1.setBounds(391, 686, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_2_2_1);

		JLabel lblNewLabel_5_6_3_2_1 = new JLabel("10\uBC88");
		lblNewLabel_5_6_3_2_1.setBounds(506, 686, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_3_2_1);

		JLabel lblNewLabel_5_6_4_2_1 = new JLabel("11\uBC88");
		lblNewLabel_5_6_4_2_1.setBounds(610, 686, 50, 34);
		f.getContentPane().add(lblNewLabel_5_6_4_2_1);

		JLabel c1 = new JLabel("");
		c1.setBounds(853, 411, 61, 42);
		f.getContentPane().add(c1);

		JLabel c1_1 = new JLabel("총 예약수량");
		c1_1.setBounds(853, 374, 77, 42);
		f.getContentPane().add(c1_1);

		JLabel c1_2 = new JLabel("좌석");
		c1_2.setBounds(913, 411, 61, 42);

		JLabel lblNewLabel_4 = new JLabel("A\uC5F4");
		lblNewLabel_4.setFont(new Font("����", Font.PLAIN, 42));
		lblNewLabel_4.setBounds(42, 172, 93, 68);
		f.getContentPane().add(lblNewLabel_4);

		JButton a1 = new JButton("");
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a1.getText();
				if (e.getSource() == a1 && str.equals("")) {
					a1.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a1.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}

		});
		a1.setForeground(Color.red);
		a1.setBackground(Color.LIGHT_GRAY);
		a1.setBounds(147, 152, 84, 76);
		f.getContentPane().add(a1);

		JButton a2 = new JButton("");
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a2.getText();
				if (e.getSource() == a2 && str.equals("")) {
					a2.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a2.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a2.setForeground(Color.red);
		a2.setBackground(Color.LIGHT_GRAY);
		a2.setBounds(261, 152, 84, 76);
		f.getContentPane().add(a2);

		JButton a3 = new JButton("");
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a3.getText();
				if (e.getSource() == a3 && str.equals("")) {
					a3.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a3.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a3.setForeground(Color.red);
		a3.setBackground(Color.LIGHT_GRAY);
		a3.setBounds(371, 152, 84, 76);
		f.getContentPane().add(a3);

		JButton a4 = new JButton("");
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a4.getText();
				if (e.getSource() == a4 && str.equals("")) {
					a4.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a4.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a4.setForeground(Color.red);
		a4.setBackground(Color.LIGHT_GRAY);
		a4.setBounds(483, 152, 84, 76);
		f.getContentPane().add(a4);

		JButton a5 = new JButton("");
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a5.getText();
				if (e.getSource() == a5 && str.equals("")) {
					a5.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a5.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a5.setForeground(Color.red);
		a5.setBackground(Color.LIGHT_GRAY);
		a5.setBounds(600, 152, 84, 76);
		f.getContentPane().add(a5);

		JButton a6 = new JButton("");
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a6.getText();
				if (e.getSource() == a6 && str.equals("")) {
					a6.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a6.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a6.setForeground(Color.red);
		a6.setBackground(Color.LIGHT_GRAY);
		a6.setBounds(715, 152, 84, 76);
		f.getContentPane().add(a6);

		JButton a7 = new JButton("");
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a7.getText();
				if (e.getSource() == a7 && str.equals("")) {
					a7.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a7.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a7.setForeground(Color.red);
		a7.setBackground(Color.LIGHT_GRAY);
		a7.setBounds(147, 284, 84, 76);
		f.getContentPane().add(a7);

		JButton a8 = new JButton("");
		a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a8.getText();
				if (e.getSource() == a8 && str.equals("")) {
					a8.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a8.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a8.setForeground(Color.red);
		a8.setBackground(Color.LIGHT_GRAY);
		a8.setBounds(261, 284, 84, 76);
		f.getContentPane().add(a8);

		JButton a9 = new JButton("");
		a9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a9.getText();
				if (e.getSource() == a9 && str.equals("")) {
					a9.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a9.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a9.setForeground(Color.red);
		a9.setBackground(Color.LIGHT_GRAY);
		a9.setBounds(371, 284, 84, 76);
		f.getContentPane().add(a9);

		JButton a10 = new JButton("");
		a10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a10.getText();
				if (e.getSource() == a10 && str.equals("")) {
					a10.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a10.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a10.setForeground(Color.red);
		a10.setBackground(Color.LIGHT_GRAY);
		a10.setBounds(483, 284, 84, 76);
		f.getContentPane().add(a10);

		JButton a11 = new JButton("");
		a11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a11.getText();
				if (e.getSource() == a11 && str.equals("")) {
					a11.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a11.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a11.setForeground(Color.red);
		a11.setBackground(Color.LIGHT_GRAY);
		a11.setBounds(600, 284, 84, 76);
		f.getContentPane().add(a11);

		JButton a12 = new JButton("");
		a12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = a12.getText();
				if (e.getSource() == a12 && str.equals("")) {
					a12.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					a12.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		a12.setForeground(Color.red);
		a12.setBackground(Color.LIGHT_GRAY);
		a12.setBounds(715, 284, 84, 76);
		f.getContentPane().add(a12);

		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b1.getText();
				if (e.getSource() == b1 && str.equals("")) {
					b1.setText("예약됨");
					count++;
					count1++;
					c1.setText(count + "");
				} else {
					b1.setText("");
					count--;
					count1--;
					c1.setText(count + "");
				}
			}
		});
		b1.setForeground(Color.red);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setBounds(147, 461, 84, 76);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b2.getText();
				if (e.getSource() == b2 && str.equals("")) {
					b2.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b2.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b2.setForeground(Color.red);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setBounds(261, 461, 84, 76);
		f.getContentPane().add(b2);

		JButton b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b8.getText();
				if (e.getSource() == b8 && str.equals("")) {
					b8.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b8.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b8.setForeground(Color.red);
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setBounds(261, 600, 84, 76);
		f.getContentPane().add(b8);

		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b7.getText();
				if (e.getSource() == b7 && str.equals("")) {
					b7.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b7.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b7.setForeground(Color.red);
		b7.setBackground(Color.LIGHT_GRAY);
		b7.setBounds(147, 600, 84, 76);
		f.getContentPane().add(b7);

		JButton b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b9.getText();
				if (e.getSource() == b9 && str.equals("")) {
					b9.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b9.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b9.setForeground(Color.red);
		b9.setBackground(Color.LIGHT_GRAY);
		b9.setBounds(371, 600, 84, 76);
		f.getContentPane().add(b9);

		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b3.getText();
				if (e.getSource() == b3 && str.equals("")) {
					b3.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b3.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b3.setForeground(Color.red);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setBounds(371, 461, 84, 76);
		f.getContentPane().add(b3);

		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b4.getText();
				if (e.getSource() == b4 && str.equals("")) {
					b4.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b4.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b4.setForeground(Color.red);
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setBounds(483, 461, 84, 76);
		f.getContentPane().add(b4);

		JButton b10 = new JButton("");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b10.getText();
				if (e.getSource() == b10 && str.equals("")) {
					b10.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b10.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b10.setForeground(Color.red);
		b10.setBackground(Color.LIGHT_GRAY);
		b10.setBounds(483, 600, 84, 76);
		f.getContentPane().add(b10);

		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b5.getText();
				if (e.getSource() == b5 && str.equals("")) {
					b5.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b5.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b5.setForeground(Color.red);
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setBounds(600, 461, 84, 76);
		f.getContentPane().add(b5);

		JButton b11 = new JButton("");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b11.getText();
				if (e.getSource() == b11 && str.equals("")) {
					b11.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b11.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b11.setForeground(Color.red);
		b11.setBackground(Color.LIGHT_GRAY);
		b11.setBounds(600, 600, 84, 76);
		f.getContentPane().add(b11);

		JButton b12 = new JButton("");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b12.getText();
				if (e.getSource() == b12 && str.equals("")) {
					b12.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b12.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b12.setForeground(Color.red);
		b12.setBackground(Color.LIGHT_GRAY);
		b12.setBounds(715, 600, 84, 76);
		f.getContentPane().add(b12);

		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = b6.getText();
				if (e.getSource() == b6 && str.equals("")) {
					b6.setText("예약됨");
					count++;
					count2++;
					c1.setText(count + "");
				} else {
					b6.setText("");
					count--;
					count2--;
					c1.setText(count + "");
				}
			}
		});
		b6.setForeground(Color.red);
		b6.setBackground(Color.LIGHT_GRAY);
		b6.setBounds(715, 461, 84, 76);
		f.getContentPane().add(b6);

		JButton book = new JButton("\uC608\uC57D");
		book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sum = count1 * price1 + count2 * price2;
				JFrame f2 = new JFrame();
				f2.setSize(1000, 800);
				f2.getContentPane().setLayout(null);

				JLabel lblNewLabel = new JLabel("총 결제금액 :");
				lblNewLabel.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 59));
				lblNewLabel.setBounds(44, 49, 386, 108);
				f2.getContentPane().add(lblNewLabel);

				JLabel n1 = new JLabel("" + sum);
				n1.setHorizontalAlignment(SwingConstants.RIGHT);
				n1.setFont(new Font("굴림", Font.BOLD, 45));
				n1.setBounds(545, 53, 196, 108);
				f2.getContentPane().add(n1);

				JLabel lblNewLabel_2 = new JLabel("원");
				lblNewLabel_2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 59));
				lblNewLabel_2.setBounds(753, 49, 210, 108);
				f2.getContentPane().add(lblNewLabel_2);

				JLabel label = new JLabel("카드결제");
				label.setForeground(Color.MAGENTA);
				label.setFont(new Font("굴림", Font.BOLD, 40));
				label.setBounds(183, 197, 190, 71);
				f2.getContentPane().add(label);

				JLabel lblNewLabel_3 = new JLabel(
						"================================================================================================================================================================");
				lblNewLabel_3.setBackground(Color.BLACK);
				lblNewLabel_3.setBounds(12, 146, 962, 11);
				f2.getContentPane().add(lblNewLabel_3);

				JLabel lblNewLabel_4 = new JLabel("카드번호");
				lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 30));
				lblNewLabel_4.setBounds(12, 305, 153, 39);
				f2.getContentPane().add(lblNewLabel_4);

				JTextField textField = new JTextField();
				textField.setFont(new Font("굴림", Font.PLAIN, 20));
				textField.setHorizontalAlignment(SwingConstants.LEFT);
				textField.setBounds(177, 305, 347, 39);
				f2.getContentPane().add(textField);
				textField.setColumns(10);

				JLabel lblNewLabel_4_1 = new JLabel("CVC");
				lblNewLabel_4_1.setFont(new Font("굴림", Font.BOLD, 30));
				lblNewLabel_4_1.setBounds(12, 389, 92, 39);
				f2.getContentPane().add(lblNewLabel_4_1);

				JTextField textField_1 = new JTextField();
				textField_1.setFont(new Font("굴림", Font.PLAIN, 20));
				textField_1.setHorizontalAlignment(SwingConstants.LEFT);
				textField_1.setColumns(10);
				textField_1.setBounds(177, 389, 347, 39);
				f2.getContentPane().add(textField_1);

				JLabel lblNewLabel_4_2 = new JLabel("생년월일");
				lblNewLabel_4_2.setFont(new Font("굴림", Font.BOLD, 30));
				lblNewLabel_4_2.setBounds(12, 472, 153, 39);
				f2.getContentPane().add(lblNewLabel_4_2);

				JTextField textField_2 = new JTextField();
				textField_2.setFont(new Font("굴림", Font.PLAIN, 20));
				textField_2.setHorizontalAlignment(SwingConstants.LEFT);
				textField_2.setColumns(10);
				textField_2.setBounds(177, 472, 347, 39);
				f2.getContentPane().add(textField_2);

				JLabel lblNewLabel_5 = new JLabel("");
				lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_5.setToolTipText(
						"ㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ\r\nㅣ");
				lblNewLabel_5.setBounds(556, 171, 58, 582);
				f2.getContentPane().add(lblNewLabel_5);

				JLabel lblNewLabel_3_1 = new JLabel(
						"================================================================================================================================================================");
				lblNewLabel_3_1.setBackground(Color.BLACK);
				lblNewLabel_3_1.setBounds(12, 535, 962, 11);
				f2.getContentPane().add(lblNewLabel_3_1);

				JLabel lblNewLabel_6 = new JLabel("무통장입금");
				lblNewLabel_6.setForeground(Color.PINK);
				lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 40));
				lblNewLabel_6.setBounds(183, 583, 348, 39);
				f2.getContentPane().add(lblNewLabel_6);

				JLabel lblNewLabel_7 = new JLabel("조은은행 111-1111-1234487");
				lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 30));
				lblNewLabel_7.setBounds(22, 656, 678, 39);
				f2.getContentPane().add(lblNewLabel_7);

				JButton pay1 = new JButton("결제하기");

				pay1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int sum = count1 * price1 + count2 * price2;
						JOptionPane.showMessageDialog(f, "총 결제하실 금액은  " + "A열 좌석 " + count1 + " 좌석, " + "B열 좌석 "
								+ count2 + " 좌석  총 " + sum + "원 입니다.");
						JOptionPane.showMessageDialog(f, "결제가 완료되었습니다.");

						String num = "A" + count1 + "B" + count2;
						int min = 10000001;
						int max = 79999999;
						System.out.println(num);

						int booking1 = (int) (Math.random() * (max - min)) + min;
						JOptionPane.showMessageDialog(null, "당신의 예약번호는 " + booking1 + "입니다.");

						SeatDAO seatnum = new SeatDAO();
						String booking = booking1 + "";
						try {
							seatnum.create(num, booking);

						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						f2.setVisible(false);

					}
				});
				pay1.setForeground(Color.RED);
				pay1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 40));
				pay1.setBounds(728, 414, 235, 97);
				f2.getContentPane().add(pay1);

				f2.setVisible(true);

				f.setVisible(false);

			}
		});
		book.setForeground(Color.BLACK);
		book.setFont(new Font("����", Font.BOLD, 20));
		book.setBackground(Color.PINK);
		book.setBounds(853, 652, 100, 76);
		f.getContentPane().add(book);

		f.getContentPane().add(c1_2);

		JLabel lblNewLabel = new JLabel(
				"=========================================================================================================");
		lblNewLabel.setBounds(159, 414, 659, 15);
		f.getContentPane().add(lblNewLabel);

		f.setVisible(true);

	}
}
