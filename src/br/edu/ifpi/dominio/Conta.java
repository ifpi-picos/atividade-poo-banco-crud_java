package br.edu.ifpi.dominio;

public class Conta {
    
    private int numeroAgencia;
    private int numeroConta;
    private double saldo;

    public Conta(int numeroAgencia, int numeroConta, double saldo) {

        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

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

    public boolean setDepositar(double saldo) {
        this.saldo += saldo;
        return true;
    }

    public void setSacar(double saldo) {
        this.saldo -= saldo;
    }

    public void setTransferir(double saldo, Conta destinaario) {
        this.saldo -= saldo;
        destinaario.saldo += saldo;
    }

}
