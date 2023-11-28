import java.util.Scanner;
public class Es2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x, y;
		double k, j;
		System.out.println(	"a) somma di due numeri interi" +
							"\nb) divisione intera e resto tra due numeri interi" +
							"\nc) media tra due numeri double" +
							"\nd) valore assoluto di un numero intero" + 
							"\ne) lunghezza della stringa che rappresenta un numero intero" +
							"\nf) termina il programma" );
		char c = scan.nextLine().charAt(0);
		c = Character.toLowerCase(c);
		switch(c){
			case 'a':
				System.out.println("Primo numero");
				x = scan.nextInt();
				System.out.println("Secondo numero");
				y = scan.nextInt();
				System.out.println(sommaDueNumeri(x,y));
				break;
			case 'b':
				System.out.println("Numeratore");
				x = scan.nextInt();
				System.out.println("Divisore");
				y = scan.nextInt();
				if(y!=0)
					System.out.println(divisioneIntera(x,y) +" " + restoDivisioneIntera(x,y));
				else
					System.out.println("Il divisore e' uguale a 0!");
				break;
			case 'c':
				System.out.println("Primo numero");
				k = scan.nextDouble();
				System.out.println("Secondo numero");
				j = scan.nextDouble();
				System.out.println(mediaTraDueDouble(k,j));
				break;
			case 'd':
				System.out.println("Numero");
				System.out.println(valoreAssolutoIntero(scan.nextInt()));
				break;	
			case 'e':
				System.out.println("Numero");
				System.out.println(lunghezzaStringaIntero(scan.nextInt()));
				break;
			case 'f':
				System.out.println("Uscita");
				break;
			default:
				System.out.println("Errore");
				break;
		}
	}
	public static int sommaDueNumeri(int x, int y){
		return x+y;
	}
	public static int divisioneIntera(int x, int y){
		return x/y;
	}
	public static int restoDivisioneIntera(int x, int y){
		return x%y;
	}
	public static double mediaTraDueDouble(double k, double j){
		return (k+j)/2;
	}
	public static int valoreAssolutoIntero(int x){
		if(x<0)
			x = x*-1;
		return x;
	}
	public static int lunghezzaStringaIntero(int x){
		String str = "";
		str += x;
		return str.length();
	}
}