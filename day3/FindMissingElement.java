package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,3,2,8,6,7};
		int c=1;
		Arrays.sort(a);
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(c!=a[i])
			{
				System.out.println("Missing element is:"+c);
				i--;
			}
			c++;
			
		}
	}

}
		
	
	
		
		
	
