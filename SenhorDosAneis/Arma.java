public class Arma {
    // Atributos ( Características gerais das armas dos habitantes )
    private String nomeArma;
    private boolean magica;

    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    //Getters Permitem que modifiquemos as características da arma
    public boolean isMagica() {
        return magica;
    }
    public String getNomeArma() {
        return nomeArma;
    }
}
