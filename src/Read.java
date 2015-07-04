import java.io.FileInputStream;
import java.io.IOException;


public class Read {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("t1.txt");
		
		int i=0;
		/*while((i=fin.read())!=-1){
			System.out.print((char)i);
		}*/
		while((fin.read())!=-1){
			i=fin.read();
			System.out.print((char)i);
		}
		
		fin.close();

	}

}
