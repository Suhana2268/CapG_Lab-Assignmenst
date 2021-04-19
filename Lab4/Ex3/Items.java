package lab_Ex_3;

public abstract class Items {

	private int id;
	private String title;
	private int copies;
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(int id, String title, int copies) {
		super();
		this.id = id;
		this.title = title;
		this.copies = copies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", title=" + title + ", copies=" + copies + "]";
	}
	
	
	public void printDetails() {
		System.out.println("The details are: ");
	}
	
	public void addItem() {
		System.out.println("Item added");
	}
	

}
