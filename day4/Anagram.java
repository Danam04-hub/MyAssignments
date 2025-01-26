package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String letter1 = "stops";
		    String letter2 = "potss";
		    
		    if(letter1.length() == letter2.length()) {

		      char[] charArray1 = letter1.toCharArray();
		      char[] charArray2 = letter2.toCharArray();

		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(letter1 + " and " + letter2 + " are anagram.");
		      }
		      else {
		        System.out.println(letter1 + " and " + letter2 + " are not anagram.");
		      }
		    }
		    else {
		      System.out.println(letter1 + " and " + letter2 + " are not anagram.");
		    }
		  }
		

	}

