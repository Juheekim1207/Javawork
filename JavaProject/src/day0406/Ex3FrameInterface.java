package day0406;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//어떻게 활용되는지 테스트 예제 

public class Ex3FrameInterface extends 
	Frame implements WindowListener,ActionListener{
	
		Button btn;
		private Color Color;

		// TODO Auto-generated method stub
		public Ex3FrameInterface() { //생성자 호출 
			super("Hello");
			this.setBounds(300,100,300,300);
			this.addWindowListener(this); //윈도우 이벤트 발생
			this.setLayout(new FlowLayout()); //레이아웃 변경
			this.setBackground(Color.pink);;
			btn = new Button("Click");
			this.add(btn);
			btn.addActionListener(this); //버튼 이벤트 발생
			this.setVisible(true);
			
		}
		
		
		public static void main(String[] args) {
			new Ex3FrameInterface(); //생성자 호출 
		
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("버튼 클릭했어요!!");
			
		}


		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0); //윈도우 x클릭시 호출 (시스템 종료)
		}


		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

}
