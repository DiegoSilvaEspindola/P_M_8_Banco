package interfacetributavel;

public class Banco {

    protected ContaPoupanca ContaPoupanca;
    protected ContaCorrente ContaCorrente;
    protected ContaSalario ContaSalario;



    public void criaCP(Integer numeroConta, int agenciaConta, String banco, double saldo, double taxaJuros){
        this.ContaPoupanca = new ContaPoupanca(numeroConta, agenciaConta, banco, saldo, taxaJuros);
    }

    public void criaCC(Integer numeroConta, int agenciaConta, String banco, double saldo, double limite){
        this.ContaCorrente = new ContaCorrente(numeroConta, agenciaConta, banco, saldo, limite);
    }

    public void criaCS(Integer numeroConta, int agenciaConta, String banco, double saldo){
        this.ContaSalario = new ContaSalario(numeroConta, agenciaConta, banco, saldo);
    }

    public void tranferir(Conta origem, Conta destino, double valor){
        origem.sacar(valor);
        destino.depositar(valor);
    }

    public double saldoTotal(){
        double saldoTotal =  ContaCorrente.getSaldo() + ContaSalario.getSaldo() + ContaPoupanca.getSaldo();

        return saldoTotal;
        }
    }



