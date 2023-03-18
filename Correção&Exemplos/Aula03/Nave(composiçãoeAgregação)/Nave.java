
public class Nave {

    String nome;
    int velocidade;
    boolean velociadadeDaLuz;
    Arma arma = null;

    //adicionando arma como composicao
    public Nave(String nome, int velocidade, boolean velociadadeDaLuz, String tipoarma, int forcaarma) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velociadadeDaLuz = velociadadeDaLuz;

        //Agregacao
        //this.arma = arma;

        //Composicao
        this.arma = new Arma(tipoarma, forcaarma);
    }

    public void MostraInfo() {
        System.out.println("Nome da nave: " + this.nome);
        System.out.println("velocidade da nave: " + this.velocidade);

        //se foi adicionada uma arma pelo metodo (Agregacao)
        if (this.arma == null) {
            System.out.println("Nao tem arma adicionada");
        } else {
            System.out.println("Tipo da arma: " + this.arma.tipo);
            System.out.println("Forca da arma: " + this.arma.forca);
        }
    }

    //metodo viajar velocidade da luz
    public void viajarVelocidadedaLuz() {
        if (this.velociadadeDaLuz == true) {
            System.out.println("Viaja em velocidade da luz");
        } else {
            System.out.println("Nao viaja em velocidade da luz");
        }
    }

    //metodo para adicionar arma por meio da Agregacao
    public void addArma(Arma arma) {
        System.out.println("Arma foi adicionada");
        this.arma = arma;
    }
}
