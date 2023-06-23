public class Selic extends Cliente implements Protecao, Liquidez {
    // Atributos extras de um selic em relação ao cliente
    private String corretora;

    public void setCorretora(String corretora) {
        this.corretora = corretora;
    }

    public Selic(String nome, float valor) {
        super(nome, valor);
    }

    // Métodos reescritos da classe mãe (Cliente) - Polimorfismo
    @Override
    public void analise() {
        System.out.println("\nAnalisando valor investido no Tesouro...");
        super.analise(); // apontando para classe mae (analise)
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n--- Infos do Tesouro Selic ---");
        super.mostraInfo();
        System.out.println("Agente de custódia: " + corretora);
    }

    // Método implementado a parti da interface de protecao
    @Override
    public void protecao() {
        System.out.println("O Tesouro Direto é 100% garantido pelo Tesouro Nacional, ou seja, é um dos investimentos mais seguros do Brasil.");
    }

    public void liquidez() {
        System.out.println("Liquidez: D + 1");
    }

}
