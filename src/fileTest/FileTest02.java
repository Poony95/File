package fileTest;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.io.File;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class FileTest02 extends JFrame {

	String path = "c:/temp/test";
	JList<String> list;
	
	public FileTest02() {
		
		File dir = new File(path);
		String []file_list = dir.list();	//list()는 파일에 있는 것들을 담으라는 뜻
		list = new JList<String>(file_list);
		JScrollPane jsp = new JScrollPane(list);
		
		setLayout(new FlowLayout());
		add(jsp);
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FileTest02();
	}

}
