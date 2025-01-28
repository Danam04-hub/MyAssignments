package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=-1,b=1;
		
		for(int i=1;i<=8;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
	    }

	}	
	
}


