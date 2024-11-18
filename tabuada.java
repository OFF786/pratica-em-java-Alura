import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
         int multiplicacao;

        System.out.println("Digite um número de 1 a 10");
        numero= leitura.nextInt();

        System.out.println("Tabuada do"+numero+":");
        for (int i=1;i<=10;i++){

            System.out.println(numero+"x"+i+"="+(numero*i));


        }
    }
}
