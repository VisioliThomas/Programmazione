import java.util.Scanner;
public class EsameB{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = 0, x = 0, prod = 1, max = 0, min = 0;
		while( num<1 ){
			System.out.println("Inserire un numero intero positivo n ");
			num = scan.nextInt();
		}
		while(x!=num){
			System.out.println("Inserire un numero intero positivo");
			x = scan.nextInt();
			if(x>0 & x!=num){
				prod *= x;
				if( x > max )
					max = x;
				if(x < min | min == 0)
					min = x;
			}
		}
		System.out.println("prod: " + prod + " min: " + min + " max: " + max);
		int i = max, somme = 0, cont = 0, j;
		while ( i <= prod ){
			j = min;
			while( j <= max){
				somme += (i+j);
				cont++;
				j++;
			}
			i++;
		}
		float media = somme / cont;
		System.out.println("Media: " + media);
	}
}
