package br.edu.ifpi.dominio;

public class Email implements Notificacao {  
    @Override
    public void enviaNotificacao(String operacao, double valor) {
        
    }

    @Override
    public String toString() {
        return "Email";
    }
}
