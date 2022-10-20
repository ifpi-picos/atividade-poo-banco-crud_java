package br.edu.ifpi.dominio;

public class ContaPoupanca extends Conta {
    
    private double rendimento;

    public ContaPoupanca(int numeroAgencia, int numeroConta, double saldo, Cliente cliente, double rendimento) {

        super(numeroAgencia, numeroConta, saldo, cliente);
        this.rendimento = this.getSaldo() * 0.10;
    
    }

    public double getRendimento() {
        return this.rendimento;
    }

    @Override
    public String toString() {
        return "[" + this.getNumeroAgencia() + ", " 
                   + this.getNumeroConta() + ", "
                   + this.getSaldo() + ", "
                   + this.getCliente() + ", "
                   + this.getRendimento() + "]";
    }

}
