import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MadLib
{
	public static void main(String[] args) 
	{

	//variables
		String noun1, noun2, adjective, pastVerb;
		ImageIcon icon = new ImageIcon("mL.png");

	//asks the user to declare each variable
		noun1 = JOptionPane.showInputDialog(null, "Please enter a noun --> ");

		noun2 = JOptionPane.showInputDialog(null, "Please enter another noun --> ");

		adjective = JOptionPane.showInputDialog(null, "Please enter an adjective --> ");

		pastVerb = JOptionPane.showInputDialog(null, "Please enter a verb in the PAST tense --> ");

	//creates the mad lib from the users inputs
		JOptionPane.showMessageDialog(null, "Mary had a little " + noun1 + 
		"\nIts " + noun2 + " was " + adjective + " as snow" + 
		"\nAnd everywhere that Mary " + pastVerb + "\nThe " + noun1 + " was sure to go.", "Mad Libs is so much fun!",
		 JOptionPane.WARNING_MESSAGE, icon); 
	}
}