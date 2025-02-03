package week2.day3;

public class Button extends WebElement {
	public void submit() {
		System.out.println("Submit method is called from button subclass");
	}

	public static void main(String[] args) {
		System.out.println("sub class of WebElement base class");
		Button buttonObj = new Button();//creating obj for child class
		buttonObj.click();//calling the method of parent class
		buttonObj.setText("Method from parent class");
		buttonObj.submit();
		

	}

}
