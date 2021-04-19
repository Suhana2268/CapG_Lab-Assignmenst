package lab_Ex_3;

public class Book extends WrittenItem{

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}

	public Book(String author) {
		super(author);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println();
	}

}
