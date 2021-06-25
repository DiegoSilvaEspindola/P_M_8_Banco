package interfacetributavel;

public abstract class Conta {
    private Integer numeroConta;
    private int agenciaConta;
    private String banco;
    protected double saldo;

    public Conta(Integer numeroConta, int agenciaConta, String banco, double saldo) {
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.banco = banco;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(int agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public abstract double consultaSaldo();

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);



    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", agenciaConta=" + agenciaConta +
                ", banco='" + banco + '\'' +
                '}';
    }
    public void tranferir(Conta outra, double valor){
        this.sacar(valor);
        outra.depositar(valor);
    }
}


