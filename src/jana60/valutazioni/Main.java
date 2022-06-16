package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Studente [] studenti = new Studente [4];
		
		for (int i=0; i<studenti.length; i++) {
			int percentualeAssenze;
			System.out.println("Inserire percentuale assenze:");
			percentualeAssenze = scan.nextInt();
			
			float mediaVoti;
			System.out.println("Inserire media voti:");
			mediaVoti = scan.nextFloat();
			
			Studente s = new Studente(i+1,percentualeAssenze, mediaVoti);
			studenti[i]= s;
		}
		int contatore = 0; 
		
		for (int i=0; i<studenti.length; i++) {
			if (studenti[i].risultato()) {
				System.out.println("Lo studente " + studenti[i].idStudente + " è stato promosso");
				contatore++;
			}else {
				System.out.println("Lo studente " + studenti[i].idStudente + " è stato bocciato");
			}
		}
		System.out.println("Il numero totale di alunni promossi è: " + contatore);
		scan.close();
	}
	
}
