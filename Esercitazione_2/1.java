import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire un numero");
        int x = scan.nextInt();
        if(x < 0){
            x *= -1;
        }
        System.out.println("Valore assoluto = "+x);
    }
}