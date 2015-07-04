import java.io.FileWriter;
import java.io.IOException;


public class Filewriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("t1.txt");
		fw.write("File writer");
		fw.flush();
		System.out.println("done writing");

	}

}
