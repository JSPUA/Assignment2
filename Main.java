import java.sql.SQLException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentView sv=new StudentView(); 
		System.out.println("-------------------------------------");
		System.out.println("Welcome to Student Information System!");
		System.out.println("-------------------------------------");
		
		System.out.println("");
		System.out.println("What operation do you want to do?");
		System.out.println("Press i/I for input new student information");
		System.out.println("Press c/C for checking student information" );
	    char select=input.next().charAt(0);
		
		try {
			sv.action(select);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
