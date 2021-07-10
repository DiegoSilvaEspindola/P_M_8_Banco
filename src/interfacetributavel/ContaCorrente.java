package interfacetributavel;

public class ContaCorrente extends Conta implements Tributos {


    protected double limite;
    public ContaCorrente(Integer numeroConta, int agenciaConta, String banco, double saldo, double limite) {
        super(numeroConta, agenciaConta, banco, saldo);
        this.limite = limite;
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


    public double getSaldo() {


        return (this.saldo + this.limite) ;
    }

    @Override
    public void taxaManutencao(double valor) {
        this.saldo = this.saldo - valor;

    }

    @Override
    public void impostoRenda(double valor) {
        this.saldo = this.saldo - valor;


    }

    @Override
    public String toString() {
        return   "ContaCorrente{" +
                "diaDaCobranca="  +
                ", limite=" + limite +
                ", saldo=" + saldo +
                '}';
    }
}
