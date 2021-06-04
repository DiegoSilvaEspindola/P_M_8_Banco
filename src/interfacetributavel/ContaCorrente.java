package interfacetributavel;

public class ContaCorrente extends Conta implements Tributos {

    private Double limite;
    public ContaCorrente(Integer numeroConta, int agenciaConta, String banco, double saldo, double limite) {
        super(numeroConta, agenciaConta, banco, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo + limite >= valor){
            this.saldo = this.saldo - valor;
            }else {
            System.out.println("Saldo insuficiente ");
        }

    }

    @Override
    public double getSaldo() {
        return this.saldo + this.limite;
    }

    @Override
    public void taxaMnutencao(int valor) {

    }

    @Override
    public void impostoRenda(double valor) {

    }
}
