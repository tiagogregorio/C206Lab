public class Estudante {

    //#region Atributos
    String nome;
    int idade;
    String ano;
    //#endregion

    //#region Metodos mostrarInfos Estudante
    void mostrarInfos() {
// Aqui são mostradas todas as informações da escola
        System.out.println();
        System.out.println("--- INFORMAÇÕES DO ALUNO ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Ano Letivo : " + this.ano);
        System.out.println("*********************************");
    }
    //#endregion

}
