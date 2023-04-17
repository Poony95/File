package fileTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FileButtonTest extends JFrame {

	public FileButtonTest() {
		JButton btn = new JButton("확인");
		setLayout(new FlowLayout());
		add(btn);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FileButtonTest();
	}

}
