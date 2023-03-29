public class Computador {

    //#region Atributos
    //Definição dos atributos da classe Computador
    String marca; //marca do computador
    float preco; //preço do computador
    MemoriaUSB memoria; //objeto da classe MemoriaUSB
    SistemaOperacional sisoperacional; //objeto da classe SistemaOperacional
    HardwareBasico[] hardwareb; //array de objetos da classe HardwareBasico
    //#endregion

    //#region Construtores
    public Computador() {
        sisoperacional = new SistemaOperacional(); // composicao
        hardwareb = new HardwareBasico[3]; //composicao
    }
    //#endregion

    //#region Metodos

    //#region Metodo MostraPCConfigs
    void mostraPCConfigs() { // //Exibição das informações do computador
        for (int i = 0; i < hardwareb.length; i++) { //percorrer o array hardwareb (tamanho)

            System.out.println("Marca: " + this.marca);
            System.out.println("Sistema Operacional: " + sisoperacional.nome + " (" + sisoperacional.tipo + " Bits)");
            System.out.printf("Preço unitário: %.2f\n", this.preco);//Imprimir duas casas depois da virgula "%.2f", onde o ".2" indica o número de casas decimais \n pular linha

            //Condicional para exibir as informações do processador, RAM e armazenamento
            if (hardwareb != null) {
                System.out.println("Processador: " + hardwareb[i].nome + hardwareb[i].capacidade + "MHZ");
                System.out.println("RAM: " + hardwareb[i + 1].capacidade + "Gb        Armazenamento: " + hardwareb[i + 2].capacidade + "Gb ");
                break;
            }
        }
        // //Condicional para exibir a informação da memória USB, caso exista
        if (memoria != null) {
            System.out.println("MemóriaUSB: " + memoria.nome + " " + memoria.capacidade + "Gb"); //mostra memoria USB
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("Não acompanha brinde");
        }
    }
    //#endregion

    //#region Metodo addMemoriaUSB
    ////Método para adicionar uma memória USB ao computador
    void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;
    }

    //#endregion

    //#endregion

}
