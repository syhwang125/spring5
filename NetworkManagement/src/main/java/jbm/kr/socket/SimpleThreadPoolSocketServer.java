package jbm.kr.socket;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SimpleThreadPoolSocketServer {

	private static final  Logger LOG = LoggerFactory.getLogger(SimpleThreadPoolSocketServer.class);
	private static final int PORT = 8080;
	private static final int THREAD_CNT = 5;
	private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_CNT);
	
	public static void main(String[] args) {
		LOG.debug("Hello Debug!!!");
		LOG.info("Hello INFO");
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			
			while(true) {
				Socket socket = serverSocket.accept();
				try {
					threadPool.execute(new ConnectionWrap(socket));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
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
		
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}

