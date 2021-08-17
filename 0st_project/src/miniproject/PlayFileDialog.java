package miniproject;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayFileDialog {

	public static void main(String[] args) {
		JFrame f = new JFrame("사진 파일 선택하기");
		f.setSize(300, 300);
		PlayrankDAO pic = new PlayrankDAO();
		
		JButton b = new JButton("New button");
		f.getContentPane().add(b, BorderLayout.CENTER);
		FileDialog file = new FileDialog(f);
		file.setDirectory(".");
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				file.setVisible(true);
				
				String concert11 =  file.getFile();
				try {
					pic.create(concert11);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);

	}

}
