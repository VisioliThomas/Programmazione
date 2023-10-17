import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero da 0 a 127");
        int n = scan.nextInt();
        String numeroDaStampare = ""; //stringa vuota
        if(n < 0 || n > 127){
            System.exit(-1);
        }
        //senza cicli esce un po' un patatrac, ma così almeno è facile ed "efficiente". Ci sono altre soluzioni? certo, ma senza cicli questa è quella più immediata secondo me
        int resto;
        resto = n%2;
        char c6 = (char) (resto+48);
        n = n/2;
        resto = n%2;
        char c5 = (char) (resto+48);
        n = n/2;
        resto = n%2;
        char c4 = (char) (resto+48);
        n = n/2;
        resto = n%2;
        char c3 = (char) (resto+48);
        n = n/2;
        resto = n%2;
        char c2 = (char) (resto+48);
        n = n/2;
        resto = n%2;
        char c1 = (char) (resto+48);
        n = n/2;
        resto = n%2;
        char c0 = (char) (resto+48);
        n = n/2;
        numeroDaStampare = c0 +""+c1 +""+c2 +""+c3 +""+c4 +""+c5 +""+c6;
        System.out.println(numeroDaStampare);
    }
}