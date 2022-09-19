//This is a comment by Asmatullah Created on 19-09-2022

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField textField = new JTextField();
		JLabel label = new JLabel();
		JButton button = new JButton();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		
		frame.setVisible(true);
		frame.setBounds(50, 40, 800, 500);
		frame.setTitle("This is a frame tile");
		
		// TODO Auto-generated method stub
		
		
		label.setText("Enter Value:");
		textField.setColumns(20);
		button.setText("Click");
		label2.setText("F");
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		panel.add(label2);
		frame.add(panel);

		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				String temperature = textField.getText();
				Float celsius = Float.parseFloat(temperature);
				Float fahrenhiet = (float)(celsius*1.8)+32;
				String temp = fahrenhiet+"F";
				label2.setText(temp);
				}
				catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(frame, "Please enter temperature");
				}
				
			}
		});
		
		
		
	}

}
