import br.edu.ifpi.dominio.*;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        //Endereço 1, Cliente 1, Conta 1:
        
        Endereco end1 = new Endereco("Av. Nosaa Sra. De Fátima", 518, "Centro", "Picos", "PI");
        
        Cliente cli1 = new Cliente("123.456.789-10", "João Carlos", LocalDate.of(2001, 2, 3), end1);

        System.out.println("\nEndereço do cliente " + cli1.getNome());
        cli1.getEndereco().getEnderecoCompleto();

        Conta c1 = new Conta(123, 200102, 1000, cli1);

        System.out.println("Dados da Conta do cliente " + c1.getCliente().getNome());

        c1.getDadosConta();

        System.out.println("Deposito realizado: " + c1.setDepositar(2000));
        System.out.println("Saldo atualizado da conta do cliente " + c1.getCliente().getNome() + ": R$" + c1.getsaldo());
        System.out.println();

        System.out.println("Saque no valor de R$" + c1.setSacar(100) + "...");
        System.out.println("Saldo atualizado da conta do cliente " + c1.getCliente().getNome() + ": R$" + c1.getsaldo());
        System.out.println();
        
        //Endereço 2, Cliente 2, Conta 2:

        Endereco end2 = new Endereco("Campo Norte", 732, "Centro", "Campinas", "SP");

        Cliente cli2 = new Cliente("019.876.543-21", "Paula", LocalDate.of(1995, 4, 23), end2);

        System.out.println("Endereço da cliente " + cli2.getNome());
        cli2.getEndereco().getEnderecoCompleto();

        Conta c2 = new Conta(987, 199504, 3400, cli2);

        System.out.println("Dados da Conta da cliente " + c2.getCliente().getNome());

        c2.getDadosConta();

        //Ações da Conta 1 e Conta 2:

        c1.setTransferir(1100, c2);
        System.out.println("Tranferẽcia da conta do cliente " + c1.getCliente().getNome() + " para a conta da cliente " + c2.getCliente().getNome() + "...");
        System.out.println();
        System.out.println("Saldo atualizado da conta do cliente " + c1.getCliente().getNome() + ": R$"  + c1.getsaldo());
        System.out.println("Saldo atualizado da conta do cliente " + c2.getCliente().getNome() + ": R$ " + c2.getsaldo());
        System.out.println();
        
    }

}
