package QThree1920;

import java.util.List;

interface FileHandler<E> {
	
	public void writeToFile(List<E> list);
	public void readFromFile();
	
}
