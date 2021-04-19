package lab_Ex_3;

public class Journal extends WrittenItem{
	
	private int yearOfPublished;

	public int getYearOfPublished() {
		return yearOfPublished;
	}

	public void setYearOfPublished(int yearOfPublished) {
		this.yearOfPublished = yearOfPublished;
	}

	public Journal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Journal(int id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}

	public Journal(String author) {
		super(author);
		// TODO Auto-generated constructor stub
	}

	public Journal(int yearOfPublished) {
		super();
		this.yearOfPublished = yearOfPublished;
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println("The year of publishment is: "+getYearOfPublished());
	}

}
