import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {

        //#region entradas e declaração de variaveis
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para permitir a entrada de dados

        System.out.print("Qual o tipo de combustível --> (A-Álcool, G-Gasolina): ");
        char tipo = sc.next().charAt(0); // Lê o tipo de combustível digitado pelo usuário (A para alcool e G para gasolina)

        System.out.print("Informe a quantidade de litros vendidos: ");
        int litros = sc.nextInt(); // Lê a quantidade de litros vendidos digitada pelo usuário

        // Declara as variáveis de preço por litro, desconto e preço total como do tipo double
        double precoLitro;
        double desconto;
        double precoTotal;
        //#endregion entrada e declaração de variaveis

        //#region Testes e descontos realizados de acordo com cobustivel

        //#region GASOLINA
        // Se o tipo de combustível for Gasolina
        if (tipo == 'G') {
            while (litros <= 0) {
                System.out.println("Quantidade invalida, entre com valores maiores que zero");
                System.out.print("Informe a quantidade de litros vendidos: ");
                litros = sc.nextInt(); // Lê a quantidade de litros vendidos digitada pelo usuário
            }
            if (litros <= 20) { // Se a quantidade de litros vendidos for menor ou igual a 20
                desconto = 0.04; // Aplica um desconto de 4%

            } else { // Caso contrário
                desconto = 0.06; // Aplica um desconto de 6%
            }
            precoLitro = 6.0; // Define o preço por litro como 6.0 (preço da gasolina)


        }
        //#endregion GASOLINA

        //#region ALCOOL
        else {
            while (litros <= 0) {
                System.out.println("Quantidade invalida, entre com valores maiores que zero");
                System.out.print("Informe a quantidade de litros vendidos: ");
                litros = sc.nextInt(); // Lê a quantidade de litros vendidos digitada pelo usuário
            }
            if (litros <= 20) { // Se a quantidade de litros vendidos for menor ou igual a 20
                desconto = 0.03; // Aplica um desconto de 3%
            } else { // Caso contrário
                desconto = 0.05; // Aplica um desconto de 5%
            }
            precoLitro = 4.9; // Define o preço por litro como 4.9 (preço do álcool)
        }
        //#endregion ALCOOL

        //#endregion Testes e descontos realizados de acordo com cobustivel

        //#region Regiao de calculo e o preço total a ser pago pelo cliente
        precoTotal = litros * precoLitro * (1 - desconto);
        //#endregion de calculo

        //#region saida e fechamento de objeto
        // Exibe o preço total formatado em reais com duas casas decimais
        System.out.printf("Total a pagar: R$ %.2f", precoTotal);
        sc.close(); // Fecha o objeto Scanner
        //#endregion saida e fechamento de objeto
    }
}
