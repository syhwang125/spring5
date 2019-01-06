package Serializer;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class SerializerTest {

	// JVM 힙 영역에 존재하는 객체를 한 줄로 늘어선 바이트의 형태로 만드는 것을 객체의 직 
	
	public static void main(String[] args) {
		byte[] serializedMember = null;
		
		/*
		Member member = new Member("김배","delivery@abcmart.com",25);
		
		
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
				oos.writeObject(member);
				serializedMember = baos.toByteArray();
			}
		}
		*/
		System.out.println(Base64.getEncoder().encodeToString(serializedMember));
	}

}

class Member implements Serializable {
	/**
	 * add generated serial version UID 
	 * serialVersionUID == '분산처리 환경에서 유일한Unique 클래스라는 것을 증명하기 위한 신분증'
	 * w직렬화, 멀티쓰레드에 사용되는 도메인 객체에 선언
	 */
	private static final long serialVersionUID = 1L;
	
}
