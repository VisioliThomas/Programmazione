import java.util.Scanner;
public class EsameA{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Boolean continua = true;
		int n, sum = 0, min = 0, max = 0;
		while(continua){
			System.out.println("Inserire un numero:");
			n = scan.nextInt();
			if(n == 0)
				continua = false;
			else if ( n > 0 ){
				sum += n;
				if(n > max)
					max = n;
				else if(n < min || min == 0)
					min = n;
			}
		}
		System.out.println("sum: " + sum + " min: " + min + " max: " + max);
		int i = max, j, cont = 0, molt = 0;
		while ( i <= sum ){
			j = min;
			while ( j <= max ){
				molt += i*j;
				j++;
				cont++;
			}
			i++;
		}
		float media = molt / cont;
		System.out.println("media: " + media);
	}
}
