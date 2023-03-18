
public class Main {
    public static void main(String[] args) {

        /*
    Composição: A existência do objeto depende da existência do outro objeto.
        Ex.: Para a existência da Arma, precisa existir um objeto Nave. Quando instancia-se
        uma Nave, instancia-se, também, uma Arma (a instância é feita dentro do construtor da Nave.
    Agregação: A exstência do objeto NÃO depende da existência do outro objeto.
        Ex.: Para a existência (objeto) da Arma, NÃO precisa existir um objeto Nave. Nesse caso,
        adicionamos pelo construtor ou um método adicionarArma, passando a referência da Arma como
        parâmetro.
 */


        //instanciando uma nave
        //adicionando por Composicao
        Nave n1 = new Nave("Falcon", 500, false, "FOGO", 500);

        //instanciando uma arma
        //Arma a1 = new Arma("Fogo", 300);
        //metodo para adicionar uma arma por meio da Agragacao
        n1.addArma(a1);
        n1.MostraInfo();
    }
}
