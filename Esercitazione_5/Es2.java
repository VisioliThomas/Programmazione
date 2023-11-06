import java.util.Scanner;
public class Es2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Stringa 1");
		String s1 = scan.nextLine();
		System.out.println("Stringa 2");
		String s2 = scan.nextLine();
		int lung = s2.length();
		int sel = 2;
		if(s1.length() <= s2.length()){
			lung = s1.length();
			sel = 1;
		}
		int cont = 0;
		boolean continua = true;
		System.out.println(lung);
		do{
			if(s1.charAt(cont) == s2.charAt(cont))
				cont++;
			else
				continua = false;
		}while(cont<lung && continua);
		System.out.println("Il massimo prefisso comune tra le stringhe " + s1 + " e " + s2 + " ha lunghezza " + cont );
	}
}