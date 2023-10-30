import java.util.Scanner;
public class Es6{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire due stringhe di 0 e 1 di uguale lunghezza");
		System.out.println("Stringa 1");
		String s1 = scan.nextLine();
		System.out.println("Stringa 2");
		String s2 = scan.nextLine();
		if(s1.length() != s2.length()){
			System.out.println("le due stringhe hanno lunghezza diversa!");
			System.exit(-1);
		}
		boolean errore = false;
		int i = 0;
		do{
			if( (s1.charAt(i) != '1' & s1.charAt(i) != '0') || (s2.charAt(i) != '1' & s2.charAt(i) != '0') )
				errore = true;
			i++;
		}while(!errore && i<s1.length());
		if(errore){
			System.out.println("Le due stringhe non sono composte da 1 e 0");
			System.exit(-2);
		}
		String unione = "", intersezione = "";
		for(int j = 0; j<s1.length(); j++){
			if(s1.charAt(j) == '1' || s2.charAt(j) == '1')
				unione += "1";
			else
				unione += "0";
		}
		for(int j = 0; j<s1.length(); j++){
			if(s1.charAt(j) == '1' & s2.charAt(j) == '1')
				intersezione += "1";
			else
				intersezione += "0";
		}
		System.out.println("intersezione: " + intersezione + "\nunione: "+ unione);
	}
}