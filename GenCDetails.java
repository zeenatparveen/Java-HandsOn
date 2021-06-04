package corejava;
import java.util.Scanner;
class EmpTrainee
{
	private int employee_id;
	private String name;
	private static final String COHORT_CODE = "CHNAJ19004";
	Scanner sc=new Scanner(System.in);
	public EmpTrainee()
	{
		this.employee_id =0;
		this.name ="NA";
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id() {
		System.out.println("Enter the employee id");
		this.employee_id=sc.nextInt();
		sc.nextLine();
	}
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("Enter the employee name");
		this.name=sc.nextLine();
	}
	public void display()
	{
		System.out.println(this.getEmployee_id()+" "+this.getName()+" "+EmpTrainee.COHORT_CODE);
	}
}
public class GenCDetails {

		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);

			System.out.println("Enter the number of GenC");
			int num=sc.nextInt();
			EmpTrainee obj[]=new EmpTrainee[num];
			for(int i=0;i<num;i++) {
				obj[i]=new EmpTrainee();
			}
			for(int i=0;i<num;i++){
				obj[i].setEmployee_id();
				obj[i].setName();
			}
			for(int i=0;i<num;i++){
				obj[i].display();
			}
			sc.close();
		}

}
