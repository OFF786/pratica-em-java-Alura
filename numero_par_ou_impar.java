import java.util.Scanner;

public class numero_par_ou_impar {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        int numero;

        System.out.println("Digite um número");
        numero=leitura.nextInt();


        if (numero %2==0){
            System.out.println("Numero é par");
        }else {
            System.out.println("numero é impar");
        }


    }
}
