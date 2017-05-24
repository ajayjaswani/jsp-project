import java.sql.*;  
class dbconnect
{
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8080/javadb","root","");  
//data = database 
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from first");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
