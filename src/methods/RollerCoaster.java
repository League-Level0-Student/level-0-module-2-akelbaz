package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you(in inches)");
		int num = Integer.parseInt(height);
		if (num >= 48) {
			JOptionPane.showMessageDialog(null, "You are tall enough to ride the roller coaster :)");
		} else {
			JOptionPane.showMessageDialog(null, "Come back when your taller small fry! >:(");
		}
	}
}
