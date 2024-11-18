import java.util.Scanner;

public class calculo_das_figuras {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
         int numeroDigitado ;
         double areaQuadrado;
         double baseDoQuadrado ;
         double ladoDoQuadrado;
         double raioDoQuadrado;

         double areaDoCirculo;

         System.out.println("Digite 1 para calcular a área do quadrado ou 2 para calcular área do circulo");
         numeroDigitado = leitura.nextInt();


         if (numeroDigitado ==1 ){
             System.out.println("Digite a medida da base do quadrado");
             baseDoQuadrado = leitura.nextDouble();
             System.out.println("Digite a medida do lado do quadrado");
             ladoDoQuadrado = leitura.nextDouble();

             areaQuadrado= baseDoQuadrado*ladoDoQuadrado;

             System.out.println("A área do quadrado é "+areaQuadrado);

         } else if (numeroDigitado == 2) {

             System.out.println("Digite o raio da circunferência");
             raioDoQuadrado = leitura.nextDouble();

             areaDoCirculo = Math.PI * Math.pow(raioDoQuadrado,2);

             System.out.println("área da circunferência "+ areaDoCirculo);

         }


    }
}
