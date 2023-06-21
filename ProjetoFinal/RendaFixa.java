package Model;

public class RendaFixa {
    private String nome;
    private String produto;
    private int valorInvest;

    public RendaFixa(String nome, String produto, int valorInvest) {
        this.nome = nome;
        this.produto = produto;
        this.valorInvest = valorInvest;
    }

    public void mostraInfo() {
        System.out.println("\nNome da corretora ou banco: " + this.nome);
        System.out.println("Produto escolhido: " + this.produto);
        System.out.println("Valor investido: " + this.valorInvest);
    }

    public String getNome() {
        return this.nome;
    }

    public String getProduto() {
        return this.produto;
    }

    public int getValorInvest() {
        return this.valorInvest;
    }

    public String toString() {
        return "Nome da corretora: " + this.nome + ", Valor investido: " + this.valorInvest + ", Produto escolhido: " + this.produto;
    }
}
