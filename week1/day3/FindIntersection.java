package week1.day3;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]={3,2,11,4,6,7,8,13};
		int b[]={1,2,8,4,9,7,12,15,};
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
		
		
		
	
	


