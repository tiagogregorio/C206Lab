public class Computador {

    //#region Atributos
    String marca;
    float preco;
    //#endregion

    //#region Construtores
    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }
    //#endregion

    //#region "criar objetos" (Instanciar)
  
    //#region (Instância HardwareBasico)
    HardwareBasico promocao1 = new HardwareBasico("Processador Core i3", 2200);
    HardwareBasico promocao2 = new HardwareBasico("Pentium Core i5", 3370);
    HardwareBasico promocao3 = new HardwareBasico("Pentium Core i7", 4500);
    //#endregion

    //#region (Instância Sistema Operacional)
    SistemaOperacional promo1 = new SistemaOperacional("Linux Ubuntu", 32);
    SistemaOperacional promo2 = new SistemaOperacional("Windows 8", 64);
    SistemaOperacional promo3 = new SistemaOperacional("Windows 10", 64);
    //#endregion

    //#region(Instância Memória USB)
    MemoriaUSB[] memo = new MemoriaUSB[3];

    //#endregion

    //#endregion

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
