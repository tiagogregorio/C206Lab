import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Cliente cliente = new Cliente("Fulano", 30); // Cria um objeto Cliente com o nome "Fulano" e a idade 30

        // Loop para criar dois endereços e adicioná-los ao array de endereços do cliente
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome da rua do endereço " + (i + 1) + ": ");
            String rua = input.nextLine();
            System.out.print("Digite o número do endereço " + (i + 1) + ": ");
            int numero = input.nextInt();
            input.nextLine(); // Consumindo a quebra de linha deixada pelo nextInt()
            Endereco endereco = new Endereco(rua, numero);
            cliente.adicionarEndereco(endereco);
        }

        // Exibe os dados do cliente e seus endereços
        cliente.exibirDados();
    }
}

/*exemplo de composição com array. A classe Escola possui um atributo alunos que é um array de objetos
do tipo Aluno, ou seja, a classe Escola é composta por objetos da classe Aluno. Além disso, a classe
Escola também possui um método para adicionar alunos ao array, demonstrando o uso da composição.

O código apresentado utiliza composição, pois a classe Cliente contém uma referência para a classe Endereco por meio do atributo enderecos.
 Além disso, a classe Cliente é responsável por criar e gerenciar a adição dos objetos Endereco ao seu array enderecos.
 Note que, caso a classe Cliente fosse apenas responsável por armazenar uma referência para um objeto Endereco,
 sem gerenciá-lo, teríamos uma relação de agregação.
 */
