package list;

import java.util.*;

public class Tester {
	
	public static void main(String[] args) {
		
			
			List<Integer> numbers = new ArrayList<Integer>();
			
			numbers.add(22);
			numbers.add(43);
			numbers.add(31);
			
			ListIterator<Integer> itr = numbers.listIterator(); // has to create after no longer needing to modify list
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			for (int i=0; i<numbers.size(); i++) {
				System.out.println(numbers.get(i));
			}
			
			for (int num : numbers) {
				System.out.println(num);
			}
	} 	
}
