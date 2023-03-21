public class Apartamento {
    //#region Atributos
    String endereco;
    int numQuartos;
    double area;
    double aluguel;

    public Apartamento(String endereco, int numQuartos, double area, double aluguel) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.area = area;
        this.aluguel = aluguel;
    }



//#endregion


    //#region metodos
    public void mostraInfo () {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de quartos: " + numQuartos);
        System.out.println("Área: " + area + "m²");
        System.out.println("Aluguel: R$" + aluguel);
    }

    public int numQuartos() {
        return this.numQuartos;
    }


    //#endregion
}
