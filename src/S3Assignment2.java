public class S3Assignment2 {

	public static void main(String[] args) {
		
		// Strings to compare
		String x = "String 1";
		String y = "String 2";
		
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
	
	// Constructor with 2 string parameters
	TwoStrings(String str1, String str2) {
		s1 = str1;
		s2 = str2;
	}

	// Method to compare the data
	public boolean compareStrings() {

		boolean same = false;

		// Use the equals() method to compare s1 with s2
		if (s1.equals(s2)) {
			same = true;
		} else {
			same = false;
		}

		return same;
	}
}
