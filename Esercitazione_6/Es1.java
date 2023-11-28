import java.util.Scanner;
public class Es1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n, i=0, cont = 0;
		String stringa = "0.";
		System.out.println("Sequenza di numeri positivi terminati da 0");
		do{
			do{
				System.out.println("Inserire un numero positivo");
				n = scan.nextInt();	
			}while(n<0);
			if(n!=0)
				stringa = aggiornaStringa(n, stringa);
		}while(n!=0);
		System.out.println(stringa);
		while(i<stringa.length()){
			if(stringa.charAt(i) == '.'){
				cont++;
				System.out.println();
			}
			if(cont%2 == 0 && stringa.charAt(i) != '.')
				System.out.print(stringa.charAt(i));
			i++;
		}
	}
	public static String aggiornaStringa(int n, String stringa){
		return stringa += n +".";
	}
}