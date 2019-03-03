package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random rand = new Random();
		JOptionPane.showMessageDialog(null, "Here are your lottery numbers");
		int lot = rand.nextInt(101);
		JOptionPane.showMessageDialog(null, lot);
		int lot2 = rand.nextInt(101);
		JOptionPane.showMessageDialog(null, lot2);
		int lot3 = rand.nextInt(101);
		JOptionPane.showMessageDialog(null, lot3);
		int lot4 = rand.nextInt(101);
		JOptionPane.showMessageDialog(null, lot4);
		int lot5 = rand.nextInt(101);
		JOptionPane.showMessageDialog(null, lot5);
		if (lot == 34 && lot2 == 12 && lot3 == 45 && lot4 == 66 && lot5 == 76) {
			JOptionPane.showMessageDialog(null, "YOU WINNNNNNNNNNNNNN!!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Try again");
		}
	}
}