package week2.day3;

public class Browser {
	
	public void openUrl()
	{
		System.out.println ("Url Launched");
		
	}
	
	public void closeBrowser()
	{
		System.out.println ("Browser Closed");
		
	}
	public void navigateBack()
	{
		System.out.println ("Navigate back");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browserfuntion= new Browser();
		browserfuntion.openUrl();
		browserfuntion.closeBrowser();
		browserfuntion.navigateBack();

}
}
