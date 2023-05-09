import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws NumeroNegativoException {

        int opcao = -1;
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        // criando alguns cupons de desconto
        CupomDesconto c1 = new CupomDesconto(5);
        CupomDesconto c2 = new CupomDesconto(10);

        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar biscoito");
            System.out.println("2 - Adicionar cupom de desconto");
            System.out.println("3 - Finalizar compra");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Sabor: ");
                    String sabor = sc.nextLine();
                    System.out.println("Valor: ");
                    double valor = sc.nextDouble();
                    System.out.println("Quantidade : ");
                    int qnt = sc.nextInt();

                    Biscoito bisc = new Biscoito(nome, valor, qnt, sabor);
                    carrinho.addBiscoito(bisc);
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
                            carrinho.setCupom(cupomEscolhido);
                            break;
                        case 2:
                            cupomEscolhido = c2;
                            carrinho.setCupom(cupomEscolhido);
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
