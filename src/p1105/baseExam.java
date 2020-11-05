package p1105;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class baseExam {

	public static void main(String[] args) {

		JFrame f = new JFrame("원의 넓이 구하기");
		f.setSize(300, 300); // 창의 크기.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// panel 2개 추가.

		String[] col = { "red", "blue" };

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JLabel label = new JLabel("원의 반지름 ");
		JLabel label2 = new JLabel("원의 넓이 ");
		JTextField txt = new JTextField(10);
		JTextField txt2 = new JTextField(10);
		Border border = BorderFactory.createLineBorder(Color.black);

		JTextArea textArea = new JTextArea(8, 20);

		JButton btn1 = new JButton("계산");
		JButton btn2 = new JButton("리셋");
		JComboBox box1 = new JComboBox(col);

		textArea.setText("이 영역에 원의 넓이를 계산하는 \n 과정이 나타납니다.");
		textArea.setBorder(border);

		//north
		panel1.add(label);
		panel1.add(txt);
		//center
		panel2.add(label2);
		panel2.add(txt2);
		panel2.add(textArea);
		//south
		panel3.add(btn1);  
		panel3.add(box1);
		panel3.add(btn2);

		f.add(panel1, BorderLayout.NORTH);
		f.add(panel2, BorderLayout.CENTER);
		f.add(panel3, BorderLayout.SOUTH);

		// f.setLayout(new FlowLayout());
		f.setVisible(true); // 프레임을 보여주겠다.

	}

}
/*
 * JButton btn = new JButton("성공"); // 버튼 객체 생성 JButton btn2 = new
 * JButton("실패"); f.setLayout(new FlowLayout()); f.add(btn); // 버튼 추가
 * f.add(btn2);
 */
