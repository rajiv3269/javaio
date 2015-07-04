import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Readkeyboard {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("enter your name");
		String name=br.readLine();
		System.out.println("you typed:" + name);

	}

}
