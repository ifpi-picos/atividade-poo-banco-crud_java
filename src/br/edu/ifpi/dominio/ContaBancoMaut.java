package br.edu.ifpi.dominio;

public class ContaBancoMaut {  
    
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;
    private AberturaConta cpfCliente;

    public ContaBancoMaut(String numeroAgencia, String numeroConta, double saldo, AberturaConta cpfCliente) {
        
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

    public void setTransferir(double saldo, ContaBancoMaut c2) {
        this.saldo = this.saldo - saldo;
        c2.saldo = c2.saldo + saldo;
    } 

    public AberturaConta getcpfCliente() {
        return this.cpfCliente;
    }
     
}
