package week2.day3;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("subclass LoginTestData enterUsername");

	}
	public void enterPassword() {
		System.out.println("subclass LoginTestData enterPassword");

	}
	
	public static void main(String[] args) {
		LoginTestData objLoginTestData = new LoginTestData();
		objLoginTestData.enterUsername();
		objLoginTestData.enterPassword();
		objLoginTestData.enterCredentials();
		objLoginTestData.navigateToHomePage();
		
	

}
}
