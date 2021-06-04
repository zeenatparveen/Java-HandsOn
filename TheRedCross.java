package corejava;
import java.util.Scanner;
public class TheRedCross {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ref[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			ref[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=sum+ref[i];
		}
		System.out.println(sum);
		sc.close();

	}
}
