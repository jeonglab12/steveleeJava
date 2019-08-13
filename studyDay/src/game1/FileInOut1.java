package game1;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileInOut1 {
	
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("C:\\stevelee\\steveleeJava\\studyDay\\src\\game1\\text1.txt", true);
			fw.write("\n word test");
			fw.close();
			
			FileOutputStream fos = new FileOutputStream("C:\\stevelee\\steveleeJava\\studyDay\\src\\game1\\text2.txt");
			fos.write(121);
			
		} catch (Exception e) {
			
		}
		
	}
}
