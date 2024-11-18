import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner leitura= new Scanner(System.in);
        int fatorial =1;
        int numero;
        System.out.println("Digite um número para se calcular o fatorial");
        numero=leitura.nextInt();

        for (int i=1;i<=numero;i++){

            fatorial*=i;

        }
        System.out.println("O fatorial de "+numero+" é: "+fatorial);

    }
}
