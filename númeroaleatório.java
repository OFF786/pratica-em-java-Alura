import java.util.Random;
import java.util.Scanner;


public class númeroaleatório {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numerogerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas=0;
        int numerodigitado=0;

        for (tentativas=0;tentativas<=5;tentativas++){
            System.out.println("Digite um número entre 0 e 100:  ");
            numerodigitado = leitor.nextInt();


            if (numerodigitado == numerogerado){

                System.out.println("Parabéns, você acertou o numero em "+ tentativas + "tentativas!");
                 break; // interrmpe o loop while
                
            } else if (numerodigitado < numerogerado) {
                System.out.println("O número digitado é menor que o número gerado");
            }else {
                System.out.println("O numero digitado é maior que o número gerado");
            }

        }
        if (tentativas==5 && numerodigitado != numerogerado){
            System.out.println("Você não conseguiu acertar o número em 5 tentativas");
        }
    }
}
