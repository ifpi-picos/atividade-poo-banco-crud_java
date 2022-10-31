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

        int opN1, opN2, opN3, opN4, opN5;
                
        String cpf, nome, dtString; LocalDate dataNascimento;
                
        String logradouro; int numero; String bairro, cidade, uf;

        Notificacao notificacao = null;

        int numeroAgencia, numeroConta; double saldo = 0, chequeEspecial = 1000, rendimento = 0.10;

        System.out.println("\nBem-vindo ao Sistema do BancoMaut\n");
                
        while (true) {

            //MENU INCIAL
            
            System.out.println("MENU INICIAL");

            System.out.println();
            
            System.out.println("\n\t1 - Criar Conta\n\t2 - Acessar conta\n\t3 - Sair do Sistema");

            System.out.println();

            System.out.print("Informe sua opção aqui: ");
            opN1 = scanner.nextInt();

            while (opN1 < 1 || opN1 > 3) {

                System.out.println("\nOpção Inválida!\n");

                System.out.println("MENU INICIAL");
                
                System.out.println("\n\t1 - Criar Conta\n\t2 - Acessar conta\n\t3 - Sair do Sistema");

                System.out.println();

                System.out.print("Informe sua opção aqui: ");
                opN1 = scanner.nextInt();

            }

            System.out.println();

            //CRIAR CONTA
            
            if (opN1 == 1) {

                while (true) {

                    System.out.println("\nOPÇÃO 1 (CRIAR CONTA)\n");

                    System.out.println();

                    System.out.println("Opções: ");
                    
                    System.out.println("\n\t1 - Criar Conta Corrente\n\t2 - Criar Conta Poupança\n\t3 - Voltar para MENU INICIAL");

                    System.out.println();
    
                    System.out.print("Informe sua opção aqui: ");
                    opN2 = scanner.nextInt();
    
                    while (opN2 < 1 || opN2 > 3) {
    
                        System.out.println("\nOpção Inválida!\n");
    
                        System.out.println("Opções: ");
                        
                        System.out.println("\n\t1 - Criar Conta Corrente\n\t2 - Criar Conta Poupança\n\t3 - Voltar para MENU INICIAL");

                        System.out.println();
    
                        System.out.print("Informe sua opção aqui: ");
                        opN2 = scanner.nextInt();
    
                    }

                    System.out.println();

                    if (opN2 == 1 || opN2 == 2) {

                        System.out.println("\nDados Pessoais");
        
                        System.out.println();
        
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
        
                        System.out.println("\nDados Complementares");

                        System.out.println();
        
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
        
                        System.out.println("\nForma de envio de Notificações:");
        
                        System.out.println("\n\t1 - Email\n\t2 - SMS");

                        System.out.println();
        
                        System.out.print("Informe sua opção aqui: ");
                        opN3 = scanner.nextInt();
        
                        while (opN3 < 1 || opN3 > 2) {
                            
                            System.out.println("\nOpção Inválida!\n");
        
                            System.out.println("Forma de envio de Notificações:");
                            
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

                            System.out.println("Conta Corrente criada com SUCESSO!");
        
                        }
        
                        else if (opN2 == 2) {
        
                            ContaPoupanca contaPoupanca = new ContaPoupanca(numeroAgencia,
                                                                            numeroConta,
                                                                            saldo,
                                                                            cliente,
                                                                            notificacao,
                                                                            rendimento);
        
                            contaPoupancas.add(contaPoupanca);
        
                            System.out.println("Conta Poupança criada com SUCESSO!");
        
                        }

                    }

                    else {
                        System.out.println();
                        break;
                    }

                    System.out.println();
    
                }

            }

            //ACESSAR CONTA

            if (opN1 == 2) {

                while (true) {
                    
                    System.out.println("\nOPÇÃO 2 (ACESSAR CONTA)\n");
    
                    System.out.println();
    
                    System.out.println("Opções:");
        
                    System.out.println("\n\t1 - Acessar Conta Corrente\n\t2 - Acessar Conta Poupança\n\t3 - Voltar para MENU INICIAL");
    
                    System.out.println();
        
                    System.out.print("Informe sua opção aqui: ");
                    opN2 = scanner.nextInt();

                    System.out.println();
        
                    while (opN2 < 1 || opN2 > 3) {
        
                        System.out.println("\nOpção Inválida!\n");
        
                        System.out.println("ACESSO DE CONTAS:");
                            
                        System.out.println("\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Voltar para MENU INICIAL");
    
                        System.out.println();
                            
                        System.out.print("Informe sua opção aqui: ");
                        opN2 = scanner.nextInt();
        
                    }
    
                    System.out.println();

                    if (opN2 == 1 || opN2 == 2) {

                        System.out.print("Login (XXX.XXX.XXX-XX): ");
                        cpf = scanner.next();
        
                        while (cpfs.contains(cpf) == false) {
                            
                            System.out.println("\nInválido! CPF informado não cadastrado no Sistema\n");
        
                            System.out.println();
                            
                            System.out.print("Login (XXX.XXX.XXX-XX): ");
                            cpf = scanner.next();
        
                        }
        
                        System.out.println();
        
                        if (opN2 == 1) {
        
                            for (ContaCorrente iterable_element : contaCorrentes) {
        
                                if (cpf.equals(iterable_element.getCliente().getCpf())) {
        
                                    while (true) {
        
                                        System.out.println("MENU PRINCIPAL DA CONTA CORRENTE");
                        
                                        System.out.println();
                                        
                                        System.out.println("Login: " + cpf);
                        
                                        System.out.println();
                                        
                                        System.out.println("Número Agência: " + iterable_element.getNumeroAgencia());
                                        System.out.println("Número Conta: " + iterable_element.getNumeroConta());
                                        System.out.println("Saldo: " + iterable_element.getSaldo());
                                        System.out.println("Proprietário: " + iterable_element.getCliente().getNome());
                        
                                        System.out.println();
                        
                                        System.out.println("Opções:");
                        
                                        System.out.println("\n\t1 - Acessar Dados\n\t2 - Operações\n\t3 - Sair da Conta");
                        
                                        System.out.println();
                        
                                        System.out.print("Infome sua opção aqui: ");
                                        opN2 = scanner.nextInt();
                        
                                        while (opN2 < 1 || opN2 > 3) {
                        
                                            System.out.println("\nOpção Inválida!\n");
        
                                            System.out.println();
                        
                                            System.out.println("Opções:");
                        
                                            System.out.println("\n\t1 - Acessar Dados\n\t2 - Operações\n\t3 - Sair da Conta");
                        
                                            System.out.println();
                        
                                            System.out.print("Infome sua opção aqui: ");
                                            opN2 = scanner.nextInt();
        
                                        }
                                        
                                        System.out.println();
        
                                        if (opN2 == 1) {
        
                                            while (true) {
        
                                                System.out.println("DADOS DA CONTA");
        
                                                System.out.println();
                                                
                                                System.out.println("Opções:");
                                
                                                System.out.println("\n\t1 - Número da Agência\n\t2 - Número da Conta\n\t3 - Saldo\n\t4 - Cliente\n\t5 - Cheque Especial\n\t6 - Forma de envio de Notificação\n\t7 - Voltar para MENU PRINCIPAL");
                                
                                                System.out.println();
                                
                                                System.out.print("Informe sua opção aqui: ");
                                                opN3 = scanner.nextInt();
                                
                                                while (opN3 < 1 || opN3 > 7) {
                                
                                                    System.out.println("\nOpção Inválida!\n");
                                
                                                    System.out.println("DADOS DA CONTA:");
                                
                                                    System.out.println("\n\t1 - Número da Agência\n\t2 - Número da Conta\n\t3 - Saldo\n\t4 - Cliente\n\t5 - Cheque Especial\n\t6 - Forma de envio de Notificação\n\t7 - Voltar para MENU PRINCIPAL");
                                                    
                                                    System.out.println();
                                
                                                    System.out.print("Informe sua opção aqui: ");
                                                    opN3 = scanner.nextInt();
                                
                                                }
                                                
                                                System.out.println();
                                                
                                                if (opN3 == 1) {
                                                    System.out.println("Número da Agência: " + iterable_element.getNumeroAgencia());
                                                }
                                
                                                else if (opN3 == 2) {
                                                    System.out.println("Número da Conta: " + iterable_element.getNumeroConta());
                                                }
                                
                                                else if (opN3 == 3) {
                                                    System.out.println("Saldo: " + iterable_element.getSaldo());
                                                }
        
                                                else if (opN3 == 4) {
                                
                                                    while (true) {
                                                        
                                                        System.out.println("DADOS DO CLIENTE:");
        
                                                        System.out.println();
        
                                                        System.out.println("Opções:");
                                
                                                        System.out.println("\n\t1 - CPF\n\t2 - Nome\n\t3 - Data de Nascimento\n\t4 - Endereço\n\t5 - Voltar para DADOS DA CONTA");
                                
                                                        System.out.println();
                                
                                                        System.out.print("Informe sua opção aqui: ");
                                                        opN4 = scanner.nextInt();
                                
                                                        while (opN4 < 1 || opN4 > 5) {
                                
                                                            System.out.println("\nOpção Inválida!\n");
        
                                                            System.out.println();
                                
                                                            System.out.println("Opcões:");
                                
                                                            System.out.println("\n\t1 - CPF\n\t2 - Nome\n\t3 - Data de Nascimento\n\t4 - Endereço\n\t5 - Voltar para DADOS DA CONTA");
                                
                                                            System.out.println();
                                
                                                            System.out.print("Informe sua opção aqui: ");
                                                            opN4 = scanner.nextInt();
                                
                                                        }
                                
                                                        System.out.println();
        
                                                        if (opN4 == 1) {
                                                            System.out.println("CPF: " + iterable_element.getCliente().getCpf());
                                                        }
                                        
                                                        else if (opN4 == 2) {
                                                            System.out.println("Nome: " + iterable_element.getCliente().getNome());
                                                        }
                                        
                                                        else if (opN4 == 3) {
                                                            System.out.println("Data de Nascimento: " + iterable_element.getCliente().getDataNascimento());
                                                        }
        
                                                        else if (opN4 == 4) {
                                        
                                                            while (true) {
                                                                          
                                                                System.out.println("DADOS DO ENDEREÇO:");
                                        
                                                                System.out.println();
                                        
                                                                System.out.println("Opções:");
                                        
                                                                System.out.println("\n\t1 - Rua\n\t2 - Número\n\t3 - Bairro\n\t4 - Cidade\n\t5 - Unidade Federativa\n\t6 - Voltar para DADOS CLIENTE");
                                        
                                                                System.out.println();
                                        
                                                                System.out.print("Informe sua opção aqui: ");
                                                                opN5 = scanner.nextInt();
                                        
                                                                while (opN5 < 1 || opN5 > 6) {
                                        
                                                                    System.out.println("\nOpção Inválida!\n");
                                        
                                                                    System.out.println();
                                        
                                                                    System.out.println("Opções:");
                                        
                                                                    System.out.println("\n\t1 - Rua\n\t2 - Número\n\t3 - Bairro\n\t4 - Cidade\n\t5 - Unidade Federativa\n\t6 - Voltar para DADOS CLIENTE");
                                        
                                                                    System.out.println();
                                        
                                                                    System.out.print("Informe sua opção aqui: ");
                                                                    opN5 = scanner.nextInt();
                                                                    
                                                                }
                                        
                                                                System.out.println();
                                        
                                                                if (opN5 == 1) {
                                                                    System.out.println("Rua: " +iterable_element.getCliente().getEndereco().getLogradouro());
                                                                }
                                        
                                                                else if (opN5 == 2) {
                                                                    System.out.println("Número: " +iterable_element.getCliente().getEndereco().getNumero());
                                                                }
                                        
                                                                else if (opN5 == 3) {
                                                                    System.out.println("Bairro: " +iterable_element.getCliente().getEndereco().getBairro());
                                                                }
                                        
                                                                else if (opN5 == 4) {
                                                                    System.out.println("Cidade: " +iterable_element.getCliente().getEndereco().getCidade());
                                                                }
                                        
                                                                else if (opN5 == 5) {
                                                                    System.out.println("Unidade Federativa: " +iterable_element.getCliente().getEndereco().getUf());
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
        
                                                else if (opN3 == 5) {
                                                    System.out.println("Cheque Especial: " + iterable_element.getChequeEspecial());
                                                }
        
                                                else if (opN3 == 6) {
                                                    System.out.println("Forma de envio de Notificações: " + iterable_element.getNotificacao());
                                                }
        
                                                else {
                                                    break;
                                                }
    
                                                System.out.println();
                                            
                                            }
    
                                        }
        
                                        else if (opN2 == 2) {
        
                                        }
        
                                        else {
                                            break;
                                        }
    
                                        System.out.println();
    
                                    }
                                
                                }
    
                            }
    
                        }
    
                        else if (opN2 == 2) {
        
                            for (ContaPoupanca iterable_element : contaPoupancas) {
        
                                if (cpf.equals(iterable_element.getCliente().getCpf())) {
        
                                    while (true) {
        
                                        System.out.println("MENU PRINCIPAL DA CONTA POUPANÇA");
                        
                                        System.out.println();
                                        
                                        System.out.println("Login: " + cpf);
                        
                                        System.out.println();
                                        
                                        System.out.println("Número Agência: " + iterable_element.getNumeroAgencia());
                                        System.out.println("Número Conta: " + iterable_element.getNumeroConta());
                                        System.out.println("Saldo: " + iterable_element.getSaldo());
                                        System.out.println("Proprietário: " + iterable_element.getCliente().getNome());
                        
                                        System.out.println();
                        
                                        System.out.println("Opções:");
                        
                                        System.out.println("\n\t1 - Acessar Dados\n\t2 - Operações\n\t3 - Sair da Conta");
                        
                                        System.out.println();
                        
                                        System.out.print("Infome sua opção aqui: ");
                                        opN2 = scanner.nextInt();
                        
                                        while (opN2 < 1 || opN2 > 3) {
                        
                                            System.out.println("\nOpção Inválida!\n");
        
                                            System.out.println();
                        
                                            System.out.println("Opções:");
                        
                                            System.out.println("\n\t1 - Acessar Dados\n\t2 - Operações\n\t3 - Sair da Conta");
                        
                                            System.out.println();
                        
                                            System.out.print("Infome sua opção aqui: ");
                                            opN2 = scanner.nextInt();
        
                                        }
                                        
                                        System.out.println();
        
                                        if (opN2 == 1) {
        
                                            while (true) {
        
                                                System.out.println("DADOS DA CONTA");
        
                                                System.out.println();
                                                
                                                System.out.println("Opções:");
                                
                                                System.out.println("\n\t1 - Número da Agência\n\t2 - Número da Conta\n\t3 - Saldo\n\t4 - Cliente\n\t5 - Rendimento\n\t6 - Forma de envio de Notificação\n\t7 - Voltar para MENU PRINCIPAL");
                                
                                                System.out.println();
                                
                                                System.out.print("Informe sua opção aqui: ");
                                                opN3 = scanner.nextInt();
                                
                                                while (opN3 < 1 || opN3 > 7) {
                                
                                                    System.out.println("\nOpção Inválida!\n");
                                
                                                    System.out.println("DADOS DA CONTA:");
                                
                                                    System.out.println("\n\t1 - Número da Agência\n\t2 - Número da Conta\n\t3 - Saldo\n\t4 - Cliente\n\t5 - Rendimento\n\t6 - Forma de envio de Notificação\n\t7 - Voltar para MENU PRINCIPAL");
                                                    
                                                    System.out.println();
                                
                                                    System.out.print("Informe sua opção aqui: ");
                                                    opN3 = scanner.nextInt();
                                
                                                }
                                                
                                                System.out.println();
                                                
                                                if (opN3 == 1) {
                                                    System.out.println("Número da Agência: " + iterable_element.getNumeroAgencia());
                                                }
                                
                                                else if (opN3 == 2) {
                                                    System.out.println("Número da Conta: " + iterable_element.getNumeroConta());
                                                }
                                
                                                else if (opN3 == 3) {
                                                    System.out.println("Saldo: " + iterable_element.getSaldo());
                                                }
        
                                                else if (opN3 == 4) {
                                
                                                    while (true) {
                                                        
                                                        System.out.println("DADOS DO CLIENTE:");
        
                                                        System.out.println();
        
                                                        System.out.println("Opções:");
                                
                                                        System.out.println("\n\t1 - CPF\n\t2 - Nome\n\t3 - Data de Nascimento\n\t4 - Endereço\n\t5 - Voltar para DADOS DA CONTA");
                                
                                                        System.out.println();
                                
                                                        System.out.print("Informe sua opção aqui: ");
                                                        opN4 = scanner.nextInt();
                                
                                                        while (opN4 < 1 || opN4 > 5) {
                                
                                                            System.out.println("\nOpção Inválida!\n");
        
                                                            System.out.println();
                                
                                                            System.out.println("Opcões:");
                                
                                                            System.out.println("\n\t1 - CPF\n\t2 - Nome\n\t3 - Data de Nascimento\n\t4 - Endereço\n\t5 - Voltar para DADOS DA CONTA");
                                
                                                            System.out.println();
                                
                                                            System.out.print("Informe sua opção aqui: ");
                                                            opN4 = scanner.nextInt();
                                
                                                        }
                                
                                                        System.out.println();
        
                                                        if (opN4 == 1) {
                                                            System.out.println("CPF: " + iterable_element.getCliente().getCpf());
                                                        }
                                        
                                                        else if (opN4 == 2) {
                                                            System.out.println("Nome: " + iterable_element.getCliente().getNome());
                                                        }
                                        
                                                        else if (opN4 == 3) {
                                                            System.out.println("Data de Nascimento: " + iterable_element.getCliente().getDataNascimento());
                                                        }
        
                                                        else if (opN4 == 4) {
                                        
                                                            while (true) {
                                                                          
                                                                System.out.println("DADOS DO ENDEREÇO:");
                                        
                                                                System.out.println();
                                        
                                                                System.out.println("Opções:");
                                        
                                                                System.out.println("\n\t1 - Rua\n\t2 - Número\n\t3 - Bairro\n\t4 - Cidade\n\t5 - Unidade Federativa\n\t6 - Voltar para DADOS CLIENTE");
                                        
                                                                System.out.println();
                                        
                                                                System.out.print("Informe sua opção aqui: ");
                                                                opN5 = scanner.nextInt();
                                        
                                                                while (opN5 < 1 || opN5 > 6) {
                                        
                                                                    System.out.println("\nOpção Inválida!\n");
                                        
                                                                    System.out.println();
                                        
                                                                    System.out.println("Opções:");
                                        
                                                                    System.out.println("\n\t1 - Rua\n\t2 - Número\n\t3 - Bairro\n\t4 - Cidade\n\t5 - Unidade Federativa\n\t6 - Voltar para DADOS CLIENTE");
                                        
                                                                    System.out.println();
                                        
                                                                    System.out.print("Informe sua opção aqui: ");
                                                                    opN5 = scanner.nextInt();
                                                                    
                                                                }
                                        
                                                                System.out.println();
                                        
                                                                if (opN5 == 1) {
                                                                    System.out.println("Rua: " +iterable_element.getCliente().getEndereco().getLogradouro());
                                                                }
                                        
                                                                else if (opN5 == 2) {
                                                                    System.out.println("Número: " +iterable_element.getCliente().getEndereco().getNumero());
                                                                }
                                        
                                                                else if (opN5 == 3) {
                                                                    System.out.println("Bairro: " +iterable_element.getCliente().getEndereco().getBairro());
                                                                }
                                        
                                                                else if (opN5 == 4) {
                                                                    System.out.println("Cidade: " +iterable_element.getCliente().getEndereco().getCidade());
                                                                }
                                        
                                                                else if (opN5 == 5) {
                                                                    System.out.println("Unidade Federativa: " +iterable_element.getCliente().getEndereco().getUf());
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
        
                                                else if (opN3 == 5) {
                                                    System.out.println("Rendimento: " + iterable_element.getRendimento());
                                                }
        
                                                else if (opN3 == 6) {
                                                    System.out.println("Forma de envio de Notificações: " + iterable_element.getNotificacao());
                                                }
        
                                                else {
                                                    break;
                                                }
    
                                                System.out.println();
                                            
                                            }
    
                                        }
        
                                        else if (opN2 == 2) {
        
                                        }
        
                                        else {
                                            break;
                                        }
    
                                        System.out.println();
    
                                    }
                                
                                }
    
                            }
    
                        }
                        
                    }
                    
                    else {
                        break;
                    }

                    System.out.println();

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
