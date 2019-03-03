package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you");
		int num = Integer.parseInt(age);
		if (num >= 18) {
			JOptionPane.showMessageDialog(null, "Who should the next president be... VOTE TODAY :)");
		} else {
			JOptionPane.showMessageDialog(null, "Come back when your older small fry! No one cares what you think >:(");
		}
	}
}
