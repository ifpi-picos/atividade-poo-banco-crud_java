package br.edu.ifpi.dominio;

import java.time.LocalDate;

public class Cliente {

    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    
    public Cliente(String cpf, String nome, LocalDate dataNascimento, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }

}
