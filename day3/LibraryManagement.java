package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


			Library books=new Library();
			String title=books.addBook("TomSawyer");
			System.out.println(title);
			books.issueBook();
			
		}

	}