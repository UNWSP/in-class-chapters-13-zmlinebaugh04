import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class inclasschp13_1 {

	public static void main(String[] args) {
		String file = "C:\\Users\\zacha\\Documents";
		File red = new File(file);
		double read = red.length();
		System.out.println(read);
	}

}
