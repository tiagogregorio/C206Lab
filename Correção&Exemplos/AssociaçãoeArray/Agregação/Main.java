import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Criando um objeto Scanner para ler a entrada do usuário
        Pessoa[] pessoas = new Pessoa[2]; // Criando um array de tamanho 2 para armazenar objetos do tipo Pessoa

        // Loop para criar duas pessoas e adicioná-las ao array
        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = input.nextLine(); // Lendo o nome da pessoa
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = input.nextInt(); // Lendo a idade da pessoa
            input.nextLine(); // Consumindo a quebra de linha deixada pelo nextInt()
            pessoas[i] = new Pessoa(nome, idade); // Criando um objeto Pessoa com os dados lidos e adicionando-o ao array
        }

        // Iterando pelo array de pessoas e exibindo seus dados
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].exibirDados();
        }
    }
}
