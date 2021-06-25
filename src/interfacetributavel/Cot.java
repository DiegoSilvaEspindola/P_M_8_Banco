package interfacetributavel;

public class Cot {
    private String banco;
    private int numeroConta;
    private int numeroAgenciaa;
    private double saldo;

    public Cot(String banco, int numeroConta, int numeroAgenciaa, double saldo) {
        this.banco = banco;
        this.numeroConta = numeroConta;
        this.numeroAgenciaa = numeroAgenciaa;
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgenciaa() {
        return numeroAgenciaa;
    }

    public void setNumeroAgenciaa(int numeroAgenciaa) {
        this.numeroAgenciaa = numeroAgenciaa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }

    public void deposiatr(double valor){
        this.saldo =this.saldo + valor;
    }

    @Override
    public String toString() {
        return "Cot{" +
                "banco='" + banco + '\'' +
                ", numeroConta=" + numeroConta +
                ", numeroAgenciaa=" + numeroAgenciaa +
                ", saldo=" + saldo +
                '}';
    }
    public void transf(Cot outra, double valor){
        this.sacar(valor);
        outra.deposiatr(valor);
    }
}
