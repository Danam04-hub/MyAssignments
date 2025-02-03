package week2.day3;

public class RadioButton extends Button{//button is the child class of webelement and parent for radiobutton
	public void selectRadioButton() {
		System.out.println("Radio button is selected");
	}

	public static void main(String[] args) {
		RadioButton rbObj = new RadioButton();
		rbObj.selectRadioButton();
		rbObj.setText("Method from WebElement class");
		rbObj.submit();
		System.out.println("This is the example of multilevel inheritance");

}
}
