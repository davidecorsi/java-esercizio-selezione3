/* 
Scrivere un programma che chieda agli utenti due stringhe in ingresso, 
le stringhe possono valere solo: “carta”, “forbice” o “sasso”. 
Il programma dovrà quindi effettuare i dovuti controlli e dichiarare 
il vincitore secondo le note regole della “morra cinese” 
(forbice vince su carta, carta vince su sasso, sasso vince su forbice).
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// La classe scanner ci permette di leggere dati dalla tastiera
		Scanner input = new Scanner(System.in);
		System.out.print("Giocatore 1: ");
		String firstPlayer = input.nextLine();
		System.out.print("Giocatore 2: ");
		String secondPlayer = input.nextLine();
		
		// Controllo che gli input siano corretti
		if((!firstPlayer.equals("carta") && !firstPlayer.equals("forbice") && !firstPlayer.equals("sasso")) ||
				(!secondPlayer.equals("carta") && !secondPlayer.equals("forbice") && !secondPlayer.equals("sasso"))) {
			System.out.println("Input inserito non valido");
		} else if(firstPlayer.equals(secondPlayer)) {
			System.out.println("Parità");
		} else if(firstPlayer.equals("carta") && secondPlayer.equals("sasso")) {
			System.out.println("Vince il giocatore 1");
		} else if(firstPlayer.equals("carta") && secondPlayer.equals("forbice")) {
			System.out.println("Vince il giocatore 2");
		} else if(firstPlayer.equals("forbice") && secondPlayer.equals("carta")) {
		System.out.println("Vince il giocatore 1");
		} else if (firstPlayer.equals("forbice") && secondPlayer.equals("sasso")) {
			System.out.println("Vince il giocatore 2");
		} else if(firstPlayer.equals("sasso") && secondPlayer.equals("forbice")) {
			System.out.println("Vince il giocatore 1");
		} else if (firstPlayer.equals("sasso") && secondPlayer.equals("carta")) {
			System.out.println("Vince il giocatore 2");
		}
	}
}
