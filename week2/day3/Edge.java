package week2.day3;

public class Edge extends Browser  {

	public void takesnaps()
	{
		System.out.println ("Takesnaps");
		
	}
	
	public void clearcookies()
	{
		System.out.println ("Coolies Deleted");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge edgefuntion= new Edge();
		edgefuntion.takesnaps();
		edgefuntion.clearcookies();
		edgefuntion.openUrl();
		edgefuntion.closeBrowser();
		

}
}
