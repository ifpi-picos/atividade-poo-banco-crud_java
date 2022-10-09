package br.edu.ifpi.dominio;

public class ContaPoupanca extends Conta {
    
    private double rendimento;

    public ContaPoupanca(int numeroAgencia, int numeroConta, double saldo, Cliente cliente, double rendimento) {

        super(numeroAgencia, numeroConta, saldo, cliente);
        this.rendimento = rendimento;
    
    }

    public double getRendimento() {
        return this.rendimento;
    }

}


