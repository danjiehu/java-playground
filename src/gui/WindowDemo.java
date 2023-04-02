package gui;

import java.awt.*;


// 1. container: Window
public class WindowDemo {
	
	public static void main(String[] args) {
		
		// 1. create a window object with title 
		Frame frame = new Frame("window title");
		// 2. set window location
		frame.setLocation(100,100);
		// set window size width + height
		frame.setSize(500,300); // doesn't work
		// 3. make window visible
		frame.setVisible(true);
	}

}
