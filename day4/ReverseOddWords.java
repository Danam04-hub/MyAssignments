package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] str = test.split(" ");
		String afterReverseOdd = "";

		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			String reverse = "";
			if (i % 2 != 0) {
				for (int j = word.length() - 1; j >= 0; j--) {
					reverse = reverse + word.charAt(j);
				}
				afterReverseOdd = afterReverseOdd + reverse + " ";
			} else {

				afterReverseOdd = afterReverseOdd + word + " ";

			}

		}

		System.out.println(afterReverseOdd);
	}

}

