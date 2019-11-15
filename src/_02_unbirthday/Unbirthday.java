package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String one = JOptionPane.showInputDialog("When is your birthday? (Pleas right in numbers only.)");
		if (one.equals("11/13")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		}	
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}
		
	}

}
