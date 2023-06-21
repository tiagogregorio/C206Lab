import Model.RendaFixa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Arquivo arq = new Arquivo();
        new ArrayList();
        boolean flag = true;
        int opcao = true;
        Scanner sc = new Scanner(System.in);

        while(true) {
            label70:
            while(flag) {
                ArrayList<RendaFixa> RendaFixaEncontrados = arq.ler();
                System.out.println("\n========== SIMULADOR DE RENDA FIXA ==========");
                System.out.println("1- SIMULAR E CALCULAR MELHOR INVESTIMENTO");
                System.out.println("2- LISTAR O(s) INVESTIMENTO (S) ");
                System.out.println("3- PRODUTO EM ORDEM CRESCENTE DE VALOR INVESTIDO ");
                System.out.println("4- PRODUTO EM ORDEM DECRESCENTE DE VALOR INVESTIDO");
                System.out.println("5- CADASTRAR INVESTIMENTO ");
                System.out.println("0- SAIR ");
                int opcao = sc.nextInt();
                sc.nextLine();
                Iterator var13;
                RendaFixa fixaOrdenado;
                switch (opcao) {
                    case 0:
                        flag = false;
                        System.out.println("------------------------------------------------------");
                        System.out.println("Obrigado! Volte Sempre!");
                        System.out.println("------------------------------------------------------");
                    case 1:
                        break;
                    case 2:
                        if (RendaFixaEncontrados.isEmpty()) {
                            System.out.println("Nenhum investimento cadastrado.");
                            break;
                        } else {
                            var13 = RendaFixaEncontrados.iterator();

                            while(true) {
                                if (!var13.hasNext()) {
                                    continue label70;
                                }

                                fixaOrdenado = (RendaFixa)var13.next();
                                fixaOrdenado.mostraInfo();
                            }
                        }
                    case 3:
                        if (RendaFixaEncontrados.isEmpty()) {
                            System.out.println("Nenhum investimento cadastrado.");
                            break;
                        } else {
                            Collections.sort(RendaFixaEncontrados, Comparator.comparingInt(RendaFixa::getValorInvest));
                            System.out.println("Investimento ordenado em ordem crescente de valor investido.");
                            var13 = RendaFixaEncontrados.iterator();

                            while(true) {
                                if (!var13.hasNext()) {
                                    continue label70;
                                }

                                fixaOrdenado = (RendaFixa)var13.next();
                                fixaOrdenado.mostraInfo();
                            }
                        }
                    case 4:
                        if (RendaFixaEncontrados.isEmpty()) {
                            System.out.println("Sem investimento cadastrado.");
                            break;
                        } else {
                            Collections.sort(RendaFixaEncontrados, Comparator.comparingInt(RendaFixa::getValorInvest).reversed());
                            System.out.println("Investimentos ordenados em ordem decrescente de valor investido.");
                            var13 = RendaFixaEncontrados.iterator();

                            while(true) {
                                if (!var13.hasNext()) {
                                    continue label70;
                                }

                                fixaOrdenado = (RendaFixa)var13.next();
                                fixaOrdenado.mostraInfo();
                            }
                        }
                    case 5:
                        System.out.print("Nome da corretora ou banco: ");
                        String nome = sc.nextLine();

                        while(true) {
                            System.out.print("Digite o produto Desejado (CDB, Tesouro Selic, Poupança): ");
                            String produto = sc.nextLine();
                            if (produto.equalsIgnoreCase("CDB") || produto.equalsIgnoreCase("Tesouro Selic") || produto.equalsIgnoreCase("Poupança")) {
                                while(true) {
                                    int valorInvest;
                                    try {
                                        System.out.print("Digite o Valor que deseja investir: ");
                                        valorInvest = Integer.parseInt(sc.nextLine());
                                        if (valorInvest <= 50) {
                                            throw new InfoInvalidaException("Valor não permitido. Entre com valores acima de R$ 50");
                                        }
                                    } catch (NumberFormatException var10) {
                                        System.out.println("Valor inválido. Digite um número inteiro.");
                                        continue;
                                    } catch (InfoInvalidaException var11) {
                                        System.out.println(var11.getMessage());
                                        continue;
                                    }

                                    RendaFixa fixa = new RendaFixa(nome, produto, valorInvest);
                                    arq.escreverArquivo(fixa);
                                    continue label70;
                                }
                            }

                            System.out.println("Produto inválido. CDB, Tesouro Selic, Poupança.");
                        }
                    default:
                        System.out.println("Entre com valores validos...");
                }
            }

            sc.close();
            return;
        }
    }
}
