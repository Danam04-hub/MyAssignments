package week2.day3;

public class CheckBoxButton extends Button {//checkboxbutton class is subclass of button class {

	public void clickCheckButton() {
		System.out.println("Method of subclass checkboxbutton");
	}

	public static void main(String[] args) {
		System.out.println("This is the subclass of parent class Button");
		CheckBoxButton checkObj = new CheckBoxButton();
		checkObj.click();//method of of grand parent WEbelemnt
		checkObj.clickCheckButton();//method of same class
		checkObj.setText(null);//method of of grand parent WEbelemnt
		checkObj.submit();//method of parent class
		System.out.println("This is multilevel inheritance");

	}
}
