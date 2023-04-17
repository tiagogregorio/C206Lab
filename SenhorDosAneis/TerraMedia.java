public class TerraMedia {
    private Habitante[] herois;//array de habitantes

    public TerraMedia() {
        this.herois = new Habitante[10];//Inicializa o array com 10 posições (composição)
    }

    public void addHabitante(Habitante habitante) {
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] == null) {
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes() {
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] instanceof Anao) {
                Anao anao = (Anao) herois[i];
                anao.mostraInfo();
                anao.minerar();
                anao.atacar();
                anao.curar();
            } else if (herois[i] instanceof Elfo) {
                Elfo elfo = (Elfo) herois[i];
                elfo.mostraInfo();
                elfo.viajar();
                elfo.atacar();
                elfo.curar();
            } else if (herois[i] instanceof Mago) {
                Mago mago = (Mago) herois[i];
                mago.mostraInfo();
                mago.atacar();
                mago.curar();
            }
        }
        System.out.println();
    }
}
