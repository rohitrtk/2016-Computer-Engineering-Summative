package com.rtk.QnA;

// This class holds all the answers to the quiz
public class Answers {
	
	public static String[] answers;
	
	public Answers() {
		answers = new String[30];
		answers[0] = "motherboard";
		answers[1] = "vga";
		answers[2] = "no";
		answers[3] = "sram";
		answers[4] = "hard disk drive";
		answers[5] = "rpm";
		answers[6] = "random access memory";
		answers[7] = "central processing unit";
		answers[8] = "esata";
		answers[9] = "no";
		answers[10] = "no";
		answers[11] = "ghz";
		answers[12] = "basic input output system";
		answers[13] = "video card";
		answers[14] = "electromagnetic interference";
		answers[15] = "10101";
		answers[16] = "monitor";
		answers[17] = "usb";
		answers[18] = "hdmi";
		answers[19] = "60000";
		answers[20] = "dynamic host configuartion protocol";
		answers[21] = "147";
		answers[22] = "no";
		answers[23] = "ethernet";
		answers[24] = "40";
		answers[25] = "gigabytes";
		answers[26] = "random access memory";
		answers[27] = "no";
		answers[28] = "1001111";
		answers[29] = "102";
	}
	
	public static String getAnswer(int i) {					// If needed, get current answer
		String answer = answers[i];
		
		return answer;
	}
}
