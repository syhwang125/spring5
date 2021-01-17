package jbm.kr.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SimpleSocketClient {

	private static final int PORT = 8080;
	
	public static void main(String[] args) {

		try {
			// 소켓 생성 
			Socket socket = new Socket("localhost",PORT);
			// 스트림을 얻어온다. 
			InputStream stream = socket.getInputStream();
			// 스트림을 래핑한다. 
			BufferedReader br = new BufferedReader(new InputStreamReader(stream));
			// 결과를 읽는다. 
			String response = br.readLine();
			System.out.println(response);   // 결과 출력 
			
			socket.close();     // 소켓 닫기 
			System.exit(0);		// 프로그램종료 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
