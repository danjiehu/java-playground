package examples;

public class parsingString {
	
	public static void main(String[] args) {
		
		// changing one string to a string array
		String s = "30,30,30";
		String[] sArr = s.split(",");
		int[] intArr = new int[3];
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i] + " ");
			intArr[i] = Integer.parseInt(sArr[i]);
		}
		
		
	} // end of main
} // end of parsingString class 
