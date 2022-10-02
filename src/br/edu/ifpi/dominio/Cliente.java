package br.edu.ifpi.dominio;

import java.time.LocalDate;

public class Cliente {
    
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Conta conta;

    public Cliente(String cpf, String nome, LocalDate dataNascimento, Endereco endereco, Conta conta) {

        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = new Endereco();
        this.conta = new Conta();

    }

    public Cliente() {
        
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataNascimeno() {
        return this.dataNascimento;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public Conta getConta() {
        return this.conta;
    }

}
