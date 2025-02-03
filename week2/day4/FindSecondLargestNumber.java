package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an Array
		List<Integer> intArray = new ArrayList<Integer>();
			intArray.add(3);
			intArray.add(2);
			intArray.add(11);
			intArray.add(4);
			intArray.add(6);
			intArray.add(7);
				
		//Length of Array
		int arrayLength = intArray.size();
		System.out.println("Size of Array:"+arrayLength);
				
		//Sorting the Array
		Collections.sort(intArray);
				
		//Finding second largest element from last
		int array1 = intArray.get(arrayLength-2);
		System.out.println("Second largest number is:"+array1);
	}

}
