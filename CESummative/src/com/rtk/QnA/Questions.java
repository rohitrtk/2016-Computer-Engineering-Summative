package com.rtk.QnA;

// This class holds all the questions to the quiz
public class Questions {
	
	public static String[] questions;
	
	public Questions() {
		questions = new String[30];
		questions[0] = "What part of the computer contains the north and south bridge?";
		questions[1] = "What legacy port has a 15 D connector and is used for display?";
		questions[2] = "PS2 ports are for the Playstation 2?\n(Yes or No)";
		questions[3] = "What type of memory is used as cache?";
		questions[4] = "What type of storage device uses a magnetic disk to store information?";
		questions[5] = "What unit of measurement is used to measure the hard disk speed?";
		questions[6] = "What does RAM stand for?";
		questions[7] = "What does CPU stand for?";
		questions[8] = "What type of connector is used to connect the hard drive to the motherboard?";
		questions[9] = "To clean pc components, use Water?\n(Yes or No)";
		questions[10] = "The mouse, the keyboard and the printer, are all examples of output devices?W\n(Yes or No))";
		questions[11] = "The speed of your CPU is measured in?";
		questions[12] = "What does BIOS stand for?";
		questions[13] = "What pc part do you need to play intense games?";
		questions[14] = "What does EMI stand for?";
		questions[15] = "Convert 21 to binary";
		questions[16] = "What output device outputs a display to the user and begins with m?";
		questions[17] = "What port is used to connect wirelessly to the internet?";
		questions[18] = "What port allows the user to view a display in high defintiion?";
		questions[19] = "Convert 60 volts to milivolts";
		questions[20] = "Define DHCP";
		questions[21] = "Convert 10010011 to decimal";
		questions[22] = "When installing pc components, it's safe to have the pc on\n(Yes or No)";
		questions[23] = "What port is used to connect to the internet via wire?";
		questions[24] = "Calculate the voltage in a circuit with a current of 0.1 and resistance of 400 ohms";
		questions[25] = "The capacity of a storage device is measured in?(Spell the entire word)";
		questions[26] = "What is the temporary storage in a computer called?(Spell the entire word)";
		questions[27] = "Dust does NOT interfere with the performence of a computer?\n(Yes or No)";
		questions[28] = "Convert 79 to binary";
		questions[29] = "Convert 1100110 to decimal";
	}
	
	public static String getQuestion(int i) {									// If needed, get current question
		String question;
		
		question = questions[i];
		
		return question;
	}
}
