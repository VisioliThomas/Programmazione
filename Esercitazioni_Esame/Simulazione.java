import java.util.Scanner;
public class Simulazione{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String s1, s2, dispari="";
		boolean ciclo = true;
		do{
			System.out.println("Stringa 1");
			s1 = scan.nextLine();
			System.out.println("Stringa 2");
			s2 = scan.nextLine();
			if(s1.length() == s2.length()){
				int i = 0;
				boolean cifre = true;
				while(i<s1.length() & cifre){
					if( s1.charAt(i)<'0' || s1.charAt(i)>'9' || s2.charAt(i)<'0' || s2.charAt(i)>'9' ){ 
						cifre = false;
					}
					i++;
				}
				if(!cifre)
					System.out.println("Non tutte i caratteri sono cifre! Riprovare");
				else
					ciclo = false;
			}else
				System.out.println("Le stringhe hanno lunghezza diversa! Riprovare");
		}while(ciclo);
		int contUguale = 0, cifra1, cifra2, checkStrDispari=0, somma = 0;
		for(int i = 0; i<s1.length(); i++){
			if(s1.charAt(i) == s2.charAt(i))
				contUguale++;
			cifra1 = s1.charAt(i) - 48;
			cifra2 = s2.charAt(i) - 48;
			if(cifra1%2!=0)
				dispari+=s1.charAt(i);
			if(cifra2%2!=0)
				dispari+=s2.charAt(i);
		}
		System.out.println("Per "+contUguale+" volte capita che nella stessa posizione si trovi lo stesso carattere");
		System.out.println("Cifre dispari: "+ dispari);
		for(int i = 0; i<dispari.length()-1; i++){
			if(dispari.charAt(i)!=dispari.charAt(i+1))
				checkStrDispari++;
		}
		System.out.println("Controllo caratteri stringa dispari: "+checkStrDispari);
		for(int i = 0; i<dispari.length(); i++){
			somma += dispari.charAt(i)-48;
		}
		float media = somma/dispari.length();
		System.out.println("Media dispari: " + media);
	}
}