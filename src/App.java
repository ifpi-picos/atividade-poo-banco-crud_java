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

        List<String> verificaCpfCc = new ArrayList<>();
        List<String> verificaCpfCp = new ArrayList<>();
        List<String> cpfs = new ArrayList<>();

        List<Integer> numeroAgenciaList = new ArrayList<>();
        List<Integer> numeroContaList = new ArrayList<>(); 

        int opcao, opConta, opNot, numeroAgencia, numeroConta;
                
        String nome, cpf, dtString; LocalDate dataNascimento;
                
        String logradouro, bairro, cidade, uf; int numero;

        Notificacao notificacao = null;

        System.out.println("\nBem-vindo ao Sistema do BancoMaut\n");
                
        while (true) {

            //MENU
            
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

            //CRIAR CONTA
            
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
                    
                    while (verificaCpfCc.contains(cpf) == true) {
                    
                        System.out.println("CPF já cadastrado no Sistema!");
    
                        System.out.println();
    
                        System.out.print("Seu CPF (XXX.XXX.XXX-XX): ");
                        cpf = scanner.next();
                        
                        System.out.println();
    
                    }

                    verificaCpfCc.add(cpf);
                    
                }

                if (opConta == 2) {

                    while (verificaCpfCp.contains(cpf) == true) {
                    
                        System.out.println("CPF já cadastrado no Sistema!");
    
                        System.out.println();
    
                        System.out.print("Seu CPF (XXX.XXX.XXX-XX): ");
                        cpf = scanner.next();
                        
                        System.out.println();
    
                    }

                    verificaCpfCp.add(cpf);

                }

                if (cpfs.contains(cpf) == false) {
                    cpfs.add(cpf);
                }

                System.out.print("Sua data de nascimento (DD/MM/AAAA): ");
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

                System.out.println("\nPor onde gostaria de receber Notificações?");

                System.out.println("\n\t1 - Email\n\t2 - SMS\n");

                System.out.print("Informe sua opção aqui: ");
                opNot = scanner.nextInt();

                System.out.println();

                while (opNot < 1 || opNot > 2) {
                    
                    System.out.println("Opção Inválida!");

                    System.out.println();

                    System.out.println("Por onde gostaria de receber Notificações?\n");
                    
                    System.out.println("\n\t1 - Email\n\t2 - SMS\n");
                    
                    System.out.print("Informe sua opção: aqui ");
                    opNot = scanner.nextInt();
                    
                    System.out.println();

                }

                if (opNot == 1) {
                    Notificacao email = new Email();
                    notificacao = email;
                }

                else if (opNot == 2) {
                    Notificacao sms = new Sms();
                    notificacao = sms;
                }
                    
                Endereco endereco = new Endereco(logradouro, numero, bairro, cidade, uf);
                
                Cliente cliente = new Cliente(cpf, nome, dataNascimento, endereco);

                numeroAgencia = random.nextInt(10, 100);
                numeroAgenciaList.add(numeroAgencia);

                numeroConta = random.nextInt(10000, 100000);

                while (numeroContaList.contains(numeroConta) == true) {
                    numeroConta = random.nextInt(10000, 100000);
                }

                numeroContaList.add(numeroConta);

                if (opConta == 1) {

                    ContaCorrente contaCorrente = new ContaCorrente(numeroAgencia,
                                                                    numeroConta,
                                                                    numeroConta,
                                                                    cliente,
                                                                    notificacao,
                                                                    1000);

                    contaCorrentes.add(contaCorrente);

                    System.out.println("Conta Corrente criada com sucesso!");
                    
                    System.out.println();

                    System.out.println("Número da Agẽncia: " + numeroAgencia);
                    System.out.println("Número da Conta: " + numeroConta);

                    System.out.println();

                }

                if (opConta == 2) {

                    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroAgencia,
                                                                    numeroConta,
                                                                    numeroConta,
                                                                    cliente,
                                                                    notificacao,
                                                                    0);

                    contaPoupancas.add(contaPoupanca);

                    System.out.println("Conta Poupança criada com sucesso!");
                    
                    System.out.println();

                    System.out.println("Número da Agẽncia: " + numeroAgencia);
                    System.out.println("Número da Conta: " + numeroConta);

                    System.out.println();

                }

                System.out.println();

            }

            //ACESSAR CONTA

            if (opcao == 2) {

            }

            //SAIR DO SISTEMA

            if (opcao == 3) {
                
                System.out.println("Sistema encerrado com sucesso!");
                System.out.println();

                break;
                
            }

        }

        scanner.close();

    }

}
