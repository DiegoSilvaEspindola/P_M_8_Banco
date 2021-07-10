package interfacetributavel;


public class ContaPoupanca extends Conta{

    private double taxaJuros;
    public ContaPoupanca(Integer numeroConta, int agenciaConta, String banco, double saldo, double taxaJuros) {
        super(numeroConta, agenciaConta, banco, saldo);
        this.taxaJuros = taxaJuros;

    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente ");
        }
    }
    public void determinaSaldo(){
        this.saldo = this.saldo + this.saldo*taxaJuros;
    }


    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }



    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
