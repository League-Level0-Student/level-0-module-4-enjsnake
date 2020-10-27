package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscores {
		public static void main(String[]args) {
			
			String answer = JOptionPane.showInputDialog("What did you get on your test?");
			double score = Double.parseDouble(answer);
			if(score>= 98.0) {
				JOptionPane.showMessageDialog(null, "Nice job, A+!");
			}
			else if(score<98 && score>92) {
				JOptionPane.showMessageDialog(null, "an A, decent score.");
			}
			else if(score<=92&&score>=90) {
				JOptionPane.showMessageDialog(null, "You're slipping! A-");
			}
			else {
				JOptionPane.showMessageDialog(null, "Study harder!!");
			}
		}
}
