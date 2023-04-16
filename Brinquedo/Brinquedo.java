public class Brinquedo {
    private String modelo;
    private String cor;
    private static int qtdBrinquedos = 0;// Estatico
  
    public Brinquedo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        qtdBrinquedos++; //incrementa a quantidade de brinquedos criados
    }

    //#region    Getters and Setters
    public static int getQtdBrinquedos() {
        if (qtdBrinquedos == 0) {
            System.out.println("Não existem brinquedos!");
        }
        return qtdBrinquedos;
    }
    //#endregion

    //#region METODOS
    public void mover() {
        System.out.println("O brinquedo está se movendo...");
    }

    public void ligar() {
                System.out.println("O brinquedo está ligado.");
    }

    public void mostrarInfos() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
    }
//#endregion
}
