

import java.awt.*;

class CheckBoxGroupExample{
	
	
	public CheckBoxGroupExample(){
		
		Frame frame = new Frame("Check Box Group Example");
		
		CheckboxGroup checkBoxGroup = new CheckboxGroup();
		
		Checkbox checkbox = new Checkbox("C++", checkBoxGroup, false);
		
		checkbox.setBounds(100, 100, 50, 50);
		
		Checkbox checkbox2 = new Checkbox("Java", checkBoxGroup, true);
		
		checkbox2.setBounds(100, 150, 50, 50);
		
		frame.add(checkbox);
		
		frame.add(checkbox2);
		
		frame.setSize(400, 400);
		
		frame.setLayout(null);
		
		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		
		new CheckBoxGroupExample();
	}
}