import br.edu.ifpi.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        //introdução

        //Declarações de Objetos:

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        List<ContaCorrente> contaCorrentes = new ArrayList<>();

        List<ContaPoupanca> contaPoupancas = new ArrayList<>();       

        List<String> cpfs = new ArrayList<>();

        List<Integer> numeroAgenciaList = new ArrayList<>();

        List<Integer> numeroContaList = new ArrayList<>();

        //Declarações de variáveis:

        int opN1, opN2, opN3, opN4, opN5, opN6, cont = 1;

        double deposito, saque, transferencia, taxa = 0.05;
                
        String cpf, nome, dtString; LocalDate dataNascimento;
                
        String logradouro; int numero; String bairro, cidade, uf;

        Notificacao notificacao = null;

        int numeroAgencia, numeroConta; double saldo = 0, chequeEspecial = 1000, rendimento = 0;

        System.out.println("\n>>>>> SISTEMA DO BANCO MAUT <<<<<\n");
                
        while (true) {

            //MENU INCIAL
            
            System.out.println("\n[MENU INICIAL]\n");

            System.out.println();

            System.out.println("Opções:");
            
            System.out.println("\n\t1 - Criar Conta\n\t2 - Acessar conta\n\t3 - Sair do Sistema");

            System.out.println();

            System.out.print("Informe sua opção aqui: ");
            opN1 = scanner.nextInt();

            while (opN1 < 1 || opN1 > 3) {

                System.out.println("\nOpção Inválida!\n");

                System.out.println();

                System.out.println("Opções:");
                
                System.out.println("\n\t1 - Criar Conta\n\t2 - Acessar conta\n\t3 - Sair do Sistema");

                System.out.println();

                System.out.print("Informe sua opção aqui: ");
                opN1 = scanner.nextInt();

            }

            System.out.println();

            //CRIAR CONTA
            
            if (opN1 == 1) {

                while (true) {

                    System.out.println("\n[CRIAR CONTA]\n");

                    System.out.println();

                    System.out.println("Opções: ");
                    
                    System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para MENU INICIAL");

                    System.out.println();
    
                    System.out.print("Informe sua opção aqui: ");
                    opN2 = scanner.nextInt();
    
                    while (opN2 < 1 || opN2 > 3) {
    
                        System.out.println("\nOpção Inválida!\n");
    
                        System.out.println("Opções: ");
                        
                        System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para MENU INICIAL");

                        System.out.println();
    
                        System.out.print("Informe sua opção aqui: ");
                        opN2 = scanner.nextInt();
    
                    }

                    System.out.println();

                    if (opN2 == 1 || opN2 == 2) {

                        System.out.println("\nDADOS PESSOAIS\n");
        
                        System.out.print("Nome: ");
                        nome = scanner.nextLine();
                        nome = scanner.nextLine();
        
                        System.out.println();
        
                        System.out.print("CPF (XXX.XXX.XXX-XX): ");
                        cpf = scanner.next();
        
                        if (opN2 == 1) {
        
                            for (ContaCorrente iterable_element : contaCorrentes) {
        
                                while (cpf.equals(iterable_element.getCliente().getCpf())) {
        
                                    System.out.println("\nCPF já cadastrado no Sistema!\n");

                                    System.out.println();
        
                                    System.out.print("CPF (XXX.XXX.XXX-XX): ");
                                    cpf = scanner.next();
        
                                }
        
                            }
        
                        }
        
                        else if (opN2 == 2) {
        
                            for (ContaPoupanca iterable_element : contaPoupancas) {
        
                                while (cpf.equals(iterable_element.getCliente().getCpf())) {
        
                                    System.out.println("\nCPF já cadastrado no Sistema!\n");

                                    System.out.println();
        
                                    System.out.print("CPF (XXX.XXX.XXX-XX): ");
                                    cpf = scanner.next();
        
                                }
        
                            }
        
                        }

                        System.out.println();
        
                        if (cpfs.contains(cpf) == false) {
                            cpfs.add(cpf);
                        }
        
                        System.out.print("Data de nascimento (DD/MM/AAAA): ");
                        dtString = scanner.next();
        
                        String[] dtVetor = dtString.split("/");
                        
                        dataNascimento = LocalDate.of(Integer.parseInt(dtVetor[2]), 
                                                      Integer.parseInt(dtVetor[1]), 
                                                      Integer.parseInt(dtVetor[0]));
        
                        System.out.println();
        
                        System.out.println("\nDADOS COMPLEMENTARES\n");
        
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
        
                        System.out.println("\nRECEBIMENTO DE NOTIFICAÇÕES\n");

                        System.out.println("Opções:");
        
                        System.out.println("\n\t1 - Email\n\t2 - SMS");

                        System.out.println();
        
                        System.out.print("Informe sua opção aqui: ");
                        opN3 = scanner.nextInt();
        
                        while (opN3 < 1 || opN3 > 2) {
                            
                            System.out.println("\nOpção Inválida!\n");
        
                            System.out.println("Opções:");
                            
                            System.out.println("\n\t1 - Email\n\t2 - SMS");

                            System.out.println();
                            
                            System.out.print("Informe sua opção: aqui ");
                            opN3 = scanner.nextInt();
        
                        }

                        System.out.println();
        
                        if (opN3 == 1) {
                            Notificacao email = new Email();
                            notificacao = email;
                        }
        
                        else if (opN3 == 2) {
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
        
                        if (opN2 == 1) {
        
                            ContaCorrente contaCorrente = new ContaCorrente(numeroAgencia,
                                                                            numeroConta,
                                                                            saldo,
                                                                            cliente,
                                                                            notificacao,
                                                                            chequeEspecial);
        
                            contaCorrentes.add(contaCorrente);

                            System.out.println("\nConta Corrente criada com SUCESSO!");
        
                        }
        
                        else if (opN2 == 2) {
        
                            ContaPoupanca contaPoupanca = new ContaPoupanca(numeroAgencia,
                                                                            numeroConta,
                                                                            saldo,
                                                                            cliente,
                                                                            notificacao,
                                                                            rendimento);
        
                            contaPoupancas.add(contaPoupanca);
        
                            System.out.println("\nConta Poupança criada com SUCESSO!");
        
                        }

                    }

                    else {
                        break;
                    }

                    System.out.println();
    
                }

            }

            //ACESSAR CONTA

            if (opN1 == 2) {

                while (true) {
                    
                    System.out.println("\n[ACESSAR CONTA]\n");
    
                    System.out.println();
    
                    System.out.println("Opções:");
        
                    System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para MENU INICIAL");
    
                    System.out.println();
        
                    System.out.print("Informe sua opção aqui: ");
                    opN2 = scanner.nextInt();
        
                    while (opN2 < 1 || opN2 > 3) {
        
                        System.out.println("\nOpção Inválida!\n");

                        System.out.println();

                        System.out.println("Opções:");
                            
                        System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para MENU INICIAL");
    
                        System.out.println();
                            
                        System.out.print("Informe sua opção aqui: ");
                        opN2 = scanner.nextInt();
        
                    }
    
                    System.out.println();

                    if (opN2 == 1 || opN2 == 2) {

                        System.out.println("\nLOGIN\n");

                        System.out.println();

                        System.out.print("CPF (XXX.XXX.XXX-XX): ");
                        cpf = scanner.next();
        
                        while (cpfs.contains(cpf) == false) {
                            
                            System.out.println("\nCPF informado não cadastrado no Sistema!\n");
        
                            System.out.println();
                            
                            System.out.print("CPF (XXX.XXX.XXX-XX): ");
                            cpf = scanner.next();

                        }
        
                        System.out.println();

                        //ACESSO A CONTA CORRENTE
        
                        if (opN2 == 1) {
        
                            for (ContaCorrente iterable_element : contaCorrentes) {
        
                                if (cpf.equals(iterable_element.getCliente().getCpf())) {

                                    //MENU PRINCIPAL
        
                                    while (true) {
        
                                        System.out.println("\n[MENU PRINCIPAL DA CONTA CORRENTE]\n");
                        
                                        System.out.println();
                                        
                                        System.out.println("Proprietário(a): " + iterable_element.getCliente().getNome());
                        
                                        System.out.println();
                                        
                                        System.out.println("Número Agência: " + iterable_element.getNumeroAgencia());
                                        System.out.println("Número Conta: " + iterable_element.getNumeroConta());
                                        System.out.println("Saldo: " + iterable_element.getSaldo());
                        
                                        System.out.println();
                        
                                        System.out.println("Opções:");
                        
                                        System.out.println("\n\t1 - Acessar Dados\n\t2 - Realizar Operações\n\t3 - Sair da Conta");
                        
                                        System.out.println();
                        
                                        System.out.print("Infome sua opção aqui: ");
                                        opN3 = scanner.nextInt();
                        
                                        while (opN3 < 1 || opN3 > 3) {
                        
                                            System.out.println("\nOpção Inválida!\n");
        
                                            System.out.println();
                        
                                            System.out.println("Opções:");
                        
                                            System.out.println("\n\t1 - Acessar Dados\n\t2 - Realizar Operações\n\t3 - Sair da Conta");
                        
                                            System.out.println();
                        
                                            System.out.print("Infome sua opção aqui: ");
                                            opN3 = scanner.nextInt();
        
                                        }
                                        
                                        System.out.println();
        
                                        if (opN3 == 1) {
        
                                            while (true) {
        
                                                System.out.println("\nDADOS DA CONTA\n");
        
                                                System.out.println();
                                                
                                                System.out.println("Opções:");
                                
                                                System.out.println("\n\t1 - Número da Agência\n\t2 - Número da Conta\n\t3 - Saldo\n\t4 - Cliente\n\t5 - Cheque Especial\n\t6 - Recebimento de Notificação\n\t7 - Voltar para MENU PRINCIPAL");
                                
                                                System.out.println();
                                
                                                System.out.print("Informe sua opção aqui: ");
                                                opN4 = scanner.nextInt();
                                
                                                while (opN4 < 1 || opN4 > 7) {
                                
                                                    System.out.println("\nOpção Inválida!\n");
                                
                                                    System.out.println();

                                                    System.out.println("Opções:");
                                
                                                    System.out.println("\n\t1 - Número da Agência\n\t2 - Número da Conta\n\t3 - Saldo\n\t4 - Cliente\n\t5 - Cheque Especial\n\t6 - Recebimento de Notificação\n\t7 - Voltar para MENU PRINCIPAL");
                                                    
                                                    System.out.println();
                                
                                                    System.out.print("Informe sua opção aqui: ");
                                                    opN4 = scanner.nextInt();
                                
                                                }
                                                
                                                System.out.println("\n");
                                                
                                                if (opN4 == 1) {
                                                    System.out.println("--> Número da Agência: " + iterable_element.getNumeroAgencia());
                                                }
                                
                                                else if (opN4 == 2) {
                                                    System.out.println("--> Número da Conta: " + iterable_element.getNumeroConta());
                                                }
                                
                                                else if (opN4 == 3) {
                                                    System.out.println(" --> Saldo: " + iterable_element.getSaldo());
                                                }
        
                                                else if (opN4 == 4) {
                                
                                                    while (true) {
                                                        
                                                        System.out.println("\nDADOS DO CLIENTE\n");
        
                                                        System.out.println();
        
                                                        System.out.println("Opções:");
                                
                                                        System.out.println("\n\t1 - CPF\n\t2 - Nome\n\t3 - Data de Nascimento\n\t4 - Endereço\n\t5 - Voltar para DADOS DA CONTA");
                                
                                                        System.out.println();
                                
                                                        System.out.print("Informe sua opção aqui: ");
                                                        opN5 = scanner.nextInt();
                                
                                                        while (opN5 < 1 || opN5 > 5) {
                                
                                                            System.out.println("\nOpção Inválida!\n");
        
                                                            System.out.println();
                                
                                                            System.out.println("Opcões:");
                                
                                                            System.out.println("\n\t1 - CPF\n\t2 - Nome\n\t3 - Data de Nascimento\n\t4 - Endereço\n\t5 - Voltar para DADOS DA CONTA");
                                
                                                            System.out.println();
                                
                                                            System.out.print("Informe sua opção aqui: ");
                                                            opN5 = scanner.nextInt();
                                
                                                        }
                                
                                                        System.out.println("\n");
        
                                                        if (opN5 == 1) {
                                                            System.out.println("--> CPF: " + iterable_element.getCliente().getCpf());
                                                        }
                                        
                                                        else if (opN5 == 2) {
                                                            System.out.println("--> Nome: " + iterable_element.getCliente().getNome());
                                                        }
                                        
                                                        else if (opN5 == 3) {
                                                            System.out.println("--> Data de Nascimento: " + iterable_element.getCliente().getDataNascimento());
                                                        }
        
                                                        else if (opN5 == 4) {
                                        
                                                            while (true) {
                                                                          
                                                                System.out.println("\nDADOS DO ENDEREÇO\n");
                                        
                                                                System.out.println();
                                        
                                                                System.out.println("Opções:");
                                        
                                                                System.out.println("\n\t1 - Rua\n\t2 - Número\n\t3 - Bairro\n\t4 - Cidade\n\t5 - Unidade Federativa\n\t6 - Voltar para DADOS CLIENTE");
                                        
                                                                System.out.println();
                                        
                                                                System.out.print("Informe sua opção aqui: ");
                                                                opN6 = scanner.nextInt();
                                        
                                                                while (opN6 < 1 || opN6 > 6) {
                                        
                                                                    System.out.println("\nOpção Inválida!\n");
                                        
                                                                    System.out.println();
                                        
                                                                    System.out.println("Opções:");
                                        
                                                                    System.out.println("\n\t1 - Rua\n\t2 - Número\n\t3 - Bairro\n\t4 - Cidade\n\t5 - Unidade Federativa\n\t6 - Voltar para DADOS CLIENTE");
                                        
                                                                    System.out.println();
                                        
                                                                    System.out.print("Informe sua opção aqui: ");
                                                                    opN6 = scanner.nextInt();
                                                                    
                                                                }
                                        
                                                                System.out.println("\n");
                                        
                                                                if (opN6 == 1) {
                                                                    System.out.println("--> Rua: " +iterable_element.getCliente().getEndereco().getLogradouro());
                                                                }
                                        
                                                                else if (opN6 == 2) {
                                                                    System.out.println("--> Número: " +iterable_element.getCliente().getEndereco().getNumero());
                                                                }
                                        
                                                                else if (opN6 == 3) {
                                                                    System.out.println("--> Bairro: " +iterable_element.getCliente().getEndereco().getBairro());
                                                                }
                                        
                                                                else if (opN6 == 4) {
                                                                    System.out.println("--> Cidade: " +iterable_element.getCliente().getEndereco().getCidade());
                                                                }
                                        
                                                                else if (opN6 == 5) {
                                                                    System.out.println("--> Unidade Federativa: " +iterable_element.getCliente().getEndereco().getUf());
                                                                }
                                        
                                                                else {
                                                                    break;
                                                                }
    
                                                                System.out.println();
                                           
                                                            }
                                        
                                                        }
        
                                                        else {
                                                            break;
                                                        }
    
                                                        System.out.println();
        
                                                    }
    
                                                }
        
                                                else if (opN4 == 5) {
                                                    System.out.println("--> Cheque Especial: " + iterable_element.getChequeEspecial());
                                                }
        
                                                else if (opN4 == 6) {
                                                    System.out.println("--> Recebimento de Notificações: " + iterable_element.getNotificacao());
                                                }
        
                                                else {
                                                    break;
                                                }
    
                                                System.out.println();
                                            
                                            }
    
                                        }
        
                                        else if (opN3 == 2) {

                                            while (true) {
                                                
                                                System.out.println("\nOPERAÇÕES\n");
    
                                                System.out.println();
    
                                                System.out.println("Opções:");
    
                                                System.out.println("\n\t1 - Depositar\n\t2 - Sacar\n\t3 - Transferir\n\t4 - Voltar para MENU PRINCIPAL");
    
                                                System.out.println();
    
                                                System.out.print("Informe sua opção aqui: ");
                                                opN4 = scanner.nextInt();
    
                                                while (opN4 < 1 || opN4 > 4) {
    
                                                    System.out.println("\nOpção Inválida!\n");
    
                                                    System.out.println();
                                                    
                                                    System.out.println("Opções:");
                                                    
                                                    System.out.println("\n\t1 - Depositar\n\t2 - Sacar\n\t3 - Transferir\n\t4 - Voltar para MENU PRINCIPAL");
                                                    
                                                    System.out.println();
                                                    
                                                    System.out.print("Informe sua opção aqui: ");
                                                    opN4 = scanner.nextInt();
    
                                                }
    
                                                System.out.println();
    
                                                if (opN4 == 1) {

                                                    System.out.println("\nDEPÓSITO\n");

                                                    System.out.println();
                                                    
                                                    System.out.print("Digite o valor do depósito: ");
                                                    deposito = scanner.nextDouble();
    
                                                    System.out.println();

                                                    System.out.println("Depósito realizado: " + iterable_element.depositar(deposito));

                                                }

                                                else if (opN4 == 2) {

                                                    System.out.println("\nSAQUE\n");

                                                    System.out.println();
                                                    
                                                    System.out.print("Digite o valor do saque: ");
                                                    saque = scanner.nextDouble();

                                                    if (saque > iterable_element.getSaldo()) {

                                                        while (true) {
                                                            
                                                            System.out.println("\nValor informado superior ao Saldo da Conta!\n");
    
                                                            System.out.println("Saldo da Conta: " + iterable_element.getSaldo());

                                                            System.out.println("\n");

                                                            System.out.println("Opções:");

                                                            System.out.println("\n\t1 - Informar um Valor igual ou inferior\n\t2 - Usar Cheque Especial\n\t3 - Voltar para OPERAÇÕES");

                                                            System.out.println();

                                                            System.out.print("Informe sua opção aqui: ");
                                                            opN5 = scanner.nextInt();

                                                            while (opN5 < 1 || opN5 > 3) {

                                                                System.out.println("\nOpção Inválida!\n");

                                                                System.out.println();

                                                                System.out.println("Opções:");

                                                                System.out.println("\n\t1 - Informar um Valor igual ou inferior\n\t2 - Usar Cheque Especial\n\t3 - Voltar para OPERAÇÕES");

                                                                System.out.print("Informe sua opção aqui: ");
                                                                opN5 = scanner.nextInt();
                                                                
                                                            }

                                                            System.out.println();

                                                            if (opN5 == 1) {

                                                                System.out.println();
                                                                
                                                                System.out.print("Digite o Valor do saque: ");
                                                                saque = scanner.nextDouble();

                                                                while (saque > iterable_element.getSaldo()) {
                                                                    
                                                                    System.out.println("\nInforme um Valor igual ou inferior ao Saldo da Conta!\n");

                                                                    System.out.println("Saldo da Conta: " + iterable_element.getSaldo());

                                                                    System.out.println("\n");

                                                                    System.out.print("Digite o Valor do saque: ");
                                                                    saque = scanner.nextDouble();

                                                                }

                                                                System.out.println();

                                                                System.out.println("Saque: " + iterable_element.sacar(saque));

                                                                break;

                                                            }

                                                            else if (opN5 == 2) {

                                                                System.out.println();

                                                                System.out.println("Valor do Cheque Especial: " + iterable_element.getChequeEspecial());

                                                                System.out.println();

                                                                System.out.print("Digite o Valor do saque: ");
                                                                saque = scanner.nextDouble();

                                                                while ((saque - iterable_element.getSaldo()) > iterable_element.getChequeEspecial()) {
                                                                    
                                                                    System.out.println("\nSaque informado utrapassou o valor do Cheque Especial!\n");

                                                                    System.out.println();

                                                                    System.out.print("Digite o Valor do saque: ");
                                                                    saque = scanner.nextDouble();

                                                                }

                                                                System.out.println();

                                                                System.out.println("Saque: " + iterable_element.sacar(saque));
                                                                
                                                                iterable_element.setChequeEspecial(saque - iterable_element.getSaldo());

                                                                break;

                                                            }

                                                            else {
                                                                break;
                                                            }

                                                        }

                                                    }

                                                    else {
                                                        System.out.println("\nSaque: " + iterable_element.sacar(saque));
                                                    }

                                                }

                                                else if (opN4 == 3) {

                                                    while (true) {
                                                        
                                                        System.out.println("\nTRANFERÊNCIA\n");
    
                                                        System.out.println();
    
                                                        System.out.println("Opções:");
    
                                                        System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para OPERAÇÕES");
    
                                                        System.out.println();
    
                                                        System.out.print("Informe sua opção aqui: ");
                                                        opN5 = scanner.nextInt();
    
                                                        while (opN5 < 1 || opN5 > 3) {
    
                                                            System.out.println("\nOpção Inválida!\n");
    
                                                            System.out.println();
    
                                                            System.out.println("Opções:");
    
                                                            System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para OPERAÇÕES");
        
                                                            System.out.println();
        
                                                            System.out.print("Informe sua opção aqui: ");
                                                            opN5 = scanner.nextInt();
                                                            
                                                        }
    
                                                        System.out.println();

                                                        if (opN5 == 1) {

                                                            if (contaCorrentes.size() > 1) {
                                                                
                                                                System.out.println("\nPara qual Conta deseja Transferir?\n");
                                                                
                                                                for (ContaCorrente iterable_element2 : contaCorrentes) {
    
                                                                    if (iterable_element.getNumeroConta() != iterable_element2.getNumeroConta()) {
        
                                                                        System.out.println("\n\tDestinatário(a): " + iterable_element2.getCliente().getNome());
        
                                                                        System.out.println();
        
                                                                        System.out.println("\tNúmero da Agência: " + iterable_element2.getNumeroAgencia());
                                                                        System.out.println("\tNúmero da Conta: " + iterable_element2.getNumeroConta());
    
                                                                    }
                                                                                       
                                                                }
    
                                                                System.out.println("\n");
    
                                                                System.out.print("Digite o Número da Agência: ");
                                                                numeroAgencia = scanner.nextInt();
    
                                                                System.out.print("Digite o Número da Conta: ");
                                                                numeroConta = scanner.nextInt();
    
                                                                while (numeroAgenciaList.contains(numeroAgencia) == false || numeroContaList.contains(numeroConta) == false) {
                                                                    
                                                                    System.out.println("\nConta não Encontrada!\n");
    
                                                                    System.out.println();
    
                                                                    System.out.print("Digite o Número da Agência: ");
                                                                    numeroAgencia = scanner.nextInt();
        
                                                                    System.out.print("Digite o Número da Conta: ");
                                                                    numeroConta = scanner.nextInt();
    
                                                                }
    
                                                                System.out.println();
    
                                                                System.out.print("Digite o valor da transferência: ");
                                                                transferencia = scanner.nextDouble();

                                                                if (cont < 3) {
                                                                    
                                                                    while (transferencia > iterable_element.getSaldo() ) {
                                                                        
                                                                        System.out.println("\nValor da Transferência superior a Saldo da Conta!\n");
        
                                                                        System.out.println("Saldo da Conta: " + iterable_element.getSaldo());
        
                                                                        System.out.println();
        
                                                                        System.out.print("Digite o valor da transferência: ");
                                                                        transferencia = scanner.nextDouble();
        
                                                                    }
        
                                                                    System.out.println();
        
                                                                    for (ContaCorrente iterable_element2 : contaCorrentes) {
        
                                                                        if (numeroAgencia == iterable_element2.getNumeroAgencia() && numeroConta == iterable_element2.getNumeroConta()) {
                                                                            iterable_element.transferir(transferencia, iterable_element2);
                                                                        }
                                                                        
                                                                    }

                                                                }

                                                                else {

                                                                    while ((transferencia + (transferencia * taxa))  > iterable_element.getSaldo() ) {
                                                                        
                                                                        System.out.println("\nValor da Transferência superior a Saldo da Conta!\n");
        
                                                                        System.out.println("Saldo da Conta: " + iterable_element.getSaldo());
        
                                                                        System.out.println();
        
                                                                        System.out.print("Digite o valor da transferência: ");
                                                                        transferencia = scanner.nextDouble();
        
                                                                    }
        
                                                                    System.out.println();
        
                                                                    for (ContaCorrente iterable_element2 : contaCorrentes) {
        
                                                                        if (numeroAgencia == iterable_element2.getNumeroAgencia() && numeroConta == iterable_element2.getNumeroConta()) {
                                                                            iterable_element.sacar(transferencia * taxa);
                                                                            iterable_element.transferir(transferencia, iterable_element2);
                                                                        }
                                                                        
                                                                    }
                                                                }
    
    
                                                                cont ++;
                                                                
                                                            }

                                                            else {
                                                                System.out.println("\nNenhuma Conta Corrente a mais Cadastrada no Sistema!\n");
                                                            }
                                                            
                                                        }

                                                        else if (opN5 == 2) {

                                                            if (contaPoupancas.size() > 0) {
                                                                
                                                                System.out.println("\nPara qual Conta deseja Transferir?\n");
                                                                
                                                                for (ContaPoupanca iterable_element2 : contaPoupancas) {
    
                                                                    if (iterable_element.getNumeroConta() != iterable_element2.getNumeroConta()) {
        
                                                                        System.out.println("\n\tDestinatário(a): " + iterable_element2.getCliente().getNome());
        
                                                                        System.out.println();
        
                                                                        System.out.println("\tNúmero da Agência: " + iterable_element2.getNumeroAgencia());
                                                                        System.out.println("\tNúmero da Conta: " + iterable_element2.getNumeroConta());
    
                                                                    }
                                                                                       
                                                                }
    
                                                                System.out.println("\n");
    
                                                                System.out.print("Digite o Número da Agência: ");
                                                                numeroAgencia = scanner.nextInt();
    
                                                                System.out.print("Digite o Número da Conta: ");
                                                                numeroConta = scanner.nextInt();
    
                                                                while (numeroAgenciaList.contains(numeroAgencia) == false || numeroContaList.contains(numeroConta) == false) {
                                                                    
                                                                    System.out.println("\nConta não Encontrada!\n");
    
                                                                    System.out.println();
    
                                                                    System.out.print("Digite o Número da Agência: ");
                                                                    numeroAgencia = scanner.nextInt();
        
                                                                    System.out.print("Digite o Número da Conta: ");
                                                                    numeroConta = scanner.nextInt();
    
                                                                }
    
                                                                System.out.println();
    
                                                                System.out.print("Digite o valor da transferência: ");
                                                                transferencia = scanner.nextDouble();

                                                                if (cont < 3) {
                                                                    
                                                                    while (transferencia > iterable_element.getSaldo() ) {
                                                                        
                                                                        System.out.println("\nValor da Transferência superior a Saldo da Conta!\n");
        
                                                                        System.out.println("Saldo da Conta: " + iterable_element.getSaldo());
        
                                                                        System.out.println();
        
                                                                        System.out.print("Digite o valor da transferência: ");
                                                                        transferencia = scanner.nextDouble();
        
                                                                    }
        
                                                                    System.out.println();
        
                                                                    for (ContaPoupanca iterable_element2 : contaPoupancas) {
        
                                                                        if (numeroAgencia == iterable_element2.getNumeroAgencia() && numeroConta == iterable_element2.getNumeroConta()) {
                                                                            iterable_element.transferir(transferencia, iterable_element2);
                                                                            iterable_element2.setRendimento(iterable_element2.getSaldo() * 0.10);
                                                                        }

                                                                        else {
                                                                            System.out.println("\nNúmero da Agência ou Número da Conta!\n");
                                                                        }
                                                                        
                                                                    }
                                                                }

                                                                else {

                                                                    while ((transferencia + (transferencia * taxa)) > iterable_element.getSaldo() ) {
                                                                        
                                                                        System.out.println("\nValor da Transferência superior a Saldo da Conta!\n");
        
                                                                        System.out.println("Saldo da Conta: " + iterable_element.getSaldo());
        
                                                                        System.out.println();
        
                                                                        System.out.print("Digite o valor da transferência: ");
                                                                        transferencia = scanner.nextDouble();
        
                                                                    }
        
                                                                    System.out.println();
        
                                                                    for (ContaPoupanca iterable_element2 : contaPoupancas) {
        
                                                                        if (numeroAgencia == iterable_element2.getNumeroAgencia() && numeroConta == iterable_element2.getNumeroConta()) {
                                                                            iterable_element.sacar(transferencia * taxa);
                                                                            iterable_element.transferir(transferencia, iterable_element2);
                                                                            iterable_element2.setRendimento(iterable_element2.getSaldo() * 0.10);
                                                                        }
                                                                        
                                                                    }

                                                                }
    
                                                                cont ++;

                                                            }

                                                            else {
                                                                System.out.println("\nNenhuma Conta Poupança Cadastrada no Sistema!\n");
                                                            }
                                                            
                                                        }

                                                        else {
                                                            break;
                                                        }

                                                    }
                                                    
                                                }

                                                else {
                                                    break;
                                                }

                                                System.out.println();

                                            }

                                        }
        
                                        else {
                                            cont = 1;
                                            break;
                                        }
    
                                        System.out.println();
    
                                    }
                                
                                }

                                else {
                                    System.out.println("\nNenhuma Conta Corrente Cadastrada com esse CPF!\n");
                                }
    
                            }
    
                        }

                        //ACESSO A CONTA POUPANÇA
    
                        else if (opN2 == 2) {
        
                            for (ContaPoupanca iterable_element : contaPoupancas) {
        
                                if (cpf.equals(iterable_element.getCliente().getCpf())) {

                                    //MENU PRINCIPAL
        
                                    while (true) {
        
                                        System.out.println("\nMENU PRINCIPAL DA CONTA POUPANÇA\n");
                        
                                        System.out.println();
                                        
                                        System.out.println("Proprietário(a): " + iterable_element.getCliente().getNome());
                        
                                        System.out.println();
                                        
                                        System.out.println("Número Agência: " + iterable_element.getNumeroAgencia());
                                        System.out.println("Número Conta: " + iterable_element.getNumeroConta());
                                        System.out.println("Saldo: " + iterable_element.getSaldo());
                        
                                        System.out.println();
                        
                                        System.out.println("Opções:");
                        
                                        System.out.println("\n\t1 - Acessar Dados\n\t2 - Operações\n\t3 - Sair da Conta");
                        
                                        System.out.println();
                        
                                        System.out.print("Infome sua opção aqui: ");
                                        opN3 = scanner.nextInt();
                        
                                        while (opN3 < 1 || opN3 > 3) {
                        
                                            System.out.println("\nOpção Inválida!\n");
        
                                            System.out.println();
                        
                                            System.out.println("Opções:");
                        
                                            System.out.println("\n\t1 - Acessar Dados\n\t2 - Operações\n\t3 - Sair da Conta");
                        
                                            System.out.println();
                        
                                            System.out.print("Infome sua opção aqui: ");
                                            opN3 = scanner.nextInt();
        
                                        }
                                        
                                        System.out.println();
        
                                        if (opN3 == 1) {
        
                                            while (true) {
        
                                                System.out.println("DADOS DA CONTA");
        
                                                System.out.println();
                                                
                                                System.out.println("Opções:");
                                
                                                System.out.println("\n\t1 - Número da Agência\n\t2 - Número da Conta\n\t3 - Saldo\n\t4 - Cliente\n\t5 - Rendimento\n\t6 - Recebimento de Notificação\n\t7 - Voltar para MENU PRINCIPAL");
                                
                                                System.out.println();
                                
                                                System.out.print("Informe sua opção aqui: ");
                                                opN4 = scanner.nextInt();
                                
                                                while (opN4 < 1 || opN4 > 7) {
                                
                                                    System.out.println("\nOpção Inválida!\n");
                                
                                                    System.out.println("DADOS DA CONTA:");
                                
                                                    System.out.println("\n\t1 - Número da Agência\n\t2 - Número da Conta\n\t3 - Saldo\n\t4 - Cliente\n\t5 - Rendimento\n\t6 - Recebimento de Notificação\n\t7 - Voltar para MENU PRINCIPAL");
                                                    
                                                    System.out.println();
                                
                                                    System.out.print("Informe sua opção aqui: ");
                                                    opN4 = scanner.nextInt();
                                
                                                }
                                                
                                                System.out.println("\n");
                                                
                                                if (opN4 == 1) {
                                                    System.out.println("--> Número da Agência: " + iterable_element.getNumeroAgencia());
                                                }
                                
                                                else if (opN4 == 2) {
                                                    System.out.println("--> Número da Conta: " + iterable_element.getNumeroConta());
                                                }
                                
                                                else if (opN4 == 3) {
                                                    System.out.println("--> Saldo: " + iterable_element.getSaldo());
                                                }
        
                                                else if (opN4 == 4) {
                                
                                                    while (true) {
                                                        
                                                        System.out.println("DADOS DO CLIENTE:");
        
                                                        System.out.println();
        
                                                        System.out.println("Opções:");
                                
                                                        System.out.println("\n\t1 - CPF\n\t2 - Nome\n\t3 - Data de Nascimento\n\t4 - Endereço\n\t5 - Voltar para DADOS DA CONTA");
                                
                                                        System.out.println();
                                
                                                        System.out.print("Informe sua opção aqui: ");
                                                        opN5 = scanner.nextInt();
                                
                                                        while (opN5 < 1 || opN5 > 5) {
                                
                                                            System.out.println("\nOpção Inválida!\n");
        
                                                            System.out.println();
                                
                                                            System.out.println("Opcões:");
                                
                                                            System.out.println("\n\t1 - CPF\n\t2 - Nome\n\t3 - Data de Nascimento\n\t4 - Endereço\n\t5 - Voltar para DADOS DA CONTA");
                                
                                                            System.out.println();
                                
                                                            System.out.print("Informe sua opção aqui: ");
                                                            opN5 = scanner.nextInt();
                                
                                                        }
                                
                                                        System.out.println("\n");
        
                                                        if (opN5 == 1) {
                                                            System.out.println("--> CPF: " + iterable_element.getCliente().getCpf());
                                                        }
                                        
                                                        else if (opN5 == 2) {
                                                            System.out.println("--> Nome: " + iterable_element.getCliente().getNome());
                                                        }
                                        
                                                        else if (opN5 == 3) {
                                                            System.out.println("--> Data de Nascimento: " + iterable_element.getCliente().getDataNascimento());
                                                        }
        
                                                        else if (opN5 == 4) {
                                        
                                                            while (true) {
                                                                          
                                                                System.out.println("DADOS DO ENDEREÇO:");
                                        
                                                                System.out.println();
                                        
                                                                System.out.println("Opções:");
                                        
                                                                System.out.println("\n\t1 - Rua\n\t2 - Número\n\t3 - Bairro\n\t4 - Cidade\n\t5 - Unidade Federativa\n\t6 - Voltar para DADOS CLIENTE");
                                        
                                                                System.out.println();
                                        
                                                                System.out.print("Informe sua opção aqui: ");
                                                                opN6 = scanner.nextInt();
                                        
                                                                while (opN6 < 1 || opN6 > 6) {
                                        
                                                                    System.out.println("\nOpção Inválida!\n");
                                        
                                                                    System.out.println();
                                        
                                                                    System.out.println("Opções:");
                                        
                                                                    System.out.println("\n\t1 - Rua\n\t2 - Número\n\t3 - Bairro\n\t4 - Cidade\n\t5 - Unidade Federativa\n\t6 - Voltar para DADOS CLIENTE");
                                        
                                                                    System.out.println();
                                        
                                                                    System.out.print("Informe sua opção aqui: ");
                                                                    opN6 = scanner.nextInt();
                                                                    
                                                                }
                                        
                                                                System.out.println("\n");
                                        
                                                                if (opN6 == 1) {
                                                                    System.out.println("--> Rua: " +iterable_element.getCliente().getEndereco().getLogradouro());
                                                                }
                                        
                                                                else if (opN6 == 2) {
                                                                    System.out.println("--> Número: " +iterable_element.getCliente().getEndereco().getNumero());
                                                                }
                                        
                                                                else if (opN6 == 3) {
                                                                    System.out.println("--> Bairro: " +iterable_element.getCliente().getEndereco().getBairro());
                                                                }
                                        
                                                                else if (opN6 == 4) {
                                                                    System.out.println("--> Cidade: " +iterable_element.getCliente().getEndereco().getCidade());
                                                                }
                                        
                                                                else if (opN6 == 5) {
                                                                    System.out.println("--> Unidade Federativa: " +iterable_element.getCliente().getEndereco().getUf());
                                                                }
                                        
                                                                else {
                                                                    break;
                                                                }
    
                                                                System.out.println();
                                           
                                                            }
                                        
                                                        }
        
                                                        else {
                                                            break;
                                                        }
    
                                                        System.out.println();
        
                                                    }
    
                                                }
        
                                                else if (opN4 == 5) {
                                                    System.out.println("--> Rendimento: " + iterable_element.getRendimento());
                                                }
        
                                                else if (opN4 == 6) {
                                                    System.out.println("--> Recebimento de Notificações: " + iterable_element.getNotificacao());
                                                }
        
                                                else {
                                                    break;
                                                }
    
                                                System.out.println();
                                            
                                            }
    
                                        }
        
                                        else if (opN3 == 2) {

                                            while (true) {

                                                System.out.println("\nOPERAÇÕES\n");
    
                                                System.out.println();
    
                                                System.out.println("Opções:");
    
                                                System.out.println("\n\t1 - Transferir\n\t2 - Voltar para MENU PRINCIPAL");
    
                                                System.out.println();
    
                                                System.out.print("Informe sua opção aqui: ");
                                                opN4 = scanner.nextInt();
    
                                                while (opN4 < 1 || opN4 > 2) {
    
                                                    System.out.println("\nOpção Inválida!\n");
    
                                                    System.out.println();
                                                    
                                                    System.out.println("Opções:");
                                                    
                                                    System.out.println("\n\t1 - Transferir\n\t2 - Voltar para MENU PRINCIPAL");
                                                    
                                                    System.out.println();
                                                    
                                                    System.out.print("Informe sua opção aqui: ");
                                                    opN4 = scanner.nextInt();
    
                                                }
    
                                                System.out.println();

                                                if (opN4 == 1) {                                             

                                                    while (true) {
                                                                
                                                        System.out.println("\nTRANFERÊNCIA\n");
        
                                                        System.out.println();
        
                                                        System.out.println("Opções:");
        
                                                        System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para OPERAÇÕES");
        
                                                        System.out.println();
        
                                                        System.out.print("Informe sua opção aqui: ");
                                                        opN5 = scanner.nextInt();
        
                                                        while (opN5 < 1 || opN5 > 3) {
        
                                                            System.out.println("\nOpção Inválida!\n");
        
                                                            System.out.println();
        
                                                            System.out.println("Opções:");
        
                                                            System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para OPERAÇÕES");
        
                                                            System.out.println();
        
                                                            System.out.print("Informe sua opção aqui: ");
                                                            opN5 = scanner.nextInt();
                                                            
                                                        }
        
                                                        System.out.println();
        
                                                        if (opN5 == 1) {

                                                            if (contaCorrentes.size() > 0) {
                                                                
                                                                System.out.println("\nPara qual Conta deseja Transferir?\n");
                                                                
                                                                for (ContaCorrente iterable_element2 : contaCorrentes) {
        
                                                                    if (iterable_element.getNumeroConta() != iterable_element2.getNumeroConta()) {
        
                                                                        System.out.println("\n\tDestinatário(a): " + iterable_element2.getCliente().getNome());
        
                                                                        System.out.println();
        
                                                                        System.out.println("\tNúmero da Agência: " + iterable_element2.getNumeroAgencia());
                                                                        System.out.println("\tNúmero da Conta: " + iterable_element2.getNumeroConta());
        
                                                                    }
                                                                                       
                                                                }
        
                                                                System.out.println("\n");
        
                                                                System.out.print("Digite o Número da Agência: ");
                                                                numeroAgencia = scanner.nextInt();
        
                                                                System.out.print("Digite o Número da Conta: ");
                                                                numeroConta = scanner.nextInt();
        
                                                                while (numeroAgenciaList.contains(numeroAgencia) == false || numeroContaList.contains(numeroConta) == false) {
                                                                    
                                                                    System.out.println("\nConta não Encontrada!\n");
        
                                                                    System.out.println();
        
                                                                    System.out.print("Digite o Número da Agência: ");
                                                                    numeroAgencia = scanner.nextInt();
        
                                                                    System.out.print("Digite o Número da Conta: ");
                                                                    numeroConta = scanner.nextInt();
        
                                                                }
        
                                                                System.out.println();
        
                                                                System.out.print("Digite o valor da transferência: ");
                                                                transferencia = scanner.nextDouble();
        
                                                                while ((transferencia + (transferencia * taxa))  > iterable_element.getSaldo()) {
                                                                        
                                                                    System.out.println("\nValor da Transferência superior a Saldo da Conta!\n");
    
                                                                    System.out.println("Saldo da Conta: " + iterable_element.getSaldo());
    
                                                                    System.out.println();
    
                                                                    System.out.print("Digite o valor da transferência: ");
                                                                    transferencia = scanner.nextDouble();
    
                                                                }
    
                                                                System.out.println();
    
                                                                for (ContaCorrente iterable_element2 : contaCorrentes) {
    
                                                                    if (numeroAgencia == iterable_element2.getNumeroAgencia() && numeroConta == iterable_element2.getNumeroConta()) {
                                                                        iterable_element.sacar(transferencia * taxa);
                                                                        iterable_element.setRendimento(iterable_element.getSaldo() * 0.10);
                                                                        iterable_element.transferir(transferencia, iterable_element2);
                                                                    }

                                                                    else {
                                                                        System.out.println("\nNúmero da Agência ou Número da Conta Incorreto(s)!\n");
                                                                    }
                                                                    
                                                                }
                                                                
                                                            }
        
                                                            else {
                                                                System.out.println("\nNenhuma Conta Poupança Cadastrada no Sistema!\n");
                                                            }
                                                            
                                                        }
        
                                                        else if (opN5 == 2) {
        
                                                            if (contaPoupancas.size() > 1) {
                                                                
                                                                System.out.println("\nPara qual Conta deseja Transferir?\n");
                                                                
                                                                for (ContaPoupanca iterable_element2 : contaPoupancas) {
        
                                                                    if (iterable_element.getNumeroConta() != iterable_element2.getNumeroConta()) {
        
                                                                        System.out.println("\n\tDestinatário(a): " + iterable_element2.getCliente().getNome());
        
                                                                        System.out.println();
        
                                                                        System.out.println("\tNúmero da Agência: " + iterable_element2.getNumeroAgencia());
                                                                        System.out.println("\tNúmero da Conta: " + iterable_element2.getNumeroConta());
        
                                                                    }
                                                                                       
                                                                }
        
                                                                System.out.println("\n");
        
                                                                System.out.print("Digite o Número da Agência: ");
                                                                numeroAgencia = scanner.nextInt();
        
                                                                System.out.print("Digite o Número da Conta: ");
                                                                numeroConta = scanner.nextInt();
        
                                                                while (numeroAgenciaList.contains(numeroAgencia) == false || numeroContaList.contains(numeroConta) == false) {
                                                                    
                                                                    System.out.println("\nConta não Encontrada!\n");
        
                                                                    System.out.println();
        
                                                                    System.out.print("Digite o Número da Agência: ");
                                                                    numeroAgencia = scanner.nextInt();
        
                                                                    System.out.print("Digite o Número da Conta: ");
                                                                    numeroConta = scanner.nextInt();
        
                                                                }
        
                                                                System.out.println();
        
                                                                System.out.print("Digite o valor da transferência: ");
                                                                transferencia = scanner.nextDouble();
        
                                                                while ((transferencia + (transferencia * taxa)) > iterable_element.getSaldo() ) {
                                                                        
                                                                    System.out.println("\nValor da Transferência superior a Saldo da Conta!\n");
    
                                                                    System.out.println("Saldo da Conta: " + iterable_element.getSaldo());
    
                                                                    System.out.println();
    
                                                                    System.out.print("Digite o valor da transferência: ");
                                                                    transferencia = scanner.nextDouble();
    
                                                                }
    
                                                                System.out.println();
    
                                                                for (ContaPoupanca iterable_element2 : contaPoupancas) {
    
                                                                    if (numeroAgencia == iterable_element2.getNumeroAgencia() && numeroConta == iterable_element2.getNumeroConta()) {
                                                                        iterable_element.sacar(transferencia * taxa);
                                                                        iterable_element.transferir(transferencia, iterable_element2);
                                                                        iterable_element.setRendimento(iterable_element.getSaldo() * 0.10);
                                                                        iterable_element2.setRendimento(iterable_element2.getSaldo() * 0.10);
                                                                    }

                                                                }
        
                                                            }
        
                                                            else {
                                                                System.out.println("\nNenhuma Conta Poupança a mais Cadastrada no Sistema!\n");
                                                            }
                                                            
                                                        }
        
                                                        else {
                                                            break;
                                                        }
        
                                                    }

                                                }

                                                else {
                                                    break;
                                                }

                                            }    
                                            
                                        }
        
                                        else {
                                            break;
                                        }
    
                                        System.out.println();
    
                                    }
                                
                                }

                                else {
                                    System.out.println("\nNenhuma Conta Poupança Cadastrada com esse CPF!\n");
                                }
    
                            }
    
                        }
                        
                    }
                    
                    else {
                        break;
                    }

                }
    
            }

            //SAIR DO SISTEMA

            if (opN1 == 3) {
                break;                
            }

        }

        System.out.println("\nSistema encerrado com sucesso!\n");
        scanner.close();

    }

}
