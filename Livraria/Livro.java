public class Livro {
    //Atributos dos livros
    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas;

    //Construtor
    public Livro(String nome, String autor, String editora, int qtdPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.qtdPaginas = qtdPaginas;
    }

    public void mostraInfo() {
        System.out.println('\n' + "Nome do Livro: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Quantidade de páginas: " + qtdPaginas);
    }

    //Criando os getters
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    @Override
    public String toString() {
        return "Livro titulo= " + nome + ", paginas= " + qtdPaginas + ", editora= " + editora;
    }
}

// Exceção personalizada para lidar com informações inválidas
class InfoInvalidaException extends Exception {
    public InfoInvalidaException(String message) {
        super(message);
    }
}
