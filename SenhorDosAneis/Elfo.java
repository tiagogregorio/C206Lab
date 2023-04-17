public class Elfo extends Habitante implements Cura {
    private String tribo;

    public Elfo(int id, String nome, int idade, float energia) {
        super(id, nome, idade, energia);
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }

    public void viajar() {
        System.out.println("O Elfo " + this.nome + " esta viajando...");

    }

    @Override
    public void atacar() {
        System.out.println("\nElfo esta atacando...");

        if (Arma.getmagica() == false) {
            energia -= 20;
        } else {
            energia -= 10;
        }
        System.out.println("Energia: " + energia);
    }

    public void curar() {
        System.out.println("Elfo foi curado em 15%, energia atual: " + (energia * 0.15 + energia));
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n--- Infos do Elfo ---");
        super.mostraInfo();
        System.out.println("Tribo Elfo: " + tribo);
    }
}
