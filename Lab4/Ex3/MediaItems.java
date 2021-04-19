package lab_Ex_3;

public abstract class MediaItems extends Items{
	
	private int runtime;

	public MediaItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MediaItems(int id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}

	public MediaItems(int runtime) {
		super();
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		
		System.out.println("The runtime is: "+getRuntime());
	}
	
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		super.addItem();
		System.out.println("Media Item added");
	}
	
}
