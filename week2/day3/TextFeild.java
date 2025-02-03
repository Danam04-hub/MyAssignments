package week2.day3;

public class TextFeild extends WebElement {
	public void getText() {
		System.out.println("getText method is called");
	}

	public static void main(String[] args) {
		System.out.println("Subclass of webelemnt class");
		TextFeild teObj = new TextFeild();
		teObj.click();
		teObj.setText(null);
		teObj.getText();
		//cannot call the sibling class i.e is button class method
		System.out.println("This is simple inheritance");

	}

}
