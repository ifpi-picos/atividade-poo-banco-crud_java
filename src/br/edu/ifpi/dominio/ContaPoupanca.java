package br.edu.ifpi.dominio;

public class ContaPoupanca extends Conta {
    
    private double rendimento;

    public ContaPoupanca(int numeroAgencia, int numeroConta, double saldo, Cliente cliente, Notificacao notificacao, double rendimento) {

        super(numeroAgencia, numeroConta, saldo, cliente, notificacao);
        this.rendimento = rendimento;
    
    }

    @Override
    public boolean depositar(double deposito) {
        this.setRendimento((this.getSaldo() + deposito) * 0.10);
        return super.depositar(deposito);
    }

    @Override
    public double sacar(double saque) {
        this.setRendimento((this.getSaldo() - saque) * 0.10);
        return super.sacar(saque);
    }

    @Override
    public void transferir(double transferencia, Conta destinatario) {
        this.sacar(transferencia * 1.05);
        destinatario.depositar(transferencia);
        this.enviaNotificacao("Tranferência: ", transferencia * 1.05);
        destinatario.enviaNotificacao("Tranferência: ", transferencia);
    }

    public double getRendimento() {
        return this.rendimento;
    }

    public double setRendimento(double rendimento) {
        return this.rendimento = rendimento;
    }

    @Override
    public String toString() {
        return "[" + this.getNumeroAgencia() + ", " 
                   + this.getNumeroConta() + ", "
                   + this.getSaldo() + ", "
                   + this.getCliente() + ", "
                   + this.getNotificacao() + ", "
                   + this.getRendimento() + "]";
    }

}
