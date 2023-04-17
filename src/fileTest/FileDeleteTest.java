package fileTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FileDeleteTest extends JFrame {

	public FileDeleteTest() {
		setLayout(new FlowLayout());
		JButton btn = new JButton("파일삭제");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = "c:/temp";
				String fname = "Modetest.java";
				File file = new File(path +"/"+ fname);
				boolean re = file.delete();
			}
		});
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FileDeleteTest();
	}

}
