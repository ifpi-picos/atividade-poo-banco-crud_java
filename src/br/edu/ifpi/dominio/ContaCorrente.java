package br.edu.ifpi.dominio;

public class ContaCorrente extends Conta {
    
    private double chequeEspecial;

    public ContaCorrente(int numeroAgencia, int numeroConta, double saldo, Cliente cliente, Notificacao notificacao, double chequeEspecial) {
        
        super(numeroAgencia, numeroConta, saldo, cliente, notificacao);
        this.chequeEspecial = chequeEspecial;
        
    }

    @Override
    public boolean depositar(double deposito) {
        return super.depositar(deposito);
    }

    @Override
    public double sacar(double saque) {
        return super.sacar(saque);
    }

    @Override
    public void transferir(double transferencia, Conta destinatario) {
        this.sacar(transferencia * 1.05);
        destinatario.depositar(transferencia);
        this.enviaNotificacao("Tranferência: ", transferencia * 1.05);
        destinatario.enviaNotificacao("Tranferência: ", transferencia);
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public double setChequeEspecial(double chequeEspecial) {
        return this.chequeEspecial -= chequeEspecial; 
    }

    @Override
    public String toString() {
        return "[" + this.getNumeroAgencia() + ", " 
                   + this.getNumeroConta() + ", "
                   + this.getSaldo() + ", "
                   + this.getCliente() + ", "
                   + this.getNotificacao() + ", "
                   + this.getChequeEspecial() + "]";
    }

}    
