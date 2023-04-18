public class Anao extends Habitante implements Mineracao {
    // Atributos extras de um anão em relação ao habitante
    private float altura;
    private String reino;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public Anao(String nome, int idade, float energia) {
        super(nome, idade, energia);
    }

    // Métodos reescritos da classe mãe (Habitante) - Polimorfismo
    @Override
    public void atacar() {
        System.out.println("\nAnao atacando...");
        super.atacar(); // apontando para classe mae (atacar)
    }
    @Override
    public void mostraInfo() {
        System.out.println("\n--- Infos do Anao ---");
        super.mostraInfo();
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Reino: " + reino);
    }

    // Método implementado a parti da interface de mineraçã
    @Override
    public void minerar() {
        System.out.println("O Anão esta mineirando...");
    }

}
