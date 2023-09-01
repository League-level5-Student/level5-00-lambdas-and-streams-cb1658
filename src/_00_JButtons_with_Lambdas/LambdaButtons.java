package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener{
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		
		
		window.setVisible(true);
		window.pack();
		
		addNumbers.addActionListener((e)->{
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));

			JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
		});
		
		randNumber.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, new Random().nextInt(1000000));
		});
		
		tellAJoke.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "knock knock");
		});
	}
	
	
	
	
	
	public static void main(String[] args) {
		new LambdaButtons();
	}





	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
