package corejava;
import java.util.Scanner;
public class Compare2Integers {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int x=0,y=0;
		System.out.println("Enter the first number ");
		x=sc.nextInt();
		System.out.println("Enter the second number ");
		y=sc.nextInt();
		sc.close();
		
		if(x>y) {
			System.out.println(x+" is greater than "+y);
		}
		else {
			System.out.println(y+" is greater than "+x);
		}
	}
}
