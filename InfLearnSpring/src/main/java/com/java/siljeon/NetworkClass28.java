package com.java.siljeon;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 실행 한 후 브라우저에서 http://localhost:9000/ 을 실행하면 콘솔에 연결정보가 나타남 

public class NetworkClass28 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
				
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
				
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("클이언트 맞이할 준비 ");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 ");
			System.out.println("socket : " + socket);
			
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			while(true) {
				String clientMessage = dataInputStream.readUTF();
				System.out.println("clientMessage : " + clientMessage);
				dataOutputStream.writeUTF("message send complete");
				dataOutputStream.flush();
				if(clientMessage.equals("stop")) break;
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
