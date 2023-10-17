import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numeratore: ");
        int num = scan.nextInt();
        System.out.println("Denominatore: ");
        int den = scan.nextInt();
        if(den == 0)
            System.exit(0);
        System.out.println("Divisione intera = "+num/den);
    }
}