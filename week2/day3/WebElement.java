package week2.day3;

public class WebElement {
	public void click() {
		System.out.println("Click the button method is called");
	}
	public void setText(String text) {
		System.out.println("set the text  as : " +text);
	}
	public static void main(String[] args) {
		WebElement weObj = new WebElement();
		System.out.println("This is the parent class");
		weObj.click();
		weObj.setText("TestingWeb");
	}

}
