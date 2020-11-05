package p1105;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloSwing {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("예제");
		f.setSize(300,300); // 창의 크기.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel 2개 추가.
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JButton btn = new JButton("성공");  // 버튼 객체 생성
		JButton btn2 = new JButton("실패");
		JButton btn3 = new JButton("취소");
		JButton btn4 = new JButton("44444");
		JButton btn5 = new JButton("55");
		
		panel1.setBackground(Color.RED);
		
		panel1.add(btn);
		panel2.add(btn2);
		panel2.add(btn3);
		panel2.add(btn4);
		panel2.add(btn5);
		
		
		
		
		
		f.add(panel1, BorderLayout.NORTH);
		f.add(panel2, BorderLayout.SOUTH);
		
	//	f.setLayout(new FlowLayout());
		f.setVisible(true);  // 프레임을 보여주겠다.

	}

}
/*
JButton btn = new JButton("성공");  // 버튼 객체 생성
JButton btn2 = new JButton("실패");
	f.setLayout(new FlowLayout());
f.add(btn); // 버튼 추가
f.add(btn2);
*/