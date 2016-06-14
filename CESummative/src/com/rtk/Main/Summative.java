package com.rtk.Main;

import javax.swing.JFrame;

/**
 * @author Rohit Terry Kisto
 * Created on: 6/14/2016
 * Purpose: Build a program that will allow the user to test their knowledge on computer engineering
 * through a quiz
 */

// This class is the main entry point for the program
public class Summative {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Computer Hardware Quiz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Quiz());
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}
}