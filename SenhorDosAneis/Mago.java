public class Mago extends Habitante implements Feitico, Cura {
    // Extends informa para a classe filha (Mago) que ela herdará da classe mae (Habitante) Os metodos
    //Atributos de um mago
    private String cor;

    public Mago(String nome, int idade, float energia) {
        super(nome, idade, energia);
    }

    //Set cor do mago
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Métodos reescritos da classe mãe (Habitante) - Polimorfismo
    @Override
    public void atacar() {
        System.out.println("\nMago esta atacando...");
        super.atacar();
    }

    @Override
    public void curar() {
        System.out.println("Mago foi curado em 15%, energia atual: " + (energia * 0.15 + energia));
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n--- Infos do Mago ---");
        super.mostraInfo();
        System.out.println("Cor: " + cor);
        lancaFeitico();
    }

    @Override
    public void lancaFeitico() {
        System.out.println("O mago lançou um feitiço...");
        System.out.println("Energia gasta (-10%): " + (energia - (energia * 0.1)));
        this.energia -= (energia * 0.1);
    }
}
