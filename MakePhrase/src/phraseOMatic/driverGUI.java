package phraseOMatic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class driverGUI extends JFrame {
		/**
			 * 
			 */
			//it wanted this
			private static final long serialVersionUID = 1L;
			
			private int Height = 150; 
			private int Width = 400; 
			private JLabel outputField;
		
			
			public driverGUI(){
						
			addPieces(); 
			
			
		}
			
		void addPieces(){
			
				//set the frame sizes and actions
				setSize(Width, Height);
				setTitle("Phrase-O-Matic");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//create the panel
				JPanel panel = new JPanel();
				
				//create and attach the text field and label
				JLabel directions = new JLabel("Press the button to generate a phrase");
				panel.add(directions);
				
				//create and attached button
				JButton makePhraseButton = new JButton("Push Me!");
				ActionListener newPhrase = new generateNewPhrase();
				makePhraseButton.addActionListener(newPhrase);
				panel.add(makePhraseButton);
				
				//add the output label
				outputField = new JLabel(); 
				panel.add(outputField);
				
				
				
				
						
							
				//attach the panel
				add(panel); 
				
		}
			
		public class generateNewPhrase  implements ActionListener{
				
			public void actionPerformed(ActionEvent arg0) {
				
			
			outputField.setText(PhraseOMatic.makePhrase());
			}

		}
		
		
		
	}

