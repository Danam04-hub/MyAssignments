package week1.day3;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			int[]num= {2,5,7,7,5,9,2,3};
			for (int i= 0; i < num.length; i++) { 
				for (int j =i+1; j < num.length; j++) {
					if(num[i]==num[j]) {
						System.out.println("Duplicate Value:" +num[j]);
						
					}
				}
				
			}

		}

	}


