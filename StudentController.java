import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.*; 
public class StudentController {
	 private StudentModel sm;
     private StudentView sv;
     
     //constructor with model and view arguments
     public StudentController(StudentModel sm, StudentView sv){
         this.sm = sm;
         this.sv = sv;
      }
     
     // method to retrieve specific student from database
     public void getStudent(int id) throws SQLException{
    	 // create new Student object to hold data
    	 StudentModel sm = new StudentModel();
    	 //Establish connection
    	 String URL = "jdbc:mysql://127.0.0.1:3306/db1?serverTimezone = UTC" ;
	     String Username = "root";
	     String password = "207345";
		Connection conn = DriverManager.getConnection(URL, Username, password);
			// SQL statement to retrieve data for specific student with id
 			String sql = "SELECT * FROM STUDENT where ID ='" + id +"'";
 			//execute the SQL statement
 			Statement stmt = conn.createStatement();
 			ResultSet rs = stmt.executeQuery(sql);
 			if (rs.next()) {
 				sm.setID(rs.getInt("Id"));
 				sm.setName(rs.getString("Name"));
 				sm.setDepartment(rs.getString("Department"));
 				sm.setMathMark(rs.getInt("MathMark"));
 				sm.setScienceMark(rs.getInt("ScienceMark"));
 				
 		    } 
 		 // pass the data to view object and display
    	 sv.showInfo(sm.getID(), sm.getName(), sm.getDepartment(), sm.getMathMark(), sm.getScienceMark());
     }
     
     // method for user to insert new data into database
     public void keyIn(int ID, String name, String department, int MathMark, int ScienceMark) throws SQLException {
 		
    	 StudentModel stu = new StudentModel();
    	 String URL = "jdbc:mysql://127.0.0.1:3306/db1?serverTimezone = UTC" ;
	     String Username = "root";
	     String password = "207345";
		Connection conn = DriverManager.getConnection(URL, Username, password);
  
 			Statement stmt = conn.createStatement();
 			
 		// insert the data into database
 		stmt.executeUpdate("INSERT INTO STUDENT VALUES (" + ID + ", '"+ name + "', '" +
 		department + "', " + MathMark + ", " + ScienceMark + ")");
 		
 		System.out.println("Input Sucessfuly!");
 	}
     
}