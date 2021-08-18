import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicTesting {
	public static void main(String[] args) {
		
		
		//FRAME CREATION
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setName("Addition");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//MAIN PANEL CREATION
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setSize(new Dimension(600, 400));                                     //SETSIZE PANEL
		
		//SECOND PANEL CREATION WITH TWO TEXTFIELDS, 1 LABEL AND BUTTON
		JTextField tf = new JTextField(5);
		JTextField tf2 = new JTextField(5);
		JLabel label = new JLabel("Inserisci due numeri: ");
		JPanel panel2 = new JPanel();
		JButton button = new JButton("Esegui");
		
		
		JLabel labelt = new JLabel("Product calculator");
		JPanel titlepanel = new JPanel();
		titlepanel.add(labelt);
		JCheckBox cxk = new JCheckBox("Want to do multiplication instead?");
		titlepanel.add(cxk);
		
		
		//BUTTON ACTIONLISTENER ON CHECKBOX
		class buttonAction implements ActionListener{                                    //LISTENER IMPLEMENTATION
			public void actionPerformed(ActionEvent event) {
				int a = Integer.parseInt(tf.getText());
				int b = Integer.parseInt(tf2.getText());
				int c;
				
				if(cxk.isSelected()) {
					c = a * b;
				}
				else {
					c = a + b;
				}
				
				JLabel sum = new JLabel("Result = " + Integer.toString(c));
				JPanel panel3 = new JPanel();
				panel3.add(sum);
				panel.add(panel3, BorderLayout.SOUTH);
				frame.add(panel);
				frame.setVisible(true);
				
			}
		}
		
		//ADDING EVENT TO THE BUTTON
		button.addActionListener(new buttonAction());
		
		
		//ADDING ELEMENTS TO PANELS W/BORDERLAYOUT
		panel2.add(label);
		panel2.add(tf);
		panel2.add(tf2);
		panel2.add(button);
		panel.add(panel2, BorderLayout.CENTER);
		panel.add(titlepanel, BorderLayout.NORTH);
		
		//ADDING MAIN PANEL AND FRAME VISUALIZATION (Needs to be done at every change)
		frame.add(panel);
		frame.setVisible(true);
		
	}
}
