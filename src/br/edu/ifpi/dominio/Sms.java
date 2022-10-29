package br.edu.ifpi.dominio;

public class Sms implements Notificacao {
    @Override
    public void enviaNotificacao(String operacao, double valor) {
        
    }

    @Override
    public String toString() {
        return "SMS";
    }
}
