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
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
