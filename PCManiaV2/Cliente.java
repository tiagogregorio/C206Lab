public class Cliente {

    //#region Atributos
    String nome;
    long cpf;
    int comp1 = 0, comp2 = 0, comp3 = 0;//Contador para verificarmos quantos computadores foram vendidos
    float conta;
    //#endregion

    //#region Metodos
    float calculaTotalCompra() {
        return conta;
    }
    //#endregion
}
