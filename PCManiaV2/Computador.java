public class Computador {

    //#region Atributos
    String marca;
    float preco;
    MemoriaUSB memoria;
    SistemaOperacional sisoperacional;
    HardwareBasico hardwareb;
    MemoriaUSB[] memo = new MemoriaUSB[3];

    //#endregion
    public Computador() {
        sisoperacional = new SistemaOperacional();
        hardwareb = new HardwareBasico();
    }

    //#region Metodos

    //#region Metodo MostraPCConfigs
    void mostraPCConfigs() {
        System.out.println("Marca: " + this.marca);
        System.out.printf("Preço unitário: %.2f\n", this.preco);//Imprimir duas casas depois da virgula "%.2f", onde o ".2" indica o número de casas decimais \n pular linha
    }
    //#endregion

    //#region Metodo addMemoriaUSB
    void addMemoriaUSB(MemoriaUSB musb) {
        for (int i = 0; i < memo.length; i++) {
            if (memo[i] == null) {//Adiciona na posição vazia
                memo[i] = musb;
                break; //Importante para não adicionar o mesmo valor em todos as posições
            }
        }
    }
    //#endregion

    //#endregion

}
