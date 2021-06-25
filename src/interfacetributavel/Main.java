package interfacetributavel;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String args []){

        Scanner entrada = new Scanner (System.in);

        List<Conta> clientes = new LinkedList<>();

        ContaCorrente ccAndreLuiz = new ContaCorrente(0101, 01,"bb", 1500, 1000);

        ContaSalario csAndreLuiz = new ContaSalario(101010, 0101, "Itaú", 2500);

        ContaPoupanca cpCarlos = new ContaPoupanca(02021, 0123, "Bradesco", 999, 25);

        ContaCorrente ccDaniel = new ContaCorrente(0321, 012, "NuBnac", 2350, 3500);

       System.out.println( ccAndreLuiz.consultaSaldo());

     }
}
