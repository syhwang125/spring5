package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SimpleThreadPoolSocketServer {

	private static final int PORT =8081;
	private static final int THREAD_CNT = 5;
	private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_CNT);
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			while(true) {
				Socket socket = serverSocket.accept();
				try {
					threadPool.execute(new ConnectionWrap(socket));
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}

class ConnectionWrap implements Runnable {

	private Socket socket = null;
	public ConnectionWrap(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			OutputStream stream = socket.getOutputStream();
			stream.write(new Date().toString().getBytes());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		

}
