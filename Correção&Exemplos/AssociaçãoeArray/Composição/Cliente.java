public class Cliente {
    private String nome;
    private int idade;
    private Endereco[] enderecos;

    // Construtor da classe Cliente
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new Endereco[2]; // Cria um array de tamanho 2 para armazenar os endereços do cliente
    }

    // Método para adicionar um endereço ao array de endereços do cliente
    public void adicionarEndereco(Endereco endereco) {
        for (int i = 0; i < enderecos.length; i++) {
            if (enderecos[i] == null) { // Verifica se a posição atual do array está vazia
                enderecos[i] = endereco; // Adiciona o endereço à posição atual do array
                break; // Sai do loop
            }
        }
    }

    // Método para exibir os dados do cliente
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", idade: " + idade);
        System.out.println("Endereços:");
        for (Endereco endereco : enderecos) {
            if (endereco != null) { // Verifica se a posição atual do array não está vazia
                endereco.exibirDados(); // Exibe os dados do endereço
            }
        }
    }
}
