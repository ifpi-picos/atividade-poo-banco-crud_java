package br.edu.ifpi.dominio;

public class ContaCorrente extends Conta {
    
    private double chequeEspecial;

    public ContaCorrente(int numeroAgencia, int numeroConta, double saldo, Cliente cliente, Notificacao notificacao, double chequeEspecial) {
        
        super(numeroAgencia, numeroConta, saldo, cliente, notificacao);
        this.chequeEspecial = chequeEspecial;
        
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
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
