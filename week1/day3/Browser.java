package week1.day3;

public class Browser {
	
	public String launchBrowser() {
		return "Chrome";
		
	}
	
	private void loadUrl() {
		System.out.println("Browser Launched Successfully");
		
	}
	
	public static void main(String[] args) {
		Browser browser1 = new Browser ();
		System.out.println(browser1.launchBrowser());
		browser1.loadUrl();
	}
    
}
