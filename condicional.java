public class condicional {
    public static void main(String[] args) {
        int anoDeLançamento =2022;
        boolean incluidoNoPlano = true;
       double notaDoFilmem= 8.1;
       String tipoPlano = "plus";


        if (anoDeLançamento >= 2022){
            System.out.println("lançamento que os clientes estão curtindo");
        }else{
            System.out.println("Filme retrô que vale a pena assitir!");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}
