public class Endereco {
    private String rua;
    private int numero;

    // Construtor da classe Endereco
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    // Método para exibir os dados do endereço
    public void exibirDados() {
        System.out.println("Rua: " + rua + ", número: " + numero);
    }
}
