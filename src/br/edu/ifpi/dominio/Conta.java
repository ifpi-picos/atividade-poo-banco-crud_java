package br.edu.ifpi.dominio;

public abstract class Conta {

    private int numeroAgencia;
    private int numeroConta;
    private double saldo;
    private Cliente cliente;
    private Notificacao notificacao;

    public Conta(int numeroAgencia, int numeroConta, double saldo, Cliente cliente, Notificacao notificacao) {

        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.notificacao = notificacao;

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

    public Notificacao getNotificacao() {
        return this.notificacao;
    }

    public boolean deposita(double saldo) {
        this.saldo += saldo;
        return true;
    }

    public double saca(double saldo) {
        this.saldo -= saldo;
        return saldo;
    }
    
    public void transfere(double saldo, Conta destinatario) {
        this.saldo -= saldo;
        destinatario.saldo += saldo;
    }

    public void enviaNotificacao(String operacao, double valor) {
        this.notificacao.enviaNotificacao(operacao, valor);
    }

}
