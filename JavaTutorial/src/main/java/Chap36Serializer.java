import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 직렬화 Serialization 
// Object -> Binary 형태의 파일로 변환 
// 	0101 0000 1111
// .bin 또는 .ser 파일로 생성됨 

// 역직렬화 Deserialization 
// Binary 형태의 파일 -> Object 로 변환 

// 포켓몬스터 등 게임을 할때 파일에 저장해 둬야 나중에 다시 진행할 수 있음 
// 직렬화 : 오브젝트의 데이터를 하드디크에 파일로 저장함 
// 역직렬화 : 하드디스크의 파일을 오브젝트로 메모리에 로딩하기 위함 
 
public class Chap36Serializer implements Serializable {

	/**
	 * implements Serializable -> serialVersionUID 자동생성 
	 */
	private static final long serialVersionUID = -4444330800097550144L;

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		/*   Serialization 해서 student 객체를 test.bin 파일로  생성, 저장 함 
		Chap36Student rin = new Chap36Student(180718, "ComputerScience", "Rin");
		System.out.println(rin.getId() + "\t" + rin.getName() + "\t" + rin.getMajor());
		
		FileOutputStream fos = new FileOutputStream("test.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(rin);
		oos.close();
		
		// Exception in thread "main" java.io.NotSerializableException: Chap36Student
		// F5 refresh 를 하면 package explorer 에 test.bin 파일이 생성된 것을 볼 수 있음 
		 */
		
		// deserializer
		FileInputStream fis = new FileInputStream("test.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Chap36Student clone = (Chap36Student) ois.readObject();
		 
		ois.close();
		System.out.println(clone.getId() + "\t" + clone.getName() + "\t" + clone.getMajor());
		
	}
}
