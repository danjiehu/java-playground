package gui;

import java.awt.*;

/**
 * 
 * frame's default layout manager is border layout 
 * panel's default layout manager is flow layout
 * scroll pane default layout manager is border layout
 * 
 * optimized size is different for different operating system
 * if we use set bounds or set size, it doesn't apply to different operating system
 * that's why when a layout manager is used, set bounds/set size dosen't work anymore
 * 
 * for example, label is to display simple texts, its width and height is adjusted to its width and height when displayed on different operating systems
 *  it shouldn't be set manually for each operating system
 *  
 * when we choose the correct layout manager, we can achieve optimized size in different OS without setting sizes manually
 * 
 * LayoutManager <- GridLayout, FlowLayout
 * LayoutManager2 <- CardLayout, GridBagLayout, BorderLayout
 *  
 *  
 */
public class FlowLayoutDemo {
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("Flow layout demo. ");
		
		// 1. select layout manager
		// 20px 水平间距 20px 垂直间距
		// frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		// frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 40, 20));
		
		// 2. add many buttons to frame
		for(int i = 0; i < 100; i++){
			frame.add(new Button("button" + i));
		}
		
		// 3. do not use set size/bound for frame size, use pack() to set optimized size automatically
		// pack() is to set optimal size automatically with the layout manager selected
		frame.pack();
		
		frame.setVisible(true);
	}
	
}
