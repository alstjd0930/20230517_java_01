package kh.lclass.chat.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kh.lclass.chat.client.ClientBackground;

public class ServerGUI extends JFrame implements ActionListener{
	//컴파일 시 인식할 serverGUI으로 만들어진 객체 고유id
	private static final long serialVersionUID = 6085316166659427339L;
	
	private JTextArea jta = new JTextArea(40,25);	//채팅창
	private JTextField jtf =new JTextField(25);		//채팅 입력부분
	private ServerBackground sb =new ServerBackground();
	
	public ServerGUI() {
		//생성자에서는 초기화(즉 화면 초기화)
		setBounds(200,100,400,600);	//창이 뜨는 위치
		setTitle("서버창");
		jta.setEditable(false);	//채팅창은 입력되지 않도록 함
		jta.setFont(new Font("맑은고딕", Font.PLAIN,18)); 	//글자 폰트 크기
		jta.setBackground(new Color(230,255,230));
		
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		sb.setGui(this);
		sb.setting();
		
	}
	public void appenMsg(String msg) {
		//jta(채팅창)에 msg를 추가 
		jta.append(msg);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// 입력창에 글 입력하고 enter key를 눌렀을때
		String msg = jtf.getText();
		System.out.println(msg);
		jtf.setText(""); 	//입력된 글을 초기화
		// client에게 전달
		
		
	}
}
