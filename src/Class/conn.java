/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import static java.lang.System.out;
import java.sql.*;
import java.util.logging.Level;
/**
 * Connection class
 */
 public class conn {
    
   static private Connection con = null; 
      
    final static private String url = "jdbc:sqlserver://localhost:1433;databaseName=coursera"; 
   final static private String username = "Admin";
    final static private String password = "1234"; 
     /**
      * static method 
      * @param q
      */
    static public void insert (String q)
    {
       
try {
    
     
  // Class.forName("com.mysql.jdbc.Driver"); 
    con = DriverManager.getConnection(url, username, password); 
     String log=q ;  
                   PreparedStatement ps=con.prepareStatement(log);
                   ps.execute() ;
    if (con != null) 
    {
        System.out .println("Successfully connected to MySQL database test"); } 
    con.close();
} 
catch (SQLException ex)
{ System.out .println("An error occurred while connecting MySQL databse");

    ex.printStackTrace(); 
} 
    
    
}
     /**
      * @throws SQLException thrown when an error in mysql happens
      */   
    static public String dis() throws SQLException 
    {
       
try {
    
   
  // Class.forName("com.mysql.jdbc.Driver"); 
    con = DriverManager.getConnection(url, username, password); 
     //String log="Select *From users";  
             //      PreparedStatement ps=con.prepareStatement(log);
              //     ps.execute() ;
    if (con != null) 
    { System.out .println("Successfully connected to MySQL database test"); } 
} 
catch (SQLException ex)
{ System.out .println("An error occurred while connecting MySQL databse"); ex.printStackTrace(); } 
    
    
     try {


// Get a result set containing all data from test_table

Statement statement = con.createStatement();

ResultSet results = statement.executeQuery("SELECT * FROM users");


// For each row of the result set ...

while (results.next()) {

  // Get the data from the current row using the column index - column data are in the VARCHAR format
    
  String data = results.getString(2);

  System.out.println("Fetching data by column index for row " + results.getRow() + " : " + data);
  return data ;

}


    } catch (SQLException e) {

  System.out.println("Could not retrieve data from the database " + e.getMessage());
    }
        con.close();
       return null;
    }     
    
     }
 