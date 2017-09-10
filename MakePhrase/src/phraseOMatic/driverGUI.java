package phraseOMatic;

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//this is a comment to practice with git

public class driverGUI extends JFrame {
		/**
			 * 
			 */
			//it wanted this
			private static final long serialVersionUID = 1L;
			
			private int Height = 200; 
			private int Width = 350; 
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
				
				//add a layout to make it look nicer
				LayoutManager myLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
				panel.setLayout(myLayout);
				
				
				
				//create and attach the text field and label
				JLabel directions = new JLabel("Press the button to generate a phrase");
				directions.setFont(new Font("Serif", Font.BOLD, 20));
				directions.setAlignmentX(CENTER_ALIGNMENT);
				panel.add(directions);
				
				//create and attached button
				JButton makePhraseButton = new JButton("Push Me!");
				ActionListener newPhrase = new generateNewPhrase();
				makePhraseButton.addActionListener(newPhrase);
				makePhraseButton.setFont(new Font("Serif", Font.BOLD, 25));
				makePhraseButton.setAlignmentX(CENTER_ALIGNMENT);
				panel.add(makePhraseButton);
				
				//add the output label
				outputField = new JLabel(); 
				outputField.setFont(new Font("Serif", Font.ITALIC, 20));
				outputField.setAlignmentX(CENTER_ALIGNMENT);
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

