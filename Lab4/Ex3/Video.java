package lab_Ex_3;

public class Video extends MediaItems{
	
	private String director;
	private String genre;
	private int year;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(int id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}
	public Video(int runtime) {
		super(runtime);
		// TODO Auto-generated constructor stub
	}
	public Video(String director, String genre, int year) {
		super();
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println("Director: "+getDirector()+" Genre: "+getGenre()+" Year "+getYear());
	}

}
