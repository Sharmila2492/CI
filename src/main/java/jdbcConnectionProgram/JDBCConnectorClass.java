package jdbcConnectionProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: provide connection details
		
		String db_url="jdbc:mysql://localhost:3306";// we get this code from Sql administrator and click service status
        String username="root";
        String password="root";
        
        //Step 2: Establish the connection
        
        try {
			Connection connection=DriverManager.getConnection(db_url, username, password);
		
        //Step 3: Perform operation
			
			// Create the statements
			
			String createDB="create database JDBC_Demo";
			String useDB="use JDBC_Demo";
			String createTable="create table demo_table(rno int , name varchar(20))";// create table
			String insertValue="insert into demo_table values (101,'ABC')"; //provide value
			String select="select * from demo_table";
			
			Statement smt=connection.createStatement();
			
			//Step 4: Execute the statements
			
			smt.execute(createDB);
			smt.execute(useDB);
			smt.execute(createTable);
			smt.executeUpdate(insertValue);// for insertion, deletion and updation we use the "executeUpdate"
			
			ResultSet result=smt.executeQuery(select);// it gives or retrieve the result for that we use the execute querry
			
			while(result.next()) {
				System.out.println(result.getInt("rno")+"--->"+result.getString("name"));
			}
			
			 //Step 5: close the connection
			connection.close();
        
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}

}
