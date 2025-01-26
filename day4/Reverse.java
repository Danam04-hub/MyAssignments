package week1.day4;


public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String companyName="TestLeaf";
		char[] name=companyName.toCharArray();
		for(int i=name.length-1;i>=0;i--) {
		System.out.println(name[i]);
		}
			
	}
}
