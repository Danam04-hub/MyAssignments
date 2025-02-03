package week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		//Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		List<String> companiesList=Arrays.asList("HCL", "Wipro", "Aspire Systems", "CTS");
				
		//Sorting the above list
		Collections.sort(companiesList);
		int companieslistSize = companiesList.size();
		for(int i=companieslistSize-1;i>=0;i--)
		{
			String reversedcompaniesList = companiesList.get(i); 
			System.out.println(reversedcompaniesList);
				}
				
				
		//Print the list required output as Wipro, HCL, CTS, Aspire Systems

	}

}
