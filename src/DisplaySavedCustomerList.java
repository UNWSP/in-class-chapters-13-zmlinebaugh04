import java.io.*;
import java.nio.file.*;

public class DisplaySavedCustomerList {

	public static void main(String[] args) {
		try {
		Path file = Paths.get("C:\\Users\\zacha\\Documents\\GitHub\\in-class-chapters-13-zmlinebaugh04\\src\\WriteCustomerList.java");
		String array[] = new String[4];
		String delimtier = ",";
		InputStream input = new BufferedInputStream(Files.newInputStream(file));
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
		String s = reader.readLine();
		while ( s != null) {
			System.out.println(s);
			for (int x = 0; x <= array.length; x++) {
				System.out.println(array[x] + " ");
				System.out.println();
				s = reader.readLine();
			}
		}
	}
		catch(IOException e) {
			System.out.println("Ouch");
		}
		
	}
}
