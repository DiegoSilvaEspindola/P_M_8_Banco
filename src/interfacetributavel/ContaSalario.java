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
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void taxaMnutencao(int valor) {

    }

    @Override
    public void impostoRenda(double valor) {

    }
}
