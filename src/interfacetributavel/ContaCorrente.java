package interfacetributavel;

public class ContaCorrente extends Conta implements Tributos {

    private int diaDaCobranca = 1;
    private double limite;
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
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public double consultaSaldo() {

        double total = this.saldo + this.limite;
        return total ;
    }

    @Override
    public void taxaMnutencao(double valor) {
        this.saldo = this.saldo - valor;

    }

    @Override
    public void impostoRenda(double valor) {
        this.saldo = this.saldo - valor;


    }

    @Override
    public String toString() {
        return   "ContaCorrente{" +
                "diaDaCobranca=" + diaDaCobranca +
                ", limite=" + limite +
                ", saldo=" + saldo +
                '}';
    }
}
