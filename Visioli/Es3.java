import java.util.Scanner;
public class Es3{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Base:");
		int base = scan.nextInt();
		int esponente;
		do{
			System.out.println("Esponente: (> -1)");
			esponente = scan.nextInt();
		}while(esponente<0);
		if(base == 0){
			System.out.println("= 0");
		}else{
			int i = 1, potenza= base;
			while(i<esponente){
				potenza*=base;
				i++;
			}
			System.out.println("= "+potenza);
		}
	}
}