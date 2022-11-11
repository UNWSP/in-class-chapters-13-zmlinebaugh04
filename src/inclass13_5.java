import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class inclass13_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Path file = Paths.get("C:\\Users\\zacha\\Documents\\GitHub\\in-class-chapters-13-zmlinebaugh04\\src\\WriteCustomerList.java");
		String firstName, lastName, data;
		int balance, id;
		
		try {
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			System.out.println("Please enter customer ID: ");
			id = input.nextInt();
			while(id != 555) {
			System.out.println("Please enter customer first name: ");
			firstName = input.next();
			System.out.println("Please enter customer last name: ");
			lastName = input.next();
			System.out.println("Please enter customer balance: ");
			balance = input.nextInt();
		
			data = id + "," + firstName + "," + lastName + "," + balance;
			writer.write(data, 0, data.length());
			
			System.out.println("Please enter customer ID or enter 555 to stop: ");
			id = input.nextInt();
			}
			writer.close();
		}
			
		catch (IOException e) {
			//e.printStackTrace();
			System.out.print("ERROR");
		}
	}

}
