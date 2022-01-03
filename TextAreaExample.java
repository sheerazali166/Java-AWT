
import java.awt.*;

class TextAreaExample{
	
	public TextAreaExample(){
		
		Frame frame = new Frame("Kinza Text Area");
		
		TextArea textArea = new TextArea("Welcome to kinza text area");
		
		textArea.setBounds(10, 30, 300, 300);
		
		frame.add(textArea);
		
		frame.setSize(400, 400);
		
		frame.setLayout(null);
		
		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		
		new TextAreaExample();
	}
}