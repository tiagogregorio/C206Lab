import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Imobiliaria imobiliaria = new Imobiliaria("MeTiraDaRua","359112673","SantaRita");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um apartamento");
            System.out.println("2 - Ajustar o valor do aluguel");
            System.out.println("3 - Mostrar a média das áreas dos apartamentos com 2 quartos ou menos");
            System.out.println("4 - Exibir todas as informações da imobiliária e dos apartamentos cadastrados");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();//limpar o buffer
            switch (opcao) {
                case 1:
                    //coletando informações do apartamentos
                    System.out.println("Endereco: ");
                    String endereco = sc.nextLine();
                    System.out.println("Numero Quartos");
                    int numQuartos = sc.nextInt();
                    System.out.println("Area: ");
                    double area = sc.nextDouble();
                    System.out.println("Aluguel: ");
                    double aluguel = sc.nextDouble();


                    //instanciando apartamento
                    Apartamento apto = new Apartamento(endereco,numQuartos, area,aluguel);

                    imobiliaria.addApartamento(apto);
                    break;
                case 2:
                    imobiliaria.ajustaAluguel();
                    break;
                case 3:
                    System.out.println("A média das áreas dos apartamentos com 2 quartos ou menos é " + imobiliaria.mediaArea());
                    break;
                case 4:
                    imobiliaria.mostraInfo();
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}
