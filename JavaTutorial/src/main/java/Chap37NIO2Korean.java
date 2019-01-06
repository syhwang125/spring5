import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

	public class Chap37NIO2Korean {

		public static void main(String[] args) {
			
			/*
			 *  File 읽는 방법 		
			 */
			Path book = Paths.get("Chap37Korean.txt");
			
			try {
				
				BufferedReader reader2 = Files.newBufferedReader(book, Charset.forName("euc-kr"));	
				//Input length = 2 exception 
				BufferedReader reader = Files.newBufferedReader(book,StandardCharsets.UTF_8); 
				
				String line = reader.readLine();	// 라인 한줄 읽고 
				while (line != null) {				// null 이 아니면 
					System.out.println(line);		// 출력하고 
					line = reader.readLine();		// 다음 줄 읽고 
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
