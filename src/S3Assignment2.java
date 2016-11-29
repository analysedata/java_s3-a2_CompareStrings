public class S3Assignment2 {

	public static void main(String[] args) {
		
		// Strings to compare
		
		// Instantiate a new object of type TwoStrings
		TwoStrings twoStringsObject = new TwoStrings(x, y);
		
		// Call the compareStrings method and print the result to screen
		boolean same = twoStringsObject.compareStrings();
		System.out.println(same);
	}

}

class TwoStrings {
	
	// Data
	String s1;
	String s2;
	
	TwoStrings(String str1, String str2) {
		s1 = str1;
		s2 = str2;
	}

	// Method to compare the data
	public boolean compareStrings() {

		boolean same = false;

}
