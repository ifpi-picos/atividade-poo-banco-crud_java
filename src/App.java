import java.time.LocalDate;

import br.edu.ifpi.dominio.Cliente;
import br.edu.ifpi.dominio.Conta;
import br.edu.ifpi.dominio.Endereco;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cli1 = new Cliente("123.456.789-10", "João Carlos", LocalDate.of(2001, 1, 1), new Endereco(), new Conta());
        
        cli1.getEndereco().setCriacaoEndereco("Av. Nossa Sra. De Fátima", 518, "Centro", "Picos", "PI");

        cli1.getConta().setAberturaConta(101, 12309, 1000);

        cli1.getEndereco().getInfoEndereco();

        cli1.getConta().getInfoConta();

    }

}
