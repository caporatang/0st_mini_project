package miniproject3;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class 로그인 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame j = new JFrame("로그인");
		j.setSize(350,350);
		j.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(114, 52, 208, 44);
		j.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 121, 208, 44);
		j.getContentPane().add(textField_1);
		
		JLabel l1 = new JLabel("I D : ");
		l1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		l1.setBounds(31, 49, 132, 44);
		j.getContentPane().add(l1);
		
		JLabel lblPW = new JLabel("P W :");
		lblPW.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		lblPW.setBounds(31, 118, 132, 44);
		j.getContentPane().add(lblPW);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(78, 207, 132, 61);
		j.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		j.setVisible(true);

	}
}
