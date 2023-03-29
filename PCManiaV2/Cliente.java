public class Cliente {

    //#region Declaração dos atributos públicos nome, cpf do cliente e do array de computadores
    public String nome;
    public long cpf;
    Computador[] computadores = new Computador[10];
    //#endregion

    //#region Construtores
    public Cliente() {
        this.nome = nome;
        this.cpf = cpf;

    }
    //#endregion

    //#region Metodos
    float calculaTotalCompra() {
        //Declaração da variável somaTotal, que irá armazenar o valor total da compra
        float somaTotal = 0;

        for (int i = 0; i < computadores.length; i++) { //Percorre o array de computadores
            if (computadores[i] != null) { //Verifica se o computador na posição atual não é nulo
                somaTotal += computadores[i].preco; ////Adiciona o preço do computador na somaTotal
            }
        }
        return somaTotal; ////Retorna o valor total da compra
    }
}   //#endregion
