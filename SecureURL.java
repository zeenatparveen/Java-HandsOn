package corejava;
import java.util.Scanner;
public class SecureURL {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		System.out.println("Enter the start string ");
		String start=sc.nextLine();
		if(str.contains(start)) {
			System.out.println("\""+str+"\""+ " starts with "+ "\""+start+"\"");
		}else {
			System.out.println("\""+str+"\""+ " does not start with "+ "\""+start+"\"");
		}
		
		sc.close();
	}
}
