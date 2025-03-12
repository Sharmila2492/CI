package jdbcConnectionProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectorTask {

	public static void main(String[] args) {
		
		//Provide connection details
		String jdbc_url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="root";
		
		//Establish the connection
		
		try {
			Connection connection=DriverManager.getConnection(jdbc_url, username, password);
			
			//Create the Statement
			String createDB="create database employees";
			String useDB="use employees";
			//create table
			String createTable="create table empl_table(empcode int, empname varchar(20), empage int, esalary int)";
			//insert  the values into the table
			String insertValue="insert into empl_table values (101,'Jenny',25,10000)";
			String insertValue1="insert into empl_table values (102,'Jacky',30,20000)";
			String insertValue2="insert into empl_table values (103,'Joe',20,40000)";
			String insertValue3="insert into empl_table values (104,'John',40,80000)";
			String insertValue4="insert into empl_table values (105,'Shameer',25,90000)";
			
			String select="select * from empl_table";
			
			Statement stmt=connection.createStatement();
			
			//Execute the statement
			
			stmt.execute(createDB);
			stmt.execute(useDB);
			stmt.execute(createTable);
			stmt.executeUpdate(insertValue);
			stmt.executeUpdate(insertValue1);
			stmt.executeUpdate(insertValue2);
			stmt.executeUpdate(insertValue3);
			stmt.executeUpdate(insertValue4);
			
			ResultSet res=stmt.executeQuery(select);
			
			while(res.next()) {
				
				System.out.println(res.getInt("empcode")+"  "+res.getString("empname")+"  "+res.getInt("empage")+"  "+res.getInt("esalary"));
			}
			
			//close connection
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

/*Output:
	
	101  Jenny  25  10000
	102  Jacky  30  20000
	103  Joe  20  40000
	104  John  40  80000
	105  Shameer  25  90000

*/