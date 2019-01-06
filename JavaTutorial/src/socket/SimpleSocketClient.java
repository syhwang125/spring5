package socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SimpleSocketClient {
	// 연결할 포트를 지정 
	private static final int PORT = 8081;
	
	public static void main(String[] args) {
		try {
			// 소켓을 생성 
			Socket socket = new Socket("localhost", PORT);
			// 스트림을 얻어온다 
			InputStream stream = socket.getInputStream();
			// 스트림을 래핑한다 
			BufferedReader br = new BufferedReader(new InputStreamReader(stream));
			// 결과를 읽는다. 
			String response = br.readLine();
			System.out.println(response);   // 결과를 출력 
			
			socket.close();
			System.exit(0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
