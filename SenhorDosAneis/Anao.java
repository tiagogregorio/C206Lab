public class Anao extends Habitante implements Mineracao, Cura {
    private float altura;
    private String reino;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public Anao(int id, String nome, int idade, float energia) {
        super(id, nome, idade, energia);
    }

    @Override
    public void atacar() {
        System.out.println("\nAnao atacando...");

        if (Arma.getmagica() == false) {
            energia -= 20;
        } else {
            energia -= 10;
        }
        System.out.println("Energia: " + energia);
    }

    @Override
    public void curar() {
        System.out.println("Anao foi curado em 15%, energia atual: " + (energia * 0.15 + energia));
    }

    @Override
    public void minerar() {
        System.out.println("O Anão esta mineirando...");
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n--- Infos do Anao ---");
        super.mostraInfo();
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Reino: " + reino);
    }
}
