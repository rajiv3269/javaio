import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Byte {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout=new FileOutputStream("t2.txt");
		FileOutputStream fout1=new FileOutputStream("t3.txt");
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		String s="writing in multiple files";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.writeTo(fout1);
		bout.writeTo(fout);
		bout.flush();
		System.out.println("done");
		
		

	}

}
