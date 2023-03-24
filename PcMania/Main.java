import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente client = new Cliente("Ze do Bit Carry", 101101110, 0, 0, 0);//Nome e CPF do Cliente + contadores
        float valortotal = 0; //Armazenar a soma do valor de todos os PCs vendidos

        //#region Estanciando Computador
        Computador computador1 = new Computador("Positivo", 2300);
        Computador computador2 = new Computador("Acer", 5800);
        Computador computador3 = new Computador("Vaio", 1800);
        //#endregion

        //#region Menu
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("Digite 1 para comprar computador que esta na Promoção 1 ");
            System.out.println("Digite 2 para comprar computador que esta na Promoção 2 ");
            System.out.println("Digite 3 para comprar computador que esta na Promoção 3 ");
            System.out.println("Digite 0 para fechar compra");

            opcao = sc.nextInt();
            sc.nextLine();//limpar o buffer
            switch (opcao) {
                case 0:
                    System.out.println("----------------- Produtos ----------------- ");

                    if (client.comp1 > 0) {
                        System.out.println("\nPC(s) da Promoçao 1 - Quantidade: " + client.comp1 + " Item(s)");
                        computador1.mostraPCConfigs();
                    }
                    if (client.comp2 > 0) {
                        System.out.println("\nPC(s) da Promoçao 2 - Quantidade: " + client.comp2 + " Item(s)");
                        computador2.mostraPCConfigs();
                    }
                    if (client.comp3 > 0) {
                        System.out.println("\nPC(s) da Promoçao 3 - Quantidade: " + client.comp3 + " Item(s)");
                        computador3.mostraPCConfigs();
                    }
                    System.out.println("\n----------------- Pagador -----------------");
                    System.out.println("Nome: " + client.nome + "       CPF: " + client.cpf);
                    valortotal = client.calculaTotalCompra();
                    System.out.printf("Valor a pagar (Total) = R$ %.2f\n", valortotal);
                    System.out.println("------------------------------------------");
                    System.out.println("         Obrigado!Volte Sempre!  ");
                    break;

                case 1:
                    System.out.println("Adicionando computador da Promoção 1 no carrinho...\n");
                    computador1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));//Adicionando memória no Computador
                    client.comp1++;//Contador de computador1
                    break;

                case 2:
                    System.out.println("Adicionando computador da Promoção 2 no carrinho...\n");
                    computador2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32)); //Adicionando memória no Computador
                    client.comp2++;//Contador de computador2
                    break;

                case 3:
                    System.out.println("Adicionando computador da Promoção 3 no carrinho...\n");
                    computador3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000)); //Adicionando memória no Computador
                    client.comp3++;//Contador de computador3
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
        //#endregion
    }
}
