package br.edu.ifpi.dominio;

public abstract class Conta {

    private int numeroAgencia;
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numeroAgencia, int numeroConta, double saldo, Cliente cliente) {

        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;

    }

    public int getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public boolean Depositar(double saldo) {
        this.saldo += saldo;
        return true;
    }

    public double Sacar(double saldo) {
        this.saldo -= saldo;
        return saldo;
    }
    
    public void Transferir(double saldo, Conta destinatario) {
        this.saldo -= saldo;
        destinatario.saldo += saldo;
    }

}
