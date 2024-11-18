import java.util.Scanner;

public class conta_bancaria {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);

        //variáveis
        String nome="Jacqueline Oliveira";
        String contaCorrente="Corrente";
        double saldo=5000;
        int opcao=0;
        int valorReceber=0;
        int transferir;
        //Dados so cliente
        System.out.println();
        System.out.println(nome);
        System.out.println(contaCorrente);
        System.out.println(saldo);
        System.out.println();




        //operações que serão realizadas





             System.out.println("Operações");
             System.out.println();
             System.out.println("1-Consultar saldos");
             System.out.println("2- Receber valor");
             System.out.println("3- Transferir valor");
             System.out.println("4- Sair");


             System.out.println("Digite a opção: ");
             opcao=leitura.nextInt();



             if (opcao == 1) {
                 System.out.println("Seu saldo é: " + saldo);
                 saldo=leitura.nextDouble();
                 System.out.println();

             } else if (opcao == 2) {

                 System.out.println("Digite o valor que você vai receber:  ");
                 valorReceber = leitura.nextInt();
                 if (valorReceber < 0) {
                     System.out.println("Opção inválida");

                 } else {
                     System.out.println();
                     saldo += valorReceber;
                     System.out.println("Seu saldo atual é :R$   " + saldo);
                 }


             } else if (opcao == 3) {
                 System.out.println("Transferência");
                 System.out.println();
                 System.out.println("Digite o valor que vai ser transferido");
                 transferir = leitura.nextInt();

                 if (transferir > saldo) {
                     System.out.println("Operação impossibilitada pelo saldo estar abaixo do valor de transferência");

                 } else
                     System.out.println("Seu saldo atual é: " + (saldo - transferir));

             } else if (opcao == 4) {
                 System.out.println();
                 System.out.println("Até logo");


             } else
                 System.out.println("Opção inválida");


         }
    }

