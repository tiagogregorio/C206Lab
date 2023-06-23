import java.util.*;

public class Main {
    public static void main(String[] args) {
        Arquivo arq = new Arquivo();
        ArrayList<RendaFixa> rendaFixaEncontrados = new ArrayList<>();
        boolean flag = true;
        int opcao = -1;
        Scanner sc = new Scanner(System.in);

        // Menu de opções
        while (flag) {
            rendaFixaEncontrados = arq.ler();
            System.out.println("\n========== SIMULADOR DE RENDA FIXA ==========");
            System.out.println("1- SIMULAR INVESTIMENTO");
            System.out.println("2- INVESTIMENTO COM O MAIOR VALOR INVESTIDO");
            System.out.println("3- LISTAR O(s) INVESTIMENTO (S) CADASTRADOS ");
            System.out.println("4- PRODUTO EM ORDEM CRESCENTE DE VALOR INVESTIDO ");
            System.out.println("5- PRODUTO EM ORDEM DECRESCENTE DE VALOR INVESTIDO");
            System.out.println("6- CADASTRAR INVESTIMENTO ");
            System.out.println("7- ATUALIZAR INVESTIMENTO");
            System.out.println("8- EXCLUIR INVESTIMENTO");
            System.out.println("0- SAIR ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 0: //Sair do menu
                    flag = false;
                    System.out.println("------------------------------------------------------");
                    System.out.println("Obrigado! Volte Sempre!");
                    System.out.println("------------------------------------------------------");
                    break;

                case 1:// Código para simular investimento
                    //Criando os investimentos e suas promoções
                    Cdb cdb1 = new Cdb("Maria Eduarda", 1000);
                    cdb1.setCorretora("Easynvest");
                    Promocao cdbpromocao = new Promocao("Não Contemplado", false);
                    cdb1.promocao = cdbpromocao;

                    Selic selic1 = new Selic("Joao Carlos", 25000);
                    selic1.setCorretora("ModalInvestimentos");
                    Promocao selicpromocao = new Promocao("Contemplado", true);
                    selic1.promocao = selicpromocao;


                    Produto produto = new Produto(); //Instanciando "criando" o produto
                    //Adicionando os objetos, os cliente ao produto
                    produto.addCliente(cdb1);
                    produto.addCliente(selic1);

                    produto.listarClientes(); // Mostrando as informações de Clientes

                    System.out.println("Quantidade Total de Clientes: " + Cliente.getContador());
                    break;

                case 2:// Verifica se existem investimentos cadastrados e retorna com maior valor investido
                    if (rendaFixaEncontrados.isEmpty()) {
                        System.out.println("Nenhum investimento cadastrado.");
                    } else {
                        RendaFixa melhorInvestimento = Collections.max(rendaFixaEncontrados, Comparator.comparingDouble(RendaFixa::getValorInvest));
                        System.out.println("Investimento de maior valor:");
                        melhorInvestimento.mostraInfo();
                    }
                    break;

                case 3:
                    if (rendaFixaEncontrados.isEmpty()) {
                        System.out.println("Nenhum investimento cadastrado.");
                    } else {
                        for (RendaFixa rendaFixa : rendaFixaEncontrados) {
                            rendaFixa.mostraInfo();
                        }
                    }
                    break;

                case 4:
                    if (rendaFixaEncontrados.isEmpty()) {
                        System.out.println("Nenhum investimento cadastrado.");
                    } else {
                        Collections.sort(rendaFixaEncontrados, Comparator.comparingInt(RendaFixa::getValorInvest));
                        System.out.println("Investimento ordenado em ordem crescente de valor investido.");
                        for (RendaFixa rendaFixa : rendaFixaEncontrados) {
                            rendaFixa.mostraInfo();
                        }
                    }
                    break;

                case 5:
                    if (rendaFixaEncontrados.isEmpty()) {
                        System.out.println("Sem investimento cadastrado.");
                    } else {
                        Collections.sort(rendaFixaEncontrados, Comparator.comparingInt(RendaFixa::getValorInvest).reversed());
                        System.out.println("Investimentos ordenados em ordem decrescente de valor investido.");
                        for (RendaFixa rendaFixa : rendaFixaEncontrados) {
                            rendaFixa.mostraInfo();
                        }
                    }
                    break;

                case 6:
                    String nome;
                    String produtos;
                    int valorInvest;

                    System.out.print("Nome da corretora ou banco: ");
                    nome = sc.nextLine();

                    while (true) {
                        System.out.print("Digite o produto desejado (CDB, Poupança, Selic): ");
                        produtos = sc.nextLine();
                        if (produtos.equalsIgnoreCase("CDB") || produtos.equalsIgnoreCase("Poupança")
                                || produtos.equalsIgnoreCase("Selic")) {
                            break;
                        } else {
                            System.out.println("Produto inválido. Opções: CDB, Poupança, Selic.");
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Digite o valor que deseja investir: ");
                            valorInvest = Integer.parseInt(sc.nextLine());
                            if (valorInvest <= 50) {
                                throw new InfoInvalidaException("Valor não permitido. Entre com valores acima de R$ 50");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido. Digite um número inteiro.");
                        } catch (InfoInvalidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    RendaFixa rendaFixa;
                    if (produtos.equalsIgnoreCase("CDB")) {
                        rendaFixa = new Cdbb(nome, valorInvest);
                    } else if (produtos.equalsIgnoreCase("Poupança")) {
                        rendaFixa = new Poupanca(nome, valorInvest);
                    } else {
                        rendaFixa = new Selicc(nome, valorInvest);
                    }

                    arq.salvar(rendaFixa);
                    break;

                case 7:
                    if (rendaFixaEncontrados.isEmpty()) {
                        System.out.println("Nenhum investimento cadastrado.");
                    } else {
                        System.out.println("Selecione o investimento a ser atualizado:");
                        for (int i = 0; i < rendaFixaEncontrados.size(); i++) {
                            System.out.println(i + 1 + "-");
                            rendaFixaEncontrados.get(i).mostraInfo();
                        }

                        int investimentoSelecionado = sc.nextInt();
                        sc.nextLine();

                        if (investimentoSelecionado >= 1 && investimentoSelecionado <= rendaFixaEncontrados.size()) {
                            RendaFixa investimentoAntigo = rendaFixaEncontrados.get(investimentoSelecionado - 1);

                            String novoNome;
                            int novoValorInvest;

                            System.out.print("Digite o novo nome da corretora ou banco: ");
                            novoNome = sc.nextLine();

                            while (true) {
                                try {
                                    System.out.print("Digite o novo valor que deseja investir: ");
                                    novoValorInvest = Integer.parseInt(sc.nextLine());
                                    if (novoValorInvest <= 50) {
                                        throw new InfoInvalidaException("Valor não permitido. Entre com valores acima de R$ 50");
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Valor inválido. Digite um número inteiro.");
                                } catch (InfoInvalidaException e) {
                                    System.out.println(e.getMessage());
                                }
                            }

                            RendaFixa investimentoNovo;
                            if (investimentoAntigo instanceof Cdbb) {
                                investimentoNovo = new Cdbb(novoNome, novoValorInvest);
                            } else if (investimentoAntigo instanceof Poupanca) {
                                investimentoNovo = new Poupanca(novoNome, novoValorInvest);
                            } else {
                                investimentoNovo = new Selicc(novoNome, novoValorInvest);
                            }

                            rendaFixaEncontrados.set(investimentoSelecionado - 1, investimentoNovo);
                            arq.reescreverArquivo(rendaFixaEncontrados); // Atualiza o arquivo com a lista atualizada de investimentos
                            System.out.println("Investimento atualizado com sucesso!");
                        } else {
                            System.out.println("Opção inválida. Selecione um investimento válido.");
                        }
                    }
                    break;

                case 8:
                    if (rendaFixaEncontrados.isEmpty()) {
                        System.out.println("Nenhum investimento cadastrado.");
                    } else {
                        System.out.println("Selecione o investimento a ser excluído:");
                        for (int i = 0; i < rendaFixaEncontrados.size(); i++) {
                            System.out.println(i + 1 + "-");
                            rendaFixaEncontrados.get(i).mostraInfo();
                        }

                        int investimentoSelecionado = sc.nextInt();
                        sc.nextLine();

                        if (investimentoSelecionado >= 1 && investimentoSelecionado <= rendaFixaEncontrados.size()) {
                            RendaFixa investimentoExcluir = rendaFixaEncontrados.get(investimentoSelecionado - 1);
                            rendaFixaEncontrados.remove(investimentoExcluir);
                            arq.reescreverArquivo(rendaFixaEncontrados);
                            System.out.println("Investimento excluído com sucesso!");
                        } else {
                            System.out.println("Opção inválida. Selecione um investimento válido.");
                        }
                    }
                    break;

                default:
                    System.out.println("Entre com valores válidos...");
            }
        }
        sc.close(); // Fechando a entrada de dados
    }
}
