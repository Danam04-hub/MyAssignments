package week2.day3;

public class Safari extends Browser  {

	public void readermode()
	{
		System.out.println ("Readers Mode is ON");
		
	}
	
	public void fullscreenmode()
	{
		System.out.println ("Fullscreenmode");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari safarioptions= new Safari();
		safarioptions.readermode();
		safarioptions.fullscreenmode();
		safarioptions.openUrl();
		safarioptions.closeBrowser();
		

}

}
