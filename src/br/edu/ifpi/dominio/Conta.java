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

    public boolean depositar(double deposito) {
        this.saldo += deposito;
        this.enviaNotificacao("Depósito: ", deposito);
        return true;
    }

    public double sacar(double saque) {
        this.saldo -= saque;
        this.enviaNotificacao("Saque: ", saque);
        return saque;
    }
    
    public void transferir(double transferencia, Conta destinatario) {
        this.sacar(transferencia);
        destinatario.depositar(transferencia);
        this.enviaNotificacao("Tranferência: ", transferencia);
    }

    public void enviaNotificacao(String operacao, double valor) {
        this.notificacao.enviaNotificacao(operacao, valor);
    }

}
