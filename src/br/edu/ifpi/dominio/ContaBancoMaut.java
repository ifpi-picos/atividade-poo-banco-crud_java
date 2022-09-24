package br.edu.ifpi.dominio;

public class ContaBancoMaut {  
    
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;
    private Cliente nomeCliente;

    public ContaBancoMaut(String numeroAgencia, String numeroConta, double saldo, Cliente nomeCliente) {
        
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;

    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public String getNumeroConta(String numeroConta) {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setDepositar(double saldo) {
        this.saldo = saldo;
    }

    public void setSacar(double saldo) {
        this.saldo = saldo;
    }

    public void setTransfirir(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getNomeCliente() {
        return this.nomeCliente;
    }
     
}
