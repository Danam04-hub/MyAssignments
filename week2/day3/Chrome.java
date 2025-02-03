package week2.day3;

public class Chrome extends Browser {
	
	public void openInCognito()
	{
		System.out.println ("InCognito tab opened");
		
	}
	
	public void clearcache()
	{
		System.out.println ("Cache Cleared");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome chrome= new Chrome();
		chrome.openInCognito();
		chrome.clearcache();
		chrome.openUrl();
		chrome.closeBrowser();
		

}

}
