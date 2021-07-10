package interfacetributavel;


import java.util.Scanner;

public class Main {
    public static void main (String args []) {

        Banco banco = new Banco();
        Gerente gerente = new Gerente();
        Scanner teclado = new Scanner (System.in);



        int opcao = 0;

        do{
            System.out.println("  MENU DE OPÇOES ");
            System.out.println("1- Criar conta corrente");
            System.out.println("2- Criar conta salário");
            System.out.println("3- Criar conta poupança");
            System.out.println("4- Transferencia");
            System.out.println("5- Mostrar montante");
            System.out.println("6- Sair");
            System.out.println("Escolha a opção desejada");

            switch (opcao){
                case 1:
                    banco.criaCC(01, 01, "BB",250,1000);
                    break;
                case 2:
                    banco.criaCS(0222, 01, "NuBank", 2500 );
                    break;
                case 3:
                    banco.criaCP(0123, 001, "Itaú", 1000, 0.05);
                    break;
                case 4:
                   // banco.tranferir(ContaSalario, ContaCorrente, 350);
                    break;
                case 5:
                    banco.saldoTotal();
                    break;
                case 6:
                    System.out.println("Saindo");
                    opcao = 6;

            }



        } while (opcao != 6);
    }
}
