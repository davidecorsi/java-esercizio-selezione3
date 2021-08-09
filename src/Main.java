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
	}
}
