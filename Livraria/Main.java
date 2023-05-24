import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criando um Arquivo
        Arquivo arq = new Arquivo();

        // Apresentando as informações dos Livros
        ArrayList<Livro> LivroEncontrados = new ArrayList<>();

        // Controladora do while
        boolean flag = true;

        // Opção de escolha do usuário
        int opcao = -1;

        // Entrada e saída de dados
        Scanner sc = new Scanner(System.in);

        while (flag) {
            LivroEncontrados = arq.ler();
            System.out.println('\n' + "+++++++++++ BEM VINDO(A) A LIVRARIA");
            System.out.println("1- CADASTRAR LIVRO ");
            System.out.println("2- LISTAR O(s) LIVRO (S) ");
            System.out.println("3- ORDENAR LIVROS EM ORDEM CRESCENTE DE PAGINAS ");
            System.out.println("4- ORDENAR LIVROS EM ORDEM DECRESCENTE DE PAGINAS ");
            System.out.println("0- SAIR ");
            opcao = sc.nextInt(); // Entrando com a opção do usuário
            sc.nextLine(); // Limpando o buffer

            switch (opcao) {

                case 0:
                    flag = false;
                    break;

                case 1:
                    // Adicionando um Livro no Arquivo
                    String nome; //nome do livro
                    String autor; //autor do livro
                    String editora; // Editora do livro (Leya, Arqueiro ou Rocco)
                    int qtdPaginas; // Quantidade de páginas do livro
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();

                    while (true) {
                        System.out.print("Digite a editora do livro (Leya, Arqueiro ou Rocco): ");
                        editora = sc.nextLine();
                        if (editora.equalsIgnoreCase("Leya") || editora.equalsIgnoreCase("Arqueiro")
                                || editora.equalsIgnoreCase("Rocco")) {
                            break;
                        } else {
                            System.out.println("Editora inválida. Digite Leya, Arqueiro ou Rocco.");
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Digite o número de páginas do livro: ");
                            qtdPaginas = Integer.parseInt(sc.nextLine());
                            if (qtdPaginas < 0) {
                                throw new InfoInvalidaException("Quantidade de páginas inválida.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido. Digite um número inteiro.");
                        } catch (InfoInvalidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    //Criando Livro
                    Livro livro = new Livro(nome, autor, editora, qtdPaginas);

                    //Escrevendo as informações do livro dentro do arquivo
                    arq.escreverArquivo(livro);
                    break;

                case 2:
                    // mostrar os livros cadastrados
                    if (LivroEncontrados.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (Livro livroEncontrado : LivroEncontrados) {
                            livroEncontrado.mostraInfo();
                        }
                    }
                    break;

                case 3:
                    // ordenar os livros em ordem crescente de páginas e verificar se tem livro cadastrado
                    if (LivroEncontrados.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        Collections.sort(LivroEncontrados, Comparator.comparingInt(Livro::getQtdPaginas)); // Ordenando pela quantidade de paginas
                        System.out.println("Livros ordenados em ordem crescente de páginas.");
                        for (Livro livroOrdenado : LivroEncontrados) {
                            livroOrdenado.mostraInfo();
                        }
                    }
                    break;

                case 4:
                    //ordenarLivrosDecrescente e verificar se tem livro cadastrado
                    if (LivroEncontrados.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        Collections.sort(LivroEncontrados, Comparator.comparingInt(Livro::getQtdPaginas).reversed());//Ordenando por paginas decrescente
                        System.out.println("Livros ordenados em ordem decrescente de páginas.");
                        for (Livro livroOrdenado : LivroEncontrados) {
                            livroOrdenado.mostraInfo();
                        }
                    }
                    break;

                default:
                    System.out.println("Entre com valores validos...");
            }
        }
        sc.close(); // Fechando a entrada de dados
    }
}
