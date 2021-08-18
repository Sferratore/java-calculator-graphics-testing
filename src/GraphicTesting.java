import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicTesting {
	public static void main(String[] args) {
		
		
		//CREAZIONE DEL FRAME
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setName("Addizioni");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//CREAZIONE PANNELLO PRINCIPALE
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setSize(new Dimension(600, 400));                                     //SETSIZE PANEL
		
		//CREAZIONE PRIMO PANNELLO SECONDARIO CON DUE AREE DI TESTO, LABEL E PULSANTE
		JTextField tf = new JTextField(5);
		JTextField tf2 = new JTextField(5);
		JLabel label = new JLabel("Inserisci due numeri: ");
		JPanel panel2 = new JPanel();
		JButton button = new JButton("Esegui");
		
		//CREAZIONE PANNELLO SECONDARIO DI TITOLO CON LABEL E CHECKBOX
		JLabel labelt = new JLabel("Product calculator");
		JPanel titlepanel = new JPanel();
		titlepanel.add(labelt);
		JCheckBox cxk = new JCheckBox("Hi! This is a testing checkbox :)");
		titlepanel.add(cxk);
		
		
		//IMPLEMENTAZIONE ACTIONLISTENER DI BUTTON CON CONTROLLO SU CHECKBOX
		class buttonAction implements ActionListener{                                    //IMPLEMENTAZIONE LISTENER
			public void actionPerformed(ActionEvent event) {
				int a = Integer.parseInt(tf.getText());
				int b = Integer.parseInt(tf2.getText());
				int c;
				
				if(cxk.isContentAreaFilled()) {
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
		
		//AGGIUNTA EVENTO A PULSANTE
		button.addActionListener(new buttonAction());
		
		
		//AGGIUNTA ELEMENTI AL PRIMO PANNELLO SECONDARIO E AL PANNELLO PRIMARIO CON BORDERLAYOUT
		panel2.add(label);
		panel2.add(tf);
		panel2.add(tf2);
		panel2.add(button);
		panel.add(panel2, BorderLayout.CENTER);
		panel.add(titlepanel, BorderLayout.NORTH);
		
		//AGGIUNTA PANNELLO PRIMARIO E VISUALIZZAZIONE FRAME (Va fatta ad ogni cambiamento)
		frame.add(panel);
		frame.setVisible(true);
		
	}
}
