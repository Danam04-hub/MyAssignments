package week2.day4;

import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		//- Declare an array for {3, 2, 11, 4, 6, 7} 		
		List<Integer> list1 = Arrays.asList(3,2,11,4,6,7);
		System.out.println(list1);
		        
		//- Declare another array for {1, 2, 8, 4, 9, 7} 
		List<Integer> list2 = Arrays.asList(1,2,8,4,9,7);
		System.out.println(list2);
		        
		//size of both the list1 & list2        
		int sizeOfList1 = list1.size();
		int sizeOfList2 = list2.size();
		        
		//- Compare both the arrays - Print the values if they are equal
		for(int i=0;i<sizeOfList1;i++)
	 {
		for(int j=0;j<sizeOfList2;j++)
		        	{
	    //- Print the values if they are equal
		if(list1.get(i)==list2.get(j))
          {
		System.out.println("Both list values List1: "+list1.get(i)+" and List2: "+list2.get(j)+"are equal");
		        		}
		        	}
		        }


	}

}
