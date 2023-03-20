import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Imobiliaria imobiliaria = new Imobiliaria();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um apartamento");
            System.out.println("2 - Ajustar o valor do aluguel");
            System.out.println("3 - Mostrar a média das áreas dos apartamentos com 2 quartos ou menos");
            System.out.println("4 - Exibir todas as informações da imobiliária e dos apartamentos cadastrados");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    imobiliaria.addApartamento("Rua A",2,20,2000);
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
    }
}
