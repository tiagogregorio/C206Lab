public class TerraMedia {
    // Atributos implícitos da terra média
    private Habitante[] herois;//array de habitantes

    public TerraMedia() {
        this.herois = new Habitante[10];//Inicializa o array com 10 posições (composição)
    }

    // Métodos própios da classe
    // 1- Permite adicionar habitantes na terra média
    public void addHabitante(Habitante habitante) {
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] == null) { //se aquela posição i está vazia
                herois[i] = habitante;
                break;
            }
        }
    }

    //2 - Listar habitantes ( Mostrar todas as infos acerca daqueles habitantes )
    public void listarHabitantes() {
        for (int i = 0; i < herois.length; i++) {//For para percorrer todos os habitantes da terra média
            if (herois[i] != null) { //Verificando se existe um habitante naquela posição i
                // Verificando de qual tipo é aquele habitante
                if (herois[i] instanceof Anao) {
                    // Realizando casting para Anao
                    // herois[i] -> Habitante
                    Anao anao = (Anao) herois[i];
                    anao.mostraInfo();
                    anao.minerar();
                    anao.atacar();
                } else if (herois[i] instanceof Elfo) {
                    // Realizando casting para Elfo
                    Elfo elfo = (Elfo) herois[i];
                    elfo.mostraInfo();
                    elfo.viajar();
                    elfo.atacar();
                    elfo.curar();
                } else if (herois[i] instanceof Mago) {
                    // Realizando casting para Mago
                    Mago mago = (Mago) herois[i];
                    mago.mostraInfo();
                    mago.atacar();
                    mago.curar();
                }
            }
        }
        System.out.println();
    }
}
