import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente client = new Cliente();//Nome e CPF do Cliente
        client.nome = "Ze do Bit Carry";
        client.cpf = 245634823;

        float valortotal = 0; //Armazenar a soma do valor de todos os PCs vendidos

        //#region Estanciando Computador
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();
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
                        System.out.println("Processador: " + computador1.hardwareb.nome[0] + computador1.hardwareb.capacidade[0] + "Mhz");
                        System.out.println("Memória Ram: " + computador1.hardwareb.capacidade[1] + "Gb " + " Armazenamento: " + computador1.hardwareb.capacidade[2] + "Gb");
                        valortotal = (client.comp1 * computador1.preco) + (client.comp2 * computador2.preco) + (client.comp3 * computador3.preco);
                    }
                    if (client.comp2 > 0) {
                        System.out.println("\nPC(s) da Promoçao 2 - Quantidade: " + client.comp2 + " Item(s)");
                        computador2.mostraPCConfigs();
                        System.out.println("Processador: " + computador2.hardwareb.nome[1] + computador2.hardwareb.capacidade[0] + "Mhz");
                        System.out.println("Memória Ram: " + computador2.hardwareb.capacidade[1] + "Gb " + " Armazenamento: " + computador2.hardwareb.capacidade[2] + "Gb");
                        valortotal = (client.comp1 * computador1.preco) + (client.comp2 * computador2.preco) + (client.comp3 * computador3.preco);
                    }
                    if (client.comp3 > 0) {
                        System.out.println("\nPC(s) da Promoçao 3 - Quantidade: " + client.comp3 + " Item(s)");
                        computador3.mostraPCConfigs();
                        System.out.println("Processador: " + computador3.hardwareb.nome[2] + computador3.hardwareb.capacidade[0] + "Mhz");
                        System.out.println("Memória Ram: " + computador3.hardwareb.capacidade[1] + "Gb " + " Armazenamento: " + computador3.hardwareb.capacidade[2] + "Gb");
                        valortotal = (client.comp1 * computador1.preco) + (client.comp2 * computador2.preco) + (client.comp3 * computador3.preco);
                    }
                    System.out.println("\n----------------- Pagador -----------------");
                    System.out.println("Nome: " + client.nome + "       CPF: " + client.cpf);

                    client.conta = valortotal;
                    System.out.printf("Valor a pagar (Total) = R$ %.2f\n", client.calculaTotalCompra());
                    System.out.println("------------------------------------------");
                    System.out.println("         Obrigado!Volte Sempre!  ");
                    break;

                case 1:
                    System.out.println("Adicionando computador da Promoção 1 no carrinho...\n");
                    MemoriaUSB memoria1 = new MemoriaUSB(); //Criando memória nome
                    memoria1.nome[0] = "Pen-drive"; //Atribuindo valores para Memória
                    memoria1.capacidade[0] = 16; //Pendrive
                    computador1.addMemoriaUSB(memoria1);//Adicionando memória no Computador 1
                    computador1.memoria = memoria1;//Associação
                    client.comp1++;//Contador de computador1
                    computador1.sisoperacional.nome = "Linux Ubuntu";
                    computador1.sisoperacional.tipo = 32;
                    computador1.hardwareb.nome[0] = "Pentium Core i3 ";
                    computador1.hardwareb.capacidade[0] = 2200f; //Processador
                    computador1.hardwareb.capacidade[1] = 8f; //Ram
                    computador1.hardwareb.capacidade[2] = 500f; // HD
                    computador1.marca = "Positivo";
                    computador1.preco = 2300;
                    break;

                case 2:
                    MemoriaUSB memoria2 = new MemoriaUSB(); //Criando memória 2
                    memoria2.nome[1] = "Pen-drive"; //Atribuindo nome memoria 2
                    memoria2.capacidade[1] = 32; // Capacidade mmemoria 2
                    computador2.memoria = memoria2; // Associando computador 2
                    computador2.addMemoriaUSB(memoria2);//Adicionando memória no Computador 2
                    computador2.sisoperacional.nome = "Windows 8";
                    computador2.sisoperacional.tipo = 64;
                    System.out.println("Adicionando computador da Promoção 2 no carrinho...\n");
                    client.comp2++;//Contador de computador2
                    computador2.hardwareb.nome[1] = "Pentium Core i5 ";
                    computador2.hardwareb.capacidade[0] = 3370f; //Processador
                    computador2.hardwareb.capacidade[1] = 16f; //Ram
                    computador2.hardwareb.capacidade[2] = 1000f; // HD
                    computador2.marca = "Acer";
                    computador2.preco = 5800;
                    break;

                case 3:
                    MemoriaUSB memoria3 = new MemoriaUSB(); //Criando memória
                    memoria3.nome[2] = "HD externo"; // Atribuindo memoria 3
                    memoria3.capacidade[2] = 1000; // Capacidade memoria 3
                    computador3.addMemoriaUSB(memoria3);//Adicionando memória no Computador 3
                    computador3.memoria = memoria3; // associação
                    computador3.sisoperacional.nome = "Windows 10";
                    computador3.sisoperacional.tipo = 64;
                    System.out.println("Adicionando computador da Promoção 3 no carrinho...\n");
                    client.comp3++;//Contador de computador3
                    computador3.hardwareb.nome[2] = "Pentium Core i7 ";
                    computador3.hardwareb.capacidade[0] = 4500f; //Processador
                    computador3.hardwareb.capacidade[1] = 32f; //Ram
                    computador3.hardwareb.capacidade[2] = 2000f; // HD
                    computador3.marca = "Vaio";
                    computador3.preco = 1800;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
        //#endregion
    }
}
