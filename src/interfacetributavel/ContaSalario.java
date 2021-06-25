package interfacetributavel;

public class ContaSalario extends Conta implements Tributos {

    public ContaSalario(Integer numeroConta, int agenciaConta, String banco, double saldo) {
        super(numeroConta, agenciaConta, banco, saldo);
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
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public double consultaSaldo() {
        return this.saldo;
    }

    @Override
    public void taxaMnutencao(double valor) {

        this.saldo = this.saldo - valor;
    }

    @Override
    public void impostoRenda(double valor) {
        taxaMnutencao(valor);
       // this.saldo = this.saldo - valor;
    }
}
