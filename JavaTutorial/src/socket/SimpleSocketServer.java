package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleSocketServer {
	private static final int PORT = 8081;

	public static void main(String[] args) throws IOException {
		try {
			// 서버 소켓 생성 
			ServerSocket serverSocket = new ServerSocket(PORT);
			
			// 소켓 서버가 종료될때까지 무한 루프 
			while(true) {
				// 소켓 접속 요청이 올때까지 대기한다. 
				Socket socket = serverSocket.accept();
				try {
					// 응답을 위해 스트림을 얻어온다 
					OutputStream stream = socket.getOutputStream();
					// 현재 날짜를 출력한다. 
					stream.write(new Date().toString().getBytes());
				} finally {
					socket.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
