package br.edu.ifpi.dominio;

public class Conta {
    
    private int numeroAgencia;
    private int numeroConta;
    private double saldo;

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

    public double setSacar(double saldo) {
        this.saldo -= saldo;
        return saldo;
    }

    public void setTransferir(double saldo, Conta destinario) {
        this.saldo -= saldo;
        destinario.saldo += saldo;
    }

    public void getInfoConta() {
        System.out.println();
        System.out.println("Número da Agẽncia: " + this.numeroAgencia);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println();
    }

    public void setAberturaConta(int numeroAgencia, int numeroConta, double saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

}
