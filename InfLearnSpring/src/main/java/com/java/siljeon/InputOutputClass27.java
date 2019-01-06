package com.java.siljeon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputClass27 {

	public static void main(String[] args) {
		InputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream("/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/hello.txt");
			int data = 0;
			
			while(true) {
				try {
					data = inputStream.read();
				}catch(Exception e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println(" data : " + data);		//1byte 단위로 ascii code 출력됨 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("####### read[byte]");
		
		try {
			inputStream = new FileInputStream("/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/hello.txt");
			int data = 0;
			
			byte[] bs = new byte[3];   
			
			while(true) {
				try {
					data = inputStream.read(bs);   //3bytes씩 읽어옴 
				}catch(Exception e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println(" data : " + data);		//1byte 단위로 ascii code 출력됨 
				for(int i=0; i<bs.length; i++) {
					System.out.println("bs [ " + i + "]" + bs[i]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println();
		System.out.println("####### write ");
		
		OutputStream outputStream = null; 
		try {
			outputStream = new FileOutputStream("/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/helloWrite.txt");
			String data = "Hello java world!! ";
			
			byte[] arr = data.getBytes();
			
			try {
					outputStream.write(arr, 0, 5);
			}catch(Exception e) {
					e.printStackTrace();
			}
				
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

		
		System.out.println();
		System.out.println("####### File In/Output Stream - filecopy ");
		
		InputStream inStream = null;
		OutputStream outStream = null; 
		try {
			inStream = new FileInputStream("/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/hello.txt");
			outStream = new FileOutputStream("/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/helloCopy.txt");
			
			byte[] arr = new byte[3] ;
			
			while(true){
				int len = inStream.read(arr);
				if (len == -1) break;
				outStream.write(arr, 0, len);
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(inStream != null) {
				try {
					inStream.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(outStream != null) {
				try {
					outStream.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println();
		System.out.println("####### Data Output Stream - file write ");
		
		String str = "Hello Java World !!";
		OutputStream opStream = null; 
		DataOutputStream dopStream = null; 
		
		try {
			opStream = new FileOutputStream("/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/helloWorld.txt");
			dopStream = new DataOutputStream(opStream);
			
			dopStream.writeUTF(str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(dopStream != null) {
				try {
					dopStream.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(opStream != null) {
				try {
					opStream.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println();
		System.out.println("####### Data In/Output Stream - filecopy ");
		
		InputStream ipStream = null;
		DataInputStream dipStream = null;
		OutputStream opStream2 = null; 
		DataOutputStream dopStream2 = null; 
		
		try {
			ipStream = new FileInputStream("/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/helloWorld.txt");
			dipStream = new DataInputStream(ipStream);
			String str2 = dipStream.readUTF();
			
			opStream2 = new FileOutputStream("/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/helloWorldCopy.txt");
			dopStream2 = new DataOutputStream(opStream2);
			
			dopStream2.writeUTF(str2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(dopStream2 != null) {
				try {
					dopStream2.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(opStream2 != null) {
				try {
					opStream2.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		System.out.println();
		System.out.println("########### BufferedReader ");
		String fileName = "/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/hello.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String strLine;
			while((strLine = br.readLine()) != null) {
				System.out.println(strLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
		
		System.out.println();
		System.out.println("########### BufferedWriter ");
		String fileName2 = "/Users/youngminlee/eclipse-workspace/InfLearnJava/src/main/resources/helloWriter.txt";
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			String str2 = "Hello Java World~~~~~ \n";
			str2 += "Hello C World ~~ \n";
			str2 += "Hello Python World ~~ \n";
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
			bw.write(str2);
			
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}

}
