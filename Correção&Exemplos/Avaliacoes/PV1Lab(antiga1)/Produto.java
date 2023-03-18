public class Produto {

    String nome;
    double nota;
    String partNumber;
    int quantidade;

    Fabricante fabri;

    public Produto(String nome, double nota, String partNumber, int quantidade, String nomefabri, String cnpjfabri)
    {
        this.nome=nome;
        this.nota=nota;
        this.partNumber=partNumber;
        this.quantidade=quantidade;

        this.fabri = new Fabricante(nomefabri, cnpjfabri);
    }

    void mostraInfo()
    {
        System.out.println("Nome do Produto: "+this.nome);
        System.out.println("Nota do produto: " +this.nota);
        System.out.println("PN do produto: " +this.partNumber);
        System.out.println("Quantidade do produto: " +this.quantidade);
        System.out.println("Nome do Fabricante: " +this.fabri.nome);
        System.out.println("CNPJ do Fabricante: " +this.fabri.cnpj);

    }
}
