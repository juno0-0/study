package chatting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer extends Thread implements ActionListener{	
	//필드 선언
	Frame frame;//윈도우창 프레임을 지원하는 클래스
	TextArea ta;//채팅된 내용들이 보이는 부분
	TextField tf;//채팅 글씨 쓰는 부분
	ServerSocket s;
	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;
	
	public ChattingServer() {
		launchFrame();//화면 구현, 화면이 켜지는 메소드
		service();//서버를 연결하는 화면 구현
	}
	
	//서버를 연결하는 화면을 구현하는 메소드
	private void service() {
		try {
			ta.append("서비스 하기 위해서 준비중...\n");//Textarea에 문자를 추가하는 것(수정 x)
			s = new ServerSocket(5432);
			ta.append("클라이언트 접속 대기 중...\n");
			s1 = s.accept();//Socket
			ta.append("클라이언트가 접속하였습니다... "+s1.getInetAddress()+"\n");
			dos = new DataOutputStream(s1.getOutputStream());
			dis = new DataInputStream(s1.getInputStream());
			this.start();//스레드 호출
			dos.writeUTF("채팅 서버에 접속하신 것을 환영합니다...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		try {
			while(!stop) {
				ta.append(dis.readUTF()+"\n");
			}
			dis.close();s1.close();
		} catch (EOFException e) {
			System.out.println("클라이언트로부터 연결이 끊겼습니다...");
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	//채팅 화면을 구현하는 메소드
	private void launchFrame() {
		frame = new Frame("일대일 채팅");//제목?
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.RED);//배경색, 안보이는 이유는 ta랑 tf가 프레임창을 다 채우고 있어서
		ta.setEditable(false);//채팅된 내용들이 보이는 부분을 수정할 수 없게 막는 것
		
		frame.add(ta, BorderLayout.CENTER);//프레임에 붙이는 것 
		//첫번째 매개변수는 어떤걸 붙일건지, 두번째 매개변수는 frame의 어떤 위치에 붙일건지
		//BorderLayout은 중간, 동, 서, 남, 북
		
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);//현재 수행했던 작업이 처리
		//tf가 정적이니까 동적으로 움직일 수 있게 지정하는 것
		//매개변수로 this를 준 이유는 이미 액션리스너 인터페이스를 클래스에서 받아와서 그럼
		//this가 가르키는건 actionPerformed()의 매개변수
		//개별적으로 액션리스너를 설정할 경우 implement를 안하고 그냥 매개변수에 Actionlistner의 
		//익명 구현 객체를 넣는다.(new Actionlistner(){};)
		
		//창이 꺼지는 메소드
		frame.addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            frame.dispose();
	         }
	    });
		
		frame.setSize(500, 300);//첫번째 매개변수 : x, 두번째 매개변수 : y
	    frame.setVisible(true);//창을 보이게 할껀지?
	    tf.requestFocus();//입력하는 곳에 커서를 깜빡이게 하기
	}

	@Override//ActionListener의 추상 메소드
	public void actionPerformed(ActionEvent e) {
		try {
			String msg = tf.getText();//문자로 받아온다. set으로 지정도 가능함
			ta.append(msg+"\n");
			if(msg.equals("exit")) {
				ta.append("bye");
				stop = true;//run()에서 while()이 종료된다.
					dos.close();
					s1.close();
					System.exit(0);
			}else {
				dos.writeUTF("서버 : "+msg);
				tf.setText("");//채팅을 치면 입력이 되고 채팅입력쪽이 비워지는 것
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChattingServer();
	}
}
