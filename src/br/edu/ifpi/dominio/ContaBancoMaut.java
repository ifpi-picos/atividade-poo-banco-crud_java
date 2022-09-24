package br.edu.ifpi.dominio;

public class ContaBancoMaut {  
    
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;
    private Cliente cpfCliente;

    public ContaBancoMaut(String numeroAgencia, String numeroConta, double saldo, Cliente cpfCliente) {
        
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cpfCliente = cpfCliente;

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
        this.saldo =  this.saldo + saldo;
    }

    public void setSacar(double saldo) {
        this.saldo = this.saldo - saldo;
    }

    public Cliente getcpfCliente() {
        return this.cpfCliente;
    }
     
}
