import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura de dados
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble(); //digitar primeiro numero

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble(); //digitar segundo numero

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Exponencial");

        int opcao = scanner.nextInt(); //opçao escolhida para realizar o calculo (1 - soma, 2 subtração, 3...)

        Calculadora calc = new Calculadora(num1, num2); //Cria um objeto da classe Calculadora, passando como parâmetros os dois números digitados

        switch (opcao) { // Executa a operação escolhida (case1,case2,...) e executa o metodo(calc.soma(), calc.subtrai(),...)
            case 1:
                calc.soma();
                break;
            case 2:
                calc.subtrai();
                break;
            case 3:
                calc.multiplica();
                break;
            case 4:
                calc.divide();
                break;
            case 5:
                calc.exponencial();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close(); //// Fecha o objeto Scanner para liberar recursos do sistema.
    }
}
