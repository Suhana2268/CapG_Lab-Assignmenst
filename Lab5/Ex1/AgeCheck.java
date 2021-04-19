package lab_excercise;

public class AgeCheck {
	
	public void doCheckAge(int age) throws AgeException {
		if(age > 15) {
			System.out.println("Valid age!!!");
		}
		else {
			throw new AgeException("You are not eligible because your age is less than 15! Sorry");
		}
	}

}
