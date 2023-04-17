public class Mago extends Habitante implements Feitico, Cura {
    private String cor;

    public Mago(int id, String nome, int idade, float energia) {
        super(id, nome, idade, energia);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void atacar() {
        System.out.println("\nMago esta atacando...");

        if (Arma.getmagica() == true) {
            energia -= energia * 0.1 + 20;
        } else {
            energia = energia - 10;
        }
        System.out.println("Energia: " + energia);
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
    }
}
