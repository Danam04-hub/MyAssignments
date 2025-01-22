package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;      
		int n=121;
		  temp=n;
		  for(;n>0;n=n/10)
		  {
			   r=n%10;    
			   sum=(sum*10)+r;
			  
		  }   
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		

	}


