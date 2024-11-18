import java.util.Scanner;

public class numeropositivo_ou_negativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
         int numeroDigitado;
        System.out.println("Digite um número");
        numeroDigitado= leitura.nextInt();
       if ( numeroDigitado >=0){
           System.out.println("O número digitado é: " + numeroDigitado);
       }else {
           System.out.println("O numero digitado é : " + numeroDigitado);
       }
    }
}
