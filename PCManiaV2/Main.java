import java.util.Scanner; // Importando o pacote Scanner da biblioteca Java Util

public class Main {
    public static void main(String[] args) {

        // Criando instância do objeto Cliente e preenchendo seus atributos nome e cpf
        Cliente client = new Cliente();//Nome e CPF do Cliente
        client.nome = "Ze do Bit Carry";
        client.cpf = 245634823;

        // Instanciando três objetos Computador
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        //#region COMPUTADOR DA PROMOCAO 1
        // Instanciando posições do hardware básico de cada objeto Computador
        for (int i = 0; i < computador1.hardwareb.length; i++) {
            computador1.hardwareb[i] = new HardwareBasico();
        }
        //preenchendo as informações do Sistema Operacional do PC
        computador1.marca = "Positivo";
        computador1.preco = 2300;
        computador1.sisoperacional.nome = "Linux Ubuntu";
        computador1.sisoperacional.tipo = 32;
        //preenchendo as informações do hardware basico
        computador1.hardwareb[0].nome = "Pentium Core i3 ";
        computador1.hardwareb[0].capacidade = 2200f; //Processador
        computador1.hardwareb[1].capacidade = 8f; //Ram
        computador1.hardwareb[2].capacidade = 500f; // HD
        // Criando instância do objeto MemoriaUSB, preenchendo seus atributos capacidade e nome, e adicionando-a ao Computador1
        MemoriaUSB musb1 = new MemoriaUSB(); // somente criei o campo e dentro tenho null
        musb1.capacidade = 16;
        musb1.nome = "Pen-drive";
        computador1.addMemoriaUSB(musb1); // aqui realmente tenho  salvo dentro da memoria
        //#endregion

        //#region COMPUTADOR DA PROMOCAO 2
        // Instanciando posições do hardware básico de cada objeto Computador
        for (int i = 0; i < computador2.hardwareb.length; i++) {
            computador2.hardwareb[i] = new HardwareBasico();
        }
        // Preenchendo as informações do Sistema Operacional do PC
        computador2.marca = "Acer";
        computador2.preco = 5800;
        computador2.sisoperacional.nome = "Windows 8";
        computador2.sisoperacional.tipo = 64;
        // Preenchendo as informações do hardware básico
        computador2.hardwareb[0].nome = "Pentium Core i5 ";
        computador2.hardwareb[0].capacidade = 3370f; //Processador
        computador2.hardwareb[1].capacidade = 16f; //Ram
        computador2.hardwareb[2].capacidade = 1000f; // HD
        // Criando instância do objeto MemoriaUSB, preenchendo seus atributos capacidade e nome, e adicionando-a ao Computador2
        MemoriaUSB musb2 = new MemoriaUSB(); // somente criei o campo e dentro tenho null
        musb2.capacidade = 32;
        musb2.nome = "Pen-drive";
        computador2.addMemoriaUSB(musb2); // aqui realmente tenho  salvo dentro da memoria
        //#endregion

        //#region COMPUTADOR DA PROMOCAO 3
        //instanciando posições de hardware basico
        for (int i = 0; i < computador3.hardwareb.length; i++) {
            computador3.hardwareb[i] = new HardwareBasico();
        }
        computador3.marca = "Vaio";
        computador3.preco = 1800;
        computador3.sisoperacional.nome = "Windows 10";
        computador3.sisoperacional.tipo = 64;
        computador3.hardwareb[0].nome = "Pentium Core i7 ";
        computador3.hardwareb[0].capacidade = 4500f; //Processador
        computador3.hardwareb[1].capacidade = 32f; //Ram
        computador3.hardwareb[2].capacidade = 2000f; // HD
        // Criando instância do objeto MemoriaUSB, preenchendo seus atributos capacidade e nome, e adicionando-a ao Computador3
        MemoriaUSB musb3 = new MemoriaUSB(); // somente criei o campo e dentro tenho null
        musb3.capacidade = 1000;
        musb3.nome = "HD Externo";
        computador3.addMemoriaUSB(musb3); // aqui realmente tenho  salvo dentro da memoria
        //#endregion

        //#region Menu
        Scanner sc = new Scanner(System.in); // instância da classe Scanner, que é usada para ler a entrada do usuário no console
        int opcao = -1; //variável "opcao" é declarada e inicializada com o valor -1
        while (opcao != 0) { //loop while que continua enquanto a variável "opcao" for diferente de 0
            System.out.println("\n*************************** Bem vindo ***************************");
            System.out.println("Digite 1 para comprar computador que esta na Promoção 1 ");
            System.out.println("Digite 2 para comprar computador que esta na Promoção 2 ");
            System.out.println("Digite 3 para comprar computador que esta na Promoção 3 ");
            System.out.println("Digite 0 para fechar compra");

            opcao = sc.nextInt();//lê a entrada do usuário no console e armazena o valor na variável "opcao".
            sc.nextLine();//limpar o buffer

            switch (opcao) {
                case 0: //lista todos os computadores que foram adicionados ao carrinho, juntamente com o nome e CPF do cliente, e exibe o valor total a ser pago pela compra
                    System.out.println("\n----------------- Produtos -----------------");
                    for (int i = 0; i < client.computadores.length; i++) {
                        if (client.computadores[i] != null) { //Mostra computadores[i] forem diferente de vazio e chama metodo mostraPCConfigs()
                            client.computadores[i].mostraPCConfigs();
                        }
                    }
                    System.out.println("\n------------------ Pagador ------------------");
                    System.out.println("Nome: " + client.nome + "       CPF: " + client.cpf);
                    System.out.printf("Valor a pagar (Total) = R$ %.2f\n", client.calculaTotalCompra()); // Calcula e printa o valor da compra com 2 casas decimais
                    System.out.println("--------------------------------------------");
                    System.out.println("         Obrigado!Volte Sempre!  ");
                    break;

                case 1:
                    System.out.println("Adicionando computador da Promoção 1 no carrinho...\n");
                    for (int i = 0; i < client.computadores.length && i < client.computadores.length; i++) {
                        if (client.computadores[i] == null) { //Adiciona nas posições que estão vazias, por isso == null
                            client.computadores[i] = computador1;
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Adicionando computador da Promoção 2 no carrinho...\n");
                    for (int i = 0; i < client.computadores.length && i < client.computadores.length; i++) {
                        if (client.computadores[i] == null) {//Adiciona nas posições que estão vazias, por isso == null
                            client.computadores[i] = computador2;
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Adicionando computador da Promoção 3 no carrinho...\n");
                    for (int i = 0; i < client.computadores.length && i < client.computadores.length; i++) {
                        if (client.computadores[i] == null) {//Adiciona nas posições que estão vazias, por isso == null
                            client.computadores[i] = computador3;
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close(); //fechar o objeto Scanner sc e libera recursos do sistema
        //#endregion
    }
}
