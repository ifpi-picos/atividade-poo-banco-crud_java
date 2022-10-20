import br.edu.ifpi.dominio.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        //introdução

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        List<ContaPoupanca> contaPoupancas = new ArrayList<>();
        List<String> cpfsCC = new ArrayList<>();
        List<String> cpfsCP = new ArrayList<>();

        int opcao; int opConta;
                
        String nome, cpf, dtString; LocalDate dataNascimento;
                
        String logradouro, bairro, cidade, uf; int numero;

        System.out.println("\nBem-vindo ao Sistema do BancoMaut\n");
                
        while (true) {
            
            System.out.println("O que deseja fazer?");
            
            System.out.println("\n\t1 - Criar Conta\n\t2 - Acessar conta\n\t3 - Sair do Sistema\n");

            System.out.print("Informe sua opção aqui: ");
            opcao = scanner.nextInt();

            System.out.println();

            while (opcao < 1 || opcao > 3) {

                System.out.println("Opção Inválida!");
                
                System.out.println();

                System.out.println("O que deseja fazer?");
                
                System.out.println("\n\t1 - Criar Conta\n\t2 - Acessar conta\n\t3 - Sair do Sistema\n");

                System.out.print("Informe sua opção aqui: ");
                opcao = scanner.nextInt();

                System.out.println();

            }
            
            if (opcao == 1) {
                
                System.out.println("Opções de Conta: ");
                System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n");

                System.out.print("Informe sua opção aqui: ");
                opConta = scanner.nextInt();

                System.out.println();

                while (opConta < 1 || opConta > 2) {

                    System.out.println("Opção Inválida!");

                    System.out.println();

                    System.out.println("Opções de Conta: ");
                    
                    System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n");

                    System.out.print("Informe sua opção aqui: ");
                    opConta = scanner.nextInt();
                    
                    System.out.println();

                }

                System.out.println("Dados Pessoais");

                System.out.println();

                System.out.print("Seu nome: ");
                nome = scanner.nextLine();
                nome = scanner.nextLine();

                System.out.println();

                System.out.print("Seu CPF (XXX.XXX.XXX-XX): ");
                cpf = scanner.next();

                System.out.println();

                if (opConta == 1) {
                    
                    while (cpfsCC.contains(cpf) == true) {
                    
                        System.out.println("CPF já cadastrado no Sistema!");
    
                        System.out.println();
    
                        System.out.print("Seu CPF (XXX.XXX.XXX-XX): ");
                        cpf = scanner.next();
                        
                        System.out.println();
    
                    }

                    cpfsCC.add(cpf);
                    
                }

                if (opConta == 2) {

                    while (cpfsCP.contains(cpf) == true) {
                    
                        System.out.println("CPF já cadastrado no Sistema!");
    
                        System.out.println();
    
                        System.out.print("Seu CPF (XXX.XXX.XXX-XX): ");
                        cpf = scanner.next();
                        
                        System.out.println();
    
                    }

                    cpfsCP.add(cpf);

                }


                System.out.print("Sua data de nascimento (dia/mês/ano): ");
                dtString = scanner.next();

                String[] dtVetor = dtString.split("/");
                
                dataNascimento = LocalDate.of(Integer.parseInt(dtVetor[2]), 
                                              Integer.parseInt(dtVetor[1]), 
                                              Integer.parseInt(dtVetor[0]));

                System.out.println();

                System.out.println("\nDados Complementares\n");

                System.out.print("Rua: ");
                logradouro = scanner.nextLine();
                logradouro = scanner.nextLine();

                System.out.println();

                System.out.print("Número: ");
                numero = scanner.nextInt();
                    
                System.out.println();

                System.out.print("Bairro: ");
                bairro = scanner.nextLine();
                bairro = scanner.nextLine();

                System.out.println();

                System.out.print("Cidade: ");
                cidade = scanner.nextLine();

                System.out.println();

                System.out.print("Unidade Federativa: ");
                uf = scanner.next();

                System.out.println();
                    
                Endereco endereco = new Endereco(logradouro, numero, bairro, cidade, uf);
                
                Cliente cliente = new Cliente(cpf, nome, dataNascimento, endereco);

                int numeroAgencia = random.nextInt(10, 100);
                int numeroConta = random.nextInt(10000, 100000);

                if (opConta == 1) {

                    ContaCorrente contaCorrente = new ContaCorrente(numeroAgencia, 
                                                                    numeroConta, 
                                                                    0, 
                                                                    cliente, 
                                                                    1000);

                    contaCorrentes.add(contaCorrente);

                    System.out.println("Conta Corrente criada com sucesso!");
                    System.out.println();

                }

                if (opConta == 2) {

                    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroAgencia, 
                                                                    numeroConta, 
                                                                    0, 
                                                                    cliente, 
                                                                    0);

                    contaPoupancas.add(contaPoupanca);

                    System.out.println("Conta Poupança criada com sucesso!");
                    System.out.println();

                }

                //System.out.println(contaCorrentes.get(0).getCliente().getCpf());
                //System.out.println();

                System.out.println(contaCorrentes);
                System.out.println();

                System.out.println(contaPoupancas);
                System.out.println();

            }

            if (opcao == 3) {
                System.out.println("Sistema encerrado com sucesso!");
                break;
            }

        }

    }

}
