package br.edu.ifpi.dominio;

import java.time.LocalDate;

public class Cliente {       
    
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String endereco;

    public Cliente(String nome, String cpf, LocalDate dataNascimento, String endereco) {       
        
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate datanascimento) {
        this.dataNascimento = datanascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
