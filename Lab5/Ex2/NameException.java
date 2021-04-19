package lab_excercise2;

public class NameException extends Exception{
	
	private String excMsg = "";
	public NameException() {
		super();
	}
	public NameException(String message) {
		super(message);
		this.excMsg = message;
	}
	
	@Override
	public String toString() {
		return "Name Exception :- "+excMsg;
	}

}
