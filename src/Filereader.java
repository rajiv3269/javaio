import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Filereader {

	public static void main(String[] args) throws IOException {
	     
		 FileReader fr=new FileReader("t1.txt");
		 int i=0;
		 while((i=fr.read())!=-1){
			 
			 System.out.print((char)i);
		 }

	}

}
