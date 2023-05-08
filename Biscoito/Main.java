import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumeroNegativoException {

        int opcao = -1;
        //Declarando o array List
        // ArrayList - É uma estrutura dinâmica
        ArrayList<Biscoito> listaBiscoito = new ArrayList<Biscoito>(); // Objetos

        //Criando Biscoito
        Biscoito b1 = new Biscoito("Especial", 8.00, 1, "Chocolate ao leite");
        Biscoito b2 = new Biscoito("Trakinas", 10.00, 1, "Morango");
        Biscoito b3 = new Biscoito("Passa Tempo", 9.50, 1, "Chocolate");

        // criando alguns cupons de desconto
        CupomDesconto c1 = new CupomDesconto(5);
        CupomDesconto c2 = new CupomDesconto(10);

        //adicionando diversos tipos de itens na lista
        listaBiscoito.add(b1);
        listaBiscoito.add(b2);
        listaBiscoito.add(b3);

        // criando um carrinho de compras
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar biscoito");
            System.out.println("2 - Adicionar cupom de desconto");
            System.out.println("3 - Finalizar compra");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("\n----------------- Produtos -----------------");
                    System.out.println(b1.getNome() + " quantidade: " + b1.getQtd());
                    System.out.println(b2.getNome() + " quantidade: " + b2.getQtd());
                    System.out.println(b3.getNome() + " quantidade: " + b3.getQtd());

                    System.out.printf("Valor a pagar (Total) = R$ %.2f\n", carrinho.somaTotal());
                    System.out.println("--------------------------------------------");
                    System.out.println("         Obrigado! Volte Sempre!  ");
                    break;


                case 1:
                    System.out.println("Escolha um biscoito:");
                    System.out.println("1 - " + b1.getNome() + " - R$" + b1.getValor());
                    System.out.println("2 - " + b2.getNome() + " - R$" + b2.getValor());
                    System.out.println("3 - " + b3.getNome() + " - R$" + b3.getValor());

                    int escolhaBiscoito = sc.nextInt();

                    Biscoito biscoitoEscolhido = null;

                    switch (escolhaBiscoito) {
                        case 1:
                            carrinho.addBiscoito(b1);
                            System.out.println("Digite a quantidade de biscoitos: ");
                            b1.setQtd(sc.nextInt());
                            break;
                        case 2:
                            carrinho.addBiscoito(b2);
                            System.out.println("Digite a quantidade de biscoitos: ");
                            b2.setQtd(sc.nextInt());
                            break;
                        case 3:
                            carrinho.addBiscoito(b3);
                            System.out.println("Digite a quantidade de biscoitos: ");
                            b3.setQtd(sc.nextInt());
                            break;
                        default:
                            System.out.println("Opção inválida");
                            continue;
                    }
                    try {
                        sc.nextLine(); //Limpando o buffer
                        if ((b1.getQtd()< 0)) {
                            throw new NumeroNegativoException(b1.getQtd());
                        }
                        if ((b2.getQtd()< 0)) {
                            throw new NumeroNegativoException(b2.getQtd());
                        }
                        if ((b3.getQtd()< 0)) {
                            throw new NumeroNegativoException(b3.getQtd());
                        }
                    } catch (NumeroNegativoException e) {
                        System.out.println("Entre com valores maiores ou iguais a 1");
                        System.out.println(e);
                    } finally {
                        if (b1.getQtd() < 0) {
                            System.out.println("Quantidade incorreta!!!");
                            System.out.println("Digite a quantidade de biscoitos: ");
                            b1.setQtd(sc.nextInt());
                        }
                        if (b2.getQtd() < 0) {
                            System.out.println("Quantidade incorreta!!!");
                            System.out.println("Digite a quantidade de biscoitos: ");
                            b2.setQtd(sc.nextInt());
                        }
                        if (b3.getQtd() < 0) {
                            System.out.println("Quantidade incorreta!!!");
                            System.out.println("Digite a quantidade de biscoitos: ");
                            b3.setQtd(sc.nextInt());
                        }
                    }
                    break;

                case 2:
                    System.out.println("Escolha um cupom de desconto:");
                    System.out.println("1 - " + c1.getValorDesconto() + "%");
                    System.out.println("2 - " + c2.getValorDesconto() + "%");

                    int escolhaCupom = sc.nextInt();

                    CupomDesconto cupomEscolhido;

                    switch (escolhaCupom) {
                        case 1:
                            cupomEscolhido = c1;
                            carrinho.somaTotal();
                            break;
                        case 2:
                            cupomEscolhido = c2;
                            carrinho.somaTotal();
                            break;
                        default:
                            System.out.println("Opção inválida");
                            continue;
                    }
                    break;

                case 3:
                    System.out.println("Total: " + carrinho.somaTotal());
                    break;
            }
        }
        sc.close(); //fechar o objeto Scanner sc e libera recursos do sistema
    }
}
