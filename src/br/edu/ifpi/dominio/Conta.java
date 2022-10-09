package br.edu.ifpi.dominio;

public class Conta {

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

    public int getNumeroagencia() {
        return this.numeroAgencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public boolean setDepositar(double saldo) {
        this.saldo += saldo;
        return true;
    }

    public double setSacar(double saldo) {
        
        if (this.saldo < saldo) {
            System.out.println("Negado! Valor do saque maior que saldo da conta.");
            return saldo;
        }

        else {
            this.saldo -= saldo;
            return saldo;
        }

    }

    public void setTransferir(double saldo, Conta destinatario) {
        this.saldo -= saldo;
        destinatario.saldo += saldo;
    }

    public void getDadosConta() {
        System.out.println();
        System.out.println("Número da Agẽncia: " + getNumeroagencia());
        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Saldo: R$" + getsaldo());
        System.out.println("Proprietário: " + getCliente().getCpf());
        System.out.println();
    }

}
