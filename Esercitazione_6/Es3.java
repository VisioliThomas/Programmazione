import java.util.Scanner;
public class Es3 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci stringa");
		String stringa = scan.nextLine();
		System.out.println("Inserisci carattere");
		char c = scan.nextLine().charAt(0);
		if(cercaCarattere(stringa, c)){
			System.out.println(rimuoviCarattere(stringa, c));
		}
	}
	public static boolean cercaCarattere(String stringa, char c){
		if(stringa.lastIndexOf(c) == -1)
			return false;
		return true;
	}
	public static String rimuoviCarattere(String stringa, char c){
		String str = "";
		str += c;
		return stringa.replace(str, "");
	}
}