//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
			int randomNumber = randomMaker.nextInt(5);
			System.out.println(randomNumber);
			// 2. Repeat all the code above 10 times
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "ME LIKE UR HAIR");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "YOU WON A FREE CRUISE");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "UR MY SPECIAL FRIEND");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "SOMETHING NICE");
			} else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "I HAVE NOTHING ELSE NICE TO SAY");

			}
			// 3. Find someone to test out your program. They will like it :)
		}
	}
}