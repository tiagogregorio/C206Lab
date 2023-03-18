public class Fabricante {

    String nome;
    String cnpj;

    public Fabricante(String nome, String cnpj)
    {
        this.nome = nome;
        this.cnpj=cnpj;
    }

    public void mostraInfo()
    {
        System.out.println("Nome do fabricante:+" + this.nome);
        System.out.println("CNPJ do fabricante:" + this.cnpj);
    }
}
