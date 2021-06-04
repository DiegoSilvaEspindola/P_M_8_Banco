package interfacetributavel;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String args []){

        Scanner entrada = new Scanner(System.in);

        List<Conta> clientes = new LinkedList<>();

        int cont = 1;
        while (cont == 1) {

            System.out.println(" *** Banrisul *** ");
            System.out.println("Menu de opções :  ");
            System.out.println("1 - criar conta");
            System.out.println("2 - sacar");
            System.out.println("3 - depositar");
            System.out.println("4 - tranferencias");
            System.out.println("5 - mostrar valor total das contas");
            System.out.println("6 - sair");
            System.out.println("  Escolha a opção desejada : ");

            int opcao = entrada.nextInt();

            switch (opcao){
                case 1 :
                    System.out.println("Criando conta");
                    System.out.println("");
                    break;
                case 2 :
                    System.out.println("Retire seu diinheiro");
                    System.out.println("");
                    break;
                case 3 :
                    System.out.println("Deposito realizado");
                    System.out.println("");
                    break;
                case 4 :
                    System.out.println("Valor transferido");
                    System.out.println("");
                    break;
                case 5 :
                    System.out.println("O valort total das contas é :");
                    System.out.println("");
                    break;
                case 6 :
                    System.out.println("Obrigado pela preferência");
                    cont ++ ;
                    System.out.println("");
                    break;
                default :
                    System.out.println("DIGITE UMA OPÇÃO VALIDA");
                    System.out.println("");
                    break;
            }

        }

    }
}
