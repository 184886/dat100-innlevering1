package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {

		int poeng = 0;
		int student = 10;
		for (int i = 1; i <= student; i++) {

			do {
				System.out.print("Skriv inn poengsum for student " + i + " (0-100): ");

				poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum:"));

				if (poeng <= 0) {
					showMessageDialog(null, "ugyldig poengsum");

				} else if (0 <= poeng && poeng <= 39) {
					showMessageDialog(null, "karakter F");

				} else if (40 <= poeng && poeng <= 49) {
					showMessageDialog(null, "karakter E");

				} else if (50 <= poeng && poeng <= 59) {
					showMessageDialog(null, "karakter D");

				} else if (60 <= poeng && poeng <= 79) {
					showMessageDialog(null, "karakter C");

				} else if (80 <= poeng && poeng <= 89) {
					showMessageDialog(null, "karakter B");

				} else if (90 <= poeng && poeng <= 100) {
					showMessageDialog(null, "karakter A");

				} else {
					showMessageDialog(null, "ugyldig poengsum");
				}
				} while (100 < poeng || 0 > poeng);
			}
		
			
		}

}
