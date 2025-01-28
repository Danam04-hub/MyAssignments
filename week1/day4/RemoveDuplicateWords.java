package week1.day4;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = “We learn Java basics as part of java sessions in java week1”;
		//Expected output: “We learn Java basics as part of    sessions in    week1” 
		
		
		String text = "We learn Java basics as part of sessions in week1";
		String[] words = text.split(" ");
		int count=0;
		for(int i=0;i<=words.length-1;i++) {
		
			for(int j=i+1;j<=words.length-1;j++) {
		
				if(words[i].equalsIgnoreCase(words[j])) {
				count++;
				words[j]=" ";
				}
			}
		}
		if(count>=1) {
			for(int i=0;i<=words.length-1;i++) {
				System.out.print(words[i]+" ");
			}
			
	            }else {
	            	for(int i=0;i<=words.length-1;i++) {
	    				System.out.print(words[i]+" ");
	    			}
	            }
	}
}
	

