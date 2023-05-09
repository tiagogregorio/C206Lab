public class Biscoito implements Comparable<Biscoito> {
    //#region Atributos
    private String nome;
    private double valor;
    private int qtd;
    private String sabor;
    //#endregion

    // Método que servirá para realizar as comparações
    @Override
    public int compareTo(Biscoito bisc) {
        return Double.compare(bisc.getValor(), this.valor);
    }

    //#region Construtor
    public Biscoito(String nome, double valor, int qtd, String sabor) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
        this.sabor = sabor;
    }
    //#endregion

    //#region Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }
    //#endregion
}
