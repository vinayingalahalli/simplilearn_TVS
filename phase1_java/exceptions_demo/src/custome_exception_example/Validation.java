package custome_exception_example;

public class Validation {

	
	public boolean isValidAge(int age) throws InvalidAgeException {
		if(age<=0) {
			throw new InvalidAgeException("Entered age "+age+" cannot be zero or -ve");
		}
		
		if(age<20 || age >35) {
			throw new InvalidAgeException("Only customers age between 20 and 35 are allowed");
		}
		return true;
	}
	
	public boolean isValidPan(String pan) throws BusinessException,NullPointerException {
		
		if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			throw new BusinessException("Entered pan "+pan+" is INVALID");
		}
		return true;
	}
}
