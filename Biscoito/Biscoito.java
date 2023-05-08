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
    public Biscoito(String nome, double valor, int qtd, String sabor) throws NumeroNegativoException {

        if (qtd <= 0) {
            throw new NumeroNegativoException(this.qtd);
        }
        this.nome = nome;
        this.valor = valor;
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

    public String getSabor() {
        return sabor;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    //#endregion

}
