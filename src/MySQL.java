import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// My SQL course practical + data base testing and sql course discount 
// select * from Employeeinfo where Name = 'Rohit' ;  --- it is basic syntax for selecting the particular field from table in SQL...


public class MySQL {

	public static void main(String[] args) throws SQLException {
	
		
	String host = "localhost";
	String port = "3306";
	String database = "qadb";
		
		
	// Here we created a connection with con as variable.....	
	Connection con = DriverManager.getConnection("jdbc:mysql://" +host+ ":"+port+"/qadb", "root", "Password@123");
	
	// jdbc:mysql://"+host+":"+port+"/database ;
	// Creating a path called statement and created a object called s......
	Statement s =  con.createStatement();
    
	// Taking the querey from MySQL.... & storing in Result set....
	ResultSet rs = s.executeQuery("select * from Employeeinfo where Name = 'Rohit'");
	
	while(rs.next())
	{	
	System.out.println(rs.getString("Name"));
	System.out.println(rs.getString("Location"));
	System.out.println(rs.getInt("Id"));
	System.out.println(rs.getInt("Age"));
	}
	}
}
