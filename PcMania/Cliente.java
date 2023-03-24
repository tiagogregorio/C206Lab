public class Cliente {

    //#region Atributos
    String nome;
    long cpf;
    int comp1 = 0, comp2 = 0, comp3 = 0;//Contador para verificarmos quantos computadores foram vendidos
    //#endregion

    //#region Estanciando Computador
    Computador computador1 = new Computador("Positivo", 2300);
    Computador computador2 = new Computador("Acer", 5800);
    Computador computador3 = new Computador("Vaio", 1800);
    //#endregion

    //#region Construtor
    public Cliente(String nome, long cpf, int comp1, int comp2, int comp3) {
        this.nome = nome;
        this.cpf = cpf;
        this.comp1 = comp1;
        this.comp2 = comp2;
        this.comp3 = comp3;
    }
    //#endregion

    //#region Metodos
    float calculaTotalCompra() {
        float total;
        total = (comp1 * computador1.preco) + (comp2 * computador2.preco) + (comp3 * computador3.preco);
        return total;
    }
    //#endregion
}
