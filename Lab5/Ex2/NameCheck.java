package lab_excercise2;

public class NameCheck {
	
	public void doCheckName(String firstName, String lastName) throws NameException
	{
		if(!(firstName.equals("null")) && !(lastName.equals("null")) && !(firstName.equals("")) && !(lastName.equals(""))) {
			System.out.println("Valid");
		}
		else if(firstName.equals("null") || firstName == "") {
			throw new NameException("Enter your first name");
			
		}
		else if(lastName == "" || lastName.equals("null")) {
			throw new NameException("Enter your last name");
		}
		else {
			throw new NameException("Enter you first and last name");
		}
	}

}
