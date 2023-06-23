class Selicc extends RendaFixa {
    // Classe que representa o tipo de investimento em Selic

    public Selicc(String nome, int valorInvest) {
        super(nome, valorInvest);
        // Chama o construtor da classe pai (RendaFixa) passando o nome e valor do investimento
    }

    @Override
    public String getProdutos() {
        return "Selic";
        // Retorna o nome do produto de investimento como "Selic"
    }
}
