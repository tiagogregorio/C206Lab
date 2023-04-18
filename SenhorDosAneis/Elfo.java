public class Elfo extends Habitante implements Cura {
    // Atributos extras de um elfo
    private String tribo;

    public Elfo(String nome, int idade, float energia) {
        super(nome, idade, energia);
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }

    // Metódos do elfo
    public void viajar() {
        System.out.println("O Elfo " + this.nome + " esta viajando...");
    }

    // Métodos reescritos da classe mãe (Habitante)
    @Override
    public void atacar() {
        System.out.println("\nElfo esta atacando...");
        super.atacar(); ////Usando o super conseguimos reaproveitar o código
    }

    @Override // Método implementado a partir da interface de cura
    public void curar() {
        System.out.println("Elfo foi curado em 15%, energia atual: " + (energia * 0.15 + energia));
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n--- Infos do Elfo ---");
        super.mostraInfo();  //Usando o super conseguimos reaproveitar o mostraInfo de habitantes
        System.out.println("Tribo Elfo: " + tribo); // adicionamos as particularidades do elfo
    }
}
