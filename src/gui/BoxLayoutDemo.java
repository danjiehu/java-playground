package gui;

import java.awt.*;
import javax.swing.BoxLayout;

// vertical layout
public class BoxLayoutDemo {
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("Box Layout demo. ");
		
		// 1. base on frame container, create box layout object, this container contains components vertically
		BoxLayout boxlayout = new BoxLayout(frame, BoxLayout.Y_AXIS);
		
		// 2. pass the box layout object set to frame
		frame.setLayout(boxlayout);
		
		// 3. add to frame two buttons (components) with margin
        Button button1 = new Button("button 1");
        // button1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add 10 pixels margin to each side
        frame.add(button1);
        
        Button button2 = new Button("button 2");
        // button2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add 10 pixels margin to each side
        frame.add(button2);
        
        //frame.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add 10 pixels margin to each side
		
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
