import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class User {
	

	public static void main(String[] args) throws FileNotFoundException {
		
		   Scanner scan = new Scanner (new File("/Users/timnittesfaye/Desktop/loginFile.txt"));
		    Scanner keyboard = new Scanner (System.in);
		    
		  String user = scan.nextLine();
		    String pass = scan.nextLine(); // looks at selected file in scan
		    
		    System.out.println("Enter User name: ");
		    String inpUser = keyboard.nextLine();
		    
		    System.out.println("Enter Password: ");
		    String inpPass = keyboard.nextLine(); // gets input from user

		    if (inpUser.equals(user) && inpPass.equals(pass)) {
		        System.out.println("Welcome " +  user + "!");
		    } else {
		        System.out.println("Wrong Username or Password!");
		    }
		    
		    scan.close();
		    keyboard.close();
		}
		} 
