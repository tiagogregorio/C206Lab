abstract class RendaFixa {
    private String nome;
    private int valorInvest;

    public RendaFixa(String nome, int valorInvest) {
        this.nome = nome;
        this.valorInvest = valorInvest;
    }

    public String getNome() {
        return nome;
    }

    public int getValorInvest() {
        return valorInvest;
    }

    public abstract String getProdutos();

    public void mostraInfo() {
        System.out.println("Nome da corretora ou banco: " + nome);
        System.out.println("Valor investido: R$" + valorInvest);
        System.out.println("Produto: " + getProdutos());
        System.out.println("-----------------------------");
    }
}
