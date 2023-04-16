public class ColecaoBrinquedos {
    private Brinquedo[] brinquedos; //array de brinquedos
    public ColecaoBrinquedos() {
        this.brinquedos = new Brinquedo[10]; //inicializa o array com 10 posições (composição)
    }

    //#region Metodos
    public void adicionarBrinquedos(Brinquedo brinquedo) {
        for (int i = 0; i < brinquedos.length; i++) {
            if (brinquedos[i] == null) {
                brinquedos[i] = brinquedo;
                break;
            } else if (i > 10) {
                System.out.println("Coleção cheia!");
            }
        }
    }

    public void listarBrinquedos() {
        for (int i = 0; i < brinquedos.length; i++) {
            if (brinquedos[i] instanceof Carrinho) {
                Carrinho carrinho = (Carrinho) brinquedos[i];
                carrinho.ligar();
                carrinho.mover();
                carrinho.mostrarInfos();
            } else if (brinquedos[i] instanceof Aviao) {
                Aviao aviao = (Aviao) brinquedos[i];
                aviao.ligar();
                aviao.mover();
                aviao.mostrarInfos();
            } else if (brinquedos[i] instanceof Barco) {
                Barco barco = (Barco) brinquedos[i];
                barco.ligar();
                barco.mover();
                barco.mostrarInfos();
            }
        }
        System.out.println();
    }
}
//#endregion



