package interfacetributavel;


public class ContaPoupanca extends Conta{

    private int diaAniversario;
    private double jurosDaConta = 0.9;

    public ContaPoupanca(Integer numeroConta, int agenciaConta, String banco, double saldo, int diaAniversario) {
        super(numeroConta, agenciaConta, banco, saldo);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente ");
        }
    }

    @Override
    public double getSaldo() {
        if (diaAniversario == 25){
            this.saldo = this.saldo + this.saldo * jurosDaConta;
            return this.saldo;
          } else{
            return this.saldo;
        }
    }
}
