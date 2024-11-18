//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: top Gun: Mavrick");

        int anoDeLançamento =2022;

        System.out.println("Ano de lançamento:  "+ anoDeLançamento);
         boolean incluidoNoPalano =true;
         double notaDoFilme = 8.1;

         double media = (9.8 + 6.3 +8.0)/3;

        System.out.println("A média é:  "+ media);
        String sinopse;
        sinopse= """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom !
                ano de lançamento
                """+anoDeLançamento;
        System.out.println(sinopse);

    }
}