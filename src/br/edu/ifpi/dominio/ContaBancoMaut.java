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
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
     
}
