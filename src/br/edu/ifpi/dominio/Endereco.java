package br.edu.ifpi.dominio;

public class Endereco {
    
    private String logradouro;
    private int numeroCasa;
    private String bairro;
    private String cidade;
    private String uf;

    public String getLogradouro() {
        return this.logradouro;
    }

    public int getNumeroCasa() {
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

    public void getInfoEndereco() {
        System.out.println();
        System.out.println("Rua: " + this.logradouro);
        System.out.println("Número da Casa: " + this.numeroCasa);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("UF: " + this.uf);
        System.out.println();
    }

    public void setCriacaoEndereco(String logradouro, int numeroCasa, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

}
