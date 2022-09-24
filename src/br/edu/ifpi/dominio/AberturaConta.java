package br.edu.ifpi.dominio;

public class AberturaConta {
    
    private Cliente nomeCliente;
    private Cliente cpfCliente;
    private Cliente dataNascimentoCliente;
    private Cliente enderecoCliente;
    
    public AberturaConta(Cliente nomeCliente, Cliente cpfCliente, Cliente dataNascimentoCliente, Cliente enderecoCliente) {
        
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataNascimentoCliente = dataNascimentoCliente;
        this.enderecoCliente = enderecoCliente;
        
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public Cliente getCpfCliente() {
        return cpfCliente;
    }

    public Cliente getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public Cliente getEnderecoCliente() {
        return enderecoCliente;
    }
    
}
