package pksoft;
import java.io.*;

public class first {

	public static void main(String[] args) throws Exception { // this throws exception for future problems
		
		FileInputStream fis = new FileInputStream("F://pksoft/second.txt");
		int pk =0;
		while((pk=fis.read())!=-1) {
			System.out.println((char)pk);
		}
		fis.close();
	}		
}
