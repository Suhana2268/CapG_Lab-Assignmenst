package lab_Ex_3;

public abstract class WrittenItem extends Items{
	
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public WrittenItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(int id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(String author) {
		super();
		this.author = author;
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println("Name: "+getTitle()+" Id: "+getId()+" Copies: "+getCopies()+ " Author: "+getAuthor());
	}
	
	
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		super.addItem();
		System.out.println("Written item added");
	}

}
