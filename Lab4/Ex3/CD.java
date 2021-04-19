package lab_Ex_3;

public class CD extends MediaItems{
	
	private String artist;
	private String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(int id, String title, int copies) {
		super(id, title, copies);
		// TODO Auto-generated constructor stub
	}
	public CD(int runtime) {
		super(runtime);
		// TODO Auto-generated constructor stub
	}
	public CD(String artist, String genre) {
		super();
		this.artist = artist;
		this.genre = genre;
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.printDetails();
		System.out.println("The artist is: "+getArtist()+" Genre: "+getGenre());
		
	}
	

}
