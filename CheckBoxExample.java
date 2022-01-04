
import java.awt.*;

class CheckBoxExample{
	
	
	public CheckBoxExample(){
		
		
		Frame frame = new Frame("Kinza CheckBoxs Frame");
		
		Checkbox checkbox1 = new Checkbox("C++");
		
		checkbox1.setBounds(100, 100, 50, 50);
		
		Checkbox checkbox2 = new Checkbox("Java", true);
		
		checkbox2.setBounds(100, 150, 50, 50);
		
		frame.add(checkbox1);
		
		frame.add(checkbox2);
		
		frame.setSize(400, 400);
		
		frame.setLayout(null);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String args[]){
		
		new CheckBoxExample();
	}
}