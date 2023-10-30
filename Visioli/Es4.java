import java.util.Scanner;
public class Es4{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanti Kg puo' contenere lo zaino?");
		int zaino = scan.nextInt();
		int oggetto = -1, somma = 0, max = 0, min = 0, nOgg = 0;
		while(somma < zaino && oggetto!=0){
			do{
				System.out.println("Inserire il peso dell'oggetto, POSITIVO. 0 per terminare");
				oggetto = scan.nextInt();
			}while(oggetto<0);
			if(min == 0 || (oggetto < min & oggetto!=0))
				min = oggetto;
			if(oggetto>max)
				max = oggetto;
			somma += oggetto;
			nOgg++;
		}
		float media = (float) somma / nOgg;
		System.out.println("Capacita' zaino: "+ zaino + "\nNumoro oggetti: " + nOgg + "\nPeso oggetti: " + somma);
		System.out.println("Kg oggetto piu' pesante: " + max	+ "\nKg oggetto piu' leggero: " + min + "\nMedia peso: "+ media);
	}
}