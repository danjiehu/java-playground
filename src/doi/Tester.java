package doi;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(validateDoi("https://doi.org/10.1007/3-540-47910-4_21"));
		System.out.println(validateDoi(" "));
		
	} // end of main
	
	@SuppressWarnings("unused")
	public static boolean validateDoi(String str){
		// 1. check if string prefixed with "https://doi.org/"
		if (!str.startsWith("https://doi.org/"))
			return false;
		
		// 2. Remove the prefix to get the actual DOI string, and split the string into two parts
		String doi = str.substring("https://doi.org/".length());
		String[] parts = doi.split("/");
		System.out.println(doi);
		String partOne = parts[0];
		String partTwo = parts[1];
		System.out.println("partOne " + partOne);
		System.out.println("partTwo " + partTwo);
		
		// 3. validate if the first part consists of two numbers separated by a "." 
		String[] partOneArr = partOne.split("\\.");
		if (partOneArr.length != 2) 
			return false;
		// validate if one number is two digits and one number is four digits long
		if (partOneArr[0].length() != 2)
			return false;
		if (partOneArr[1].length() != 4)
			return false;
		// validate if they are both numbers 
		try {
			int firstNum = Integer.parseInt(partOneArr[0]);
	        int secondNum = Integer.parseInt(partOneArr[1]);
		} catch  (NumberFormatException e) {
	        return false;
	    }
		
		// 4. validate that partTwo is non-empty
		if (partTwo.isEmpty()) {
			return false;
		}
		
		// if all checks passed, return true
		return true;
	}
} // end of class

