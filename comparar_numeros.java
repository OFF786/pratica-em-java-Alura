import java.util.Scanner;

public class comparar_numeros {
    public static void main(String[] args) {
        Scanner leitura= new Scanner(System.in);
           int primeiroNumero;
           int segundoNumero;

        System.out.println("Digite o primeiro numero");
        primeiroNumero= leitura.nextInt();
        System.out.println("Digite o segundo número");
        segundoNumero = leitura.nextInt();

        if (primeiroNumero > segundoNumero ){

            System.out.println("O número"+primeiroNumero+ "É maior que o número  " + segundoNumero);

        } else if (primeiroNumero < segundoNumero) {
            System.out.println("O número  "+segundoNumero+ "  É maior que o número  " + primeiroNumero);
        } else if (primeiroNumero == segundoNumero) {
            System.out.println("O números digitados são iguais");
        }

    }
}
