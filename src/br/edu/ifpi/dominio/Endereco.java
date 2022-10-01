package br.edu.ifpi.dominio;

public class Endereco {
    
    private String logradouro;
    private String numeroCasa;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String logradouro, String numeroCasa, String bairro, String cidade, String uf) {
        
        this.logradouro = logradouro;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getNumeroCasa() {
        return this.numeroCasa;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidadeUf() {
        return this.cidade;
    }

    public String getUf() {
        return this.uf;
    }
}
