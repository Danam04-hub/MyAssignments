package week2.day3;

public class APIClient {



		
  //Create a Java class named APIClient and 
  //create two methods with the same name passing different input arguments.

	public void sendRequest(String endpoint) {
	System.out.println("endpoint : "+ endpoint);

	}	
	//- Another version of the sendRequest method should accept three input arguments:
	public void sendRequest(String endpoint, String requestBody,  boolean requestStatus) {
	System.out.println("endpoint: "+ endpoint + " requestBody :"+ requestBody +" requestStatus : " + requestStatus);

	}
	public static void main(String[] args) {
	APIClient objAPIClient = new APIClient();
	objAPIClient.sendRequest("Data_endpoint1");
	objAPIClient.sendRequest("Data_endpoint2", "Test_requestBody", false);

	}

}
