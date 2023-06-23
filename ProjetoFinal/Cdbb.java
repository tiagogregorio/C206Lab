public class Cdb extends Cliente implements Protecao, Liquidez {
    // Atributos extras de um cdb em relação ao cliente
    private String corretora;

    public void setCorretora(String corretora) {
        this.corretora = corretora;
    }

    public Cdb(String nome, float valor) {
        super(nome, valor);
    }

    // Métodos reescritos da classe mãe (Cliente) - Polimorfismo
    @Override
    public void analise() {
        System.out.println("\nAnalisando valor investido...");
        super.analise(); // apontando para classe mae (analise)
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n--- Infos do CDB ---");
        super.mostraInfo();
        System.out.println("Agente de custódia: " + corretora);
    }

    // Método implementado a parti da interface de protecao
    @Override
    public void protecao() {
        System.out.println("O CDB é protegido pelo FGC  (Fundo Garantidor de Credito) até 250 mil reais");
    }

    @Override
    public void liquidez() {
        System.out.println("Liquidez: No vencimento.");
    }

}
