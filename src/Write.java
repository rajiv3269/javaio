import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Write {

	public static void main(String[] args)  {
		
		try {
			FileOutputStream fout=new FileOutputStream("t1.txt");
			String s="My firast file handling prog";
			byte[] b=s.getBytes();
			try {
				fout.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fout.close();
				System.out.println("done writing");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
