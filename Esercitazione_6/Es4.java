import java.util.Scanner;
public class Es4{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		boolean ciclo = true;
		double temp;
		while(ciclo){
			switch(menu()){
				case 1:
					System.out.println("Inserire temperatura in Fahrenheit:");
					temp = scan.nextDouble();
					System.out.println("Temperature in Celsius: "+ convertiFinC(temp));
					break;
				case 2:
					System.out.println("Inserire temperatura in Celsius:");
					temp = scan.nextDouble();
					System.out.println("Temperature in Fahrenheit: "+ convertiCinF(temp));
					break;
				case 3:
					ciclo = false;
					break;
				default:
					System.out.println("Errore");
					break;
			}
		}
	}
	public static int menu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("1)  Fahrenheit -> Celsius \n2)  Celsius -> Fahrenheit\n3) Uscita");
		return scan.nextInt();
	}
	public static double convertiFinC(double temp){
		return ((1.8*temp) + 32);
	}
	public static double convertiCinF(double temp){
		return ((temp - 32)/1.8);
	}
}