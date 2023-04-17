package coffeeshop;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Coffeeshop extends JFrame {
	int i;
	String []str = {"Small", "Medium", "Large"};
	int []price = {3000,4000,5000};
	HashMap<String, Integer> map ;
	JRadioButton []jrb = new JRadioButton[str.length];
	JLabel jlb;
	ButtonGroup bg;
	public Coffeeshop() {
		map = new HashMap<String,Integer>();		
		bg = new ButtonGroup();
		setLayout(new BorderLayout());
		jlb = new JLabel();
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setLayout(new GridLayout(4, 2));
		p1.add(new JLabel("커피크기"));
		p1.add(new JLabel("가격(원)"));
		//반복문을 모두 수행했을때에 i의 값은 3입니다.
		for(i=0; i<str.length; i++) {
			map.put(str[i], price[i]);
			jrb[i] = new JRadioButton(str[i]);
			bg.add(jrb[i]);
			p1.add(jrb[i]);
			p1.add(new JLabel(price[i]+""));
			
			//라디오가 눌러졌을때에 i의 값은 3입니다.
			jrb[i].addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					String key = ((JRadioButton)e.getSource()).getText();
					jlb.setText(map.get(key)+"원");
				}
			});
		}
		System.out.println("i:"+i);
		p2.add(new JLabel("결재금액:"));
		p2.add(jlb);
		
		
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		new Coffeeshop();

	}

}