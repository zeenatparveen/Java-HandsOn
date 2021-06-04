package corejava;
import java.util.Scanner;
interface IPlayerStatistics{
	public void displayPlayerStatistics();
}
abstract class Player{
	protected String name,teamName;
	protected int noOfMatches;

	public Player(String name, String teamName, int noOfMatches) {
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	
}
class CricketPlayer extends Player implements IPlayerStatistics{
	private int totalRunsScored,noOfWicketsTaken;

	public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("Player Name : "+name);
		System.out.println("Team Name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("Total runscored : "+totalRunsScored);
		System.out.println("No of wickets taken : "+noOfWicketsTaken);
	}
}
class HockeyPlayer extends Player implements IPlayerStatistics{
	private String position;
	private int noOfGoals;

	public HockeyPlayer(String name, String teamName, int noOfMatches, String position, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("Player Name : "+name);
		System.out.println("Team Name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("Position : "+position);
		System.out.println("No of goals taken : "+noOfGoals);
	}
}
public class PlayerDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu \r\n" + 
				"1.Cricket Player Details \r\n" + 
				"2.Hockey Player Details \r\n" + 
				"Enter choice \r\n" + 
				"");
		int choice=sc.nextInt();
		sc.nextLine();
		if(choice==1) {
			System.out.println("Enter player name ");
			String name=sc.nextLine();
			System.out.println("Enter team name ");
			String teamName=sc.nextLine();
			System.out.println("Enter number of matches played ");
			int noOfMatches=sc.nextInt();
			System.out.println("Enter total runs scored ");
			int totalRunsScored=sc.nextInt();
			System.out.println("Enter total number of wickets taken ");
			int noOfWicketsTaken=sc.nextInt();
			IPlayerStatistics i=new CricketPlayer(name, teamName, noOfMatches, totalRunsScored, noOfWicketsTaken);
			i.displayPlayerStatistics();
		}
		if(choice==2){
			System.out.println("Enter player name ");
			String name=sc.nextLine();
			System.out.println("Enter team name ");
			String teamName=sc.nextLine();
			System.out.println("Enter number of matches played ");
			int noOfMatches=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the position  ");
			String position=sc.nextLine();
			System.out.println("Enter total number of goals taken  ");
			int noOfGoals=sc.nextInt();
			IPlayerStatistics i=new HockeyPlayer(name, teamName, noOfMatches, position, noOfGoals);
			i.displayPlayerStatistics();
		}
	}
}
