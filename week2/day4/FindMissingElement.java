package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		//Declare an array
			List<Integer> array = new ArrayList<Integer>();
			array.add(1);
			array.add(2);
			array.add(3);
			array.add(4);
			array.add(10);
			array.add(6);
			array.add(8);
				
			//Sorting the array
			Collections.sort(array);
			System.out.println("List of Array is:"+array);
			//Size of Array
			int arrayLength = array.size();
			System.out.println("Size of Array is"+arrayLength);
				
			//Missing element in array
			System.out.println("Missing elements in arrays are:");
			int j = 1;
			for (int i =0 ; i<=arrayLength-1;i++) {
			if(array.get(i).equals(j)) {
						j++;
					}
					else {
						System.out.println(j);
						i--;
						j++;
					}
				}

	}

}
