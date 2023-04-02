package gui;

import java.awt.*;

// scroll pane also cannot exist on their own, it must exist inside window
public class ScrollPaneDemo {
	
	public static void main(String[] args) {
		
		// create window (frame)
		Frame frame = new Frame("scroll pane demo. ");
		
		// 1. create a scroll panel
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS); // always show scroll bars
		
		// 2. create a button and add the button the scroll pane
		sp.add(new TextField("test text field")); // we cannot see this, why?!  
		// frame's default layout manager is border layout 
		// panel's default layout manager is flow layout
		// scroll pane default layout manager is border layout
		// can't see because out layout manager - to be continued
		
		sp.add(new Button("test button"));
		
		// 3. add scroll pane to window frame
		frame.add(sp);
		
		// set frame bounds
		frame.setBounds(100,100,500,300);
		// set visible
		frame.setVisible(true);	
		
	}

}
