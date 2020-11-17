import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class circlecal extends JFrame {


	public static void main(String[] args) {

		JFrame f = new JFrame("원의 넓이 구하기");
		f.setSize(300, 300); // 창의 크기.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 메모리상에서 깔끔하게 지워주는 역할
		// panel 2개 추가.

		String[] col = { "red", "blue" };

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel bigPanel = new JPanel();
		JLabel label = new JLabel("원의 반지름 ");
		JLabel label2 = new JLabel("원의 넓이 ");
		
		JTextField txt = new JTextField(10);
		JTextField txt2 = new JTextField(10);
		
		
		Border border = BorderFactory.createLineBorder(Color.black);// textArea 경계선
		JTextArea textArea = new JTextArea(8, 20); // textArea 크기 설정 

		JButton btn1 = new JButton("계산");
		JButton btn2 = new JButton("리셋");
		JComboBox box1 = new JComboBox(col); // 리스트박스 배열 red blue선언
		
		
		textArea.setLineWrap(true) ; // 자동 줄바꿈.
		textArea.setText("이 영역에 원의 넓이를 계산하는 과정이 나타납니다.");
		textArea.setBorder(border); // textArea부분에 경계선 적용

		
		
		//세로줄로 BoxLayout 추가 
		BoxLayout layout = new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS);
		f.setLayout(layout);
				
	
		
		//north
		
		panel1.add(label);
		panel1.add(txt);
		
		
		//center
		panel2.add(label2);
		panel2.add(txt2);
		
		
		panel3.add(textArea);
		
		//south
		panel4.add(btn1);  
		panel4.add(box1);
		panel4.add(btn2);
		
	
		
		f.add(panel1, BorderLayout.NORTH);
		f.add(panel2);
		f.add(panel3, BorderLayout.CENTER);
		f.add(panel4, BorderLayout.SOUTH);
		f.pack();

		// f.setLayout(new FlowLayout());
		
		f.setVisible(true); // 프레임을 보여주겠다.
		
		
		
		
		//버튼1에 대한 액션  강제형변환 사용후 값 계산 
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String a = txt.getText();
				double temp_double = Double.parseDouble(a);
				double c = (double) ((temp_double*temp_double)*3.1415926535);
				String d = Double.toString(c);
				textArea.setText("("+a +"*"+ a +")"+"* 3.14");
				txt2.setText(d);
			}
			
			
			
		});
		// 리셋 버튼 초기화 부분 
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				txt2.setText("");
				textArea.setText("이 영역에 원의 넓이를 계산하는 과정이 나타납니다.");
			}
			
		});
		
		// ComboBox의 이벤트 리스너   
		// index로 값을 읽어와서 setForegound로 글자의 색깔을 지정
		
		box1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JComboBox jbox = (JComboBox)e.getSource();
				int index = jbox.getSelectedIndex();
				if(index == 0) {
					textArea.setForeground(Color.red);
				}else if(index == 1) {
					textArea.setForeground(Color.blue);
				}
			}
			
		});
		
		
		
		
	}

}
