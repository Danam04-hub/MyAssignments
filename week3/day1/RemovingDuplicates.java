package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicates {

	private static Character[] charecters;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "google";
		char[] characters = s.toCharArray();
		
		Set<Character>s1=new LinkedHashSet<Character>();
		for(int i=0;i<characters.length;i++)
			
		{
			s1.add(characters[i]);
			
		}
			
			System.out.println("the original charectersare"+s1);
			
			
		
		
		
		
		

	}

}
