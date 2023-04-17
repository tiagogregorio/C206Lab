public class Arma {
    private String nomeArma;
    private static boolean magica;

    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    public static boolean getmagica() {
        return magica;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void mostrarInfos() {
        System.out.println("Arma: " + nomeArma);
        System.out.println("Magica: " + magica);
    }

}
