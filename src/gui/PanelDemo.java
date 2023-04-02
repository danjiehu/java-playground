package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

// container panel
// before creating panel object, need to create window! 
// panel and other containers cannot exist on their own without window
public class PanelDemo {
	
	public static void main(String[] args) {
		
		// 1. create a window object
		Frame frame = new Frame("Panel container demo. ");
		
		// 2. create a panel object
		Panel p = new Panel();
		
		// 3. create text input and a button and put them in panel
		p.add(new TextField("this is a text filed. "));
		p.add(new Button("this is a button. "));
		// p is a container
		// text field and button are components
		
		// 4. put panel in window
		frame.add(p);
		
		// 5. set window location and size
		// set bounds is to set location and size at the same time
		// x,y,width, height
		frame.setBounds(100,100,500,300);
		
		// 6. make window visible
		frame.setVisible(true);
		
	} // end of main

}
