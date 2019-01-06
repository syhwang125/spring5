import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Chap37NIO2 {

	public static void main(String[] args) {
		
		/*
		 *  File 읽는 방법 		
		 */
		//Path book = Paths.get("/Users/youngminlee/eclipse-workspace/JavaTutorial/Chap37.txt");
		Path book = Paths.get("Chap37.txt");  // NoSuchFileException
		try {
			BufferedReader reader = Files.newBufferedReader(book);
			
			// 무식하게 한줄씩 읽는 경우 
			// System.out.println(reader.readLine());
			// System.out.println(reader.readLine());
			
			String line = reader.readLine();	// 라인 한줄 읽고 
			while (line != null) {				// null 이 아니면 
				System.out.println(line);		// 출력하고 
				line = reader.readLine();		// 다음 줄 읽고 
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		/*
		 * File 쓰기 
		 */
		Path note = Paths.get("Chap37Note.txt");
		BufferedWriter writer;
		try {
			writer = Files.newBufferedWriter(note, StandardCharsets.UTF_8);
			writer.write("Today's lessen : reading and writing text");
			writer.newLine();
			writer.write("Use BufferedReader to read text");
			writer.newLine();
			writer.write("Use BufferedReader to write text");
			writer.flush();		// flush 를 해야 파일에 써진다. 
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
