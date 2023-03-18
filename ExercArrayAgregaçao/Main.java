import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao = 0;//Opcao para o Switch iniciando em zero
        //Instanciando e preenchendo objetos de escola
        Escola escola = new Escola("Escola Joaozinho do Java", "joaozin@java.com", "(035)65897452", "Estrada da bateria, numero 100");

        //#region Entrada de dados e Menu
        // Entrada de dados e menu
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("++++ SISTEMA DE CADASTRO DA INSTITUIÇÃO ++++");
        while (opcao < 1 || opcao > 4) {
            // Menu com as opções
            System.out.println();
            System.out.println("DIGITE UM VALOR DE ACORDO COM A SUA OPÇÃO ");
            System.out.println("1- Cadastrar estudantes ");
            System.out.println("2- Ver informações ");
            System.out.println("3- Verificar a quantidade de alunos por ano");
            System.out.println("4 - Sair da aplicação ");
            opcao = sc.nextInt(); // Opção escolhida pelo usuário
            sc.nextLine(); // Limpando o buffer para entrada do dado literal

            switch (opcao) {
                case 1:
                    Estudante e = new Estudante(); // Instanciando um estudante - Cadastro
                    System.out.println("Nome do estudante: ");
                    e.nome = sc.nextLine(); // Atribuindo o nome ao atributo de nome da clase Estudante
                    System.out.println("Idade do estudante: ");
                    e.idade = sc.nextInt(); // Atribuindo a idade ao atributo de idade da clase Estudante
                    sc.nextLine();
                    System.out.println("Ano letivo do estudante: ");
                    e.ano = sc.nextLine(); // Atribuindo o ano ao atributo de ano da clase Estudante
                    // Adicionando o estudante através do metódo da classe Escola
                    escola.addEstudantes(e);
                    opcao = 0; //Volta para menu de cadastro setando opção para 0
                    break; // Parando a execução
                case 2:
                    escola.mostrarInfos(); // Mostrando as informações através do metódo
                    opcao = 0; //Volta para menu de cadastro setando opção para 0
                    break;
                case 3:
                    escola.qtdEstudantesAno(); // Mostrando a quantidade de alunos por ano
                    opcao = 0; //Volta para menu de cadastro setando opção para 0
                    break;
                case 4:
                    //Quando opcao = 4 saimos e finalizando o processo
                    break;
                default:
                    System.out.println("Opção inválida!!!");
                    opcao = 0; //Volta para menu de cadastro setando opção para 0
                    break;
            }
        }
        sc.close();//Fechando a conexão de dados
        //#endregion
    }
}
