package br.edu.ifpi.dominio;

public class ContaCorrente extends Conta {
    
    private double chequeEspecial;

    public ContaCorrente(int numeroAgencia, int numeroConta, double saldo, Cliente cliente, double chequeEspecial) {
        
        super(numeroAgencia, numeroConta, saldo, cliente);
        this.chequeEspecial = chequeEspecial;
        
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }
    
}

