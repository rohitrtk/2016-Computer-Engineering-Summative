package com.rtk.Main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.rtk.QnA.Answers;
import com.rtk.QnA.Questions;

//This class is the the meat of the program, handling all of the GUI and QnA
public class Quiz extends JComponent implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private final int WIDTH = 500;										// Will be the width of the window
	private final int HEIGHT = 175;										// Will be the height of the window
	private final Dimension d = new Dimension(WIDTH, HEIGHT);			// Dimension object for window
	
	private boolean begin = false;										// Handles the current state of the program
	private int currentQuestion = -1;									// The quiz's current question
	private int numQuestions;											// Number of total questions
	private int numCorrQuestions = 0;									// The number of questions the user has answered correctly
	
	private JLabel label;												// Label that will display questions
	private JLabel score;												// Label that holds users current score
	private JButton instructions;										// Button that user can press to view instructions
	private JButton button;												// Button that user pressed to check their answers
	private JTextField field;											// Text field user uses to type there answers in
	
	private String answer;												// Holding variable to hold users answer
	
	public Quiz() {
		setPreferredSize(d);											// Sets the size of the window
		setLayout(new FlowLayout(FlowLayout.CENTER, 200, 10));			// Sets the layout of the window
		
		// Calling constructors from other classes
		new Questions();
		new Answers();
		
		init();															// Runs the init method
		runGUI();														// Runs my runGUI method
	}
	
	private void init() {												// Inits my objects & variables
		label = new JLabel("Press button to begin!");
		
		button = new JButton("Begin!");
		button.addActionListener(this);
		
		instructions = new JButton("Instructions!");
		instructions.addActionListener(this);
		
		field = new JTextField("");
		field.setPreferredSize(new Dimension(200, 20));
		field.setEnabled(false);
		field.addActionListener(this);
		
		numQuestions = Questions.questions.length;						// Sets the number of questions to the length of the array in the questions class
		
		score = new JLabel("SCORE: " + numCorrQuestions + "/" + numQuestions);
	}
		
	private void runGUI() {												// Places my GUI
		add(label);
		add(field);
		add(button);
		add(instructions);
		add(score);
	}
	
	private void reset() {												// When the quiz is over, resets variables
		label.setText("Press button to begin!");
		begin = false;
		button.setText("Begin!");
		field.setEnabled(false);
		currentQuestion = -1;
		numCorrQuestions = 0;
	}
	
	public void actionPerformed(ActionEvent e) {						// When an action is perfromed
		if(e.getSource() == field) {
			answer = field.getText();
		} else if(e.getSource() == button) {
			if(!begin) {												// If quiz hasn't started
				begin = true;
				button.setText("Submit");
				field.setEnabled(true);
				currentQuestion++;
				label.setText(Questions.getQuestion(currentQuestion));
			} else {													// If quiz is going on
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want "
						+ answer + " to be your final "
						+ "answer?\n(MAKE SURE YOU'VE PRESSED ENTER!)", null, JOptionPane.YES_NO_OPTION);
				
				if(choice == JOptionPane.YES_OPTION) {
					if (answer.equals(Answers.getAnswer(currentQuestion).toLowerCase())) {
						JOptionPane.showMessageDialog(null, "Correct!", 
								"Correct Pane", JOptionPane.INFORMATION_MESSAGE);
						numCorrQuestions++;
					} else {
						JOptionPane.showMessageDialog(null, "Nope, the correct answer was " + 
								Answers.getAnswer(currentQuestion) + ".",
								"Incorrect Pane", JOptionPane.ERROR_MESSAGE);
					}
					score.setText("SCORE: " + numCorrQuestions + "/" + numQuestions);
					answer = "";
					field.setText("");
					currentQuestion++;
					
					if(currentQuestion == 30) {
						JOptionPane.showMessageDialog(null, "Congratulations, you have completed\n"
								+ "the quiz with a score of " + numCorrQuestions + "/" + numQuestions +
								"\nGood Job! If you wish to go again press the begin button!");
						reset();										// Reset quiz
					} else {	
						label.setText(Questions.getQuestion(currentQuestion));
					}					
				} else {
					// BLANK ELSE
				}
			}
		} else if(e.getSource() == instructions) {
			JOptionPane.showMessageDialog(null, "Welcome to my computer engineering summative!\n"
					+ "Your goal is to to answer the questions in the quiz and try to get as many\n"
					+ "as possible correct. Capital letters DO NOT matter! Have Fun!",
					"Instruction Pane", JOptionPane.INFORMATION_MESSAGE);	
		}
	}
}