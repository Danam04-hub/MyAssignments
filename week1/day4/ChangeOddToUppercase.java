package week1.day4;

import java.util.Scanner;

public class ChangeOddToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter a string :");
				  String str = sc.nextLine();
				  str = str.toLowerCase();
				  char[] ch = str.toCharArray();
				  for(int i=1; i<ch.length-1; i=i+2){
				     ch[i] = Character.toUpperCase(ch[i]);
				  }
				  System.out.println(new String(ch));
			}

		}

	

	}

