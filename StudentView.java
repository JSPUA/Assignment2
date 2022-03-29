import java.sql.SQLException;
import java.util.Scanner;
public class StudentView {
    	 
	Scanner input=new Scanner(System.in);
	
	
	
	
 public void action(char select) throws SQLException {
	 StudentModel s = new StudentModel();
	 StudentController sc=new StudentController(s,this);
	 if (select=='I'||select=='i') {
		 System.out.print("ID: " );
		 int ID=input.nextInt();
		 
		 System.out.print("Name: ");
		 String name=input.next();
		 
		 System.out.print("Department: ");
		 String department=input.next();
		 
		 System.out.print("Math Marks: ");
		 int MathMark=input.nextInt();
		 
		 System.out.print("Science Marks: ");
		 int ScienceMark=input.nextInt();
		 
		 sc.keyIn(ID,name,department,MathMark,ScienceMark);
	 }
	 else if (select=='c'||select=='C') {
		 System.out.print("ID: " );
		 int ID=input.nextInt();
		 sc.getStudent(ID);
	 }	 
	 }
	 public void showInfo(int studentId, String name, String department, int MathMark, int ScienceMark){
	        System.out.println("\nStudent Information");
	        System.out.println("ID: " + studentId);
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Math: " + MathMark);
	        System.out.println("Science: " + ScienceMark);
	     }
 }
 
	

