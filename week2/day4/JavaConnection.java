package week2.day4;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {
	
 @Override
 public void connect() {
	 System.out.println ("Connnect to Database"); 
	 
 }
 
 @Override
 public void disconnect() {
	 System.out.println ("Disconnnect from Database"); 
	 
 }

 @Override
 public void executeUpdate() {
	 System.out.println ("Database Updated"); 
	 
 }

 @Override
 public void executeQuery2() {
	 System.out.println ("Query excute from concreate class"); 
	 
 }

	public static void main(String[] args) {
	JavaConnection java =  new JavaConnection();
	java.connect();
	java.disconnect();
	java.executeUpdate();
	java.executeQuery1();
	java.executeQuery2();
	 
		


}
	
	}
	
