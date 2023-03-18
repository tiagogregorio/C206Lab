public class Calculadora {

    //#region variáveis de instância privada da classe "Calculadora"
    private double num1;
    private double num2;
    //#endregion

    //#region construtor da classe "Calculadora"

    /*No caso desse construtor, ele recebe dois parâmetros do tipo "double" (num1 e num2) e inicializa as variáveis de instância "num1" e
    "num2" da classe "Calculadora" com os valores passados como parâmetros.A palavra-chave "this" é usada para se referir às variáveis de instância da própria classe.
    Isso é necessário porque os nomes das variáveis de parâmetro ("num1" e "num2") são iguais aos nomes das variáveis de instância da classe, e o uso do "this" indica
   que queremos nos referir às variáveis da classe e não às variáveis de parâmetro.Em resumo, esse construtor é usado para inicializar os valores dos atributos da classe
   "Calculadora" com os valores passados pelo usuário durante a criação do objeto da classe.
     */
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //endregion

    //#region Metodos
    /*
    /método público da classe "Calculadora" em Java, chamado "soma", não recebe nenhum parâmetro e não retorna nenhum valor,
    pois ele apenas realiza uma operação de soma com os valores armazenados nas variáveis de instância "num1" e "num2" e imprime o resultado.
    O método começa criando uma variável local chamada "resultado", do tipo "double", e calcula a soma dos valores armazenados em "num1" e "num2".
    Em seguida, ele chama outro método chamado "mostrarResultado" e passa o valor do resultado como parâmetro.
         */
    public void soma() {
        double resultado = num1 + num2;
        mostrarResultado(resultado); //metodo para mostrar o resultado
    }

    public void subtrai() {
        double resultado = num1 - num2;
        mostrarResultado(resultado);
    }

    public void multiplica() {
        double resultado = num1 * num2;
        mostrarResultado(resultado);
    }

    public void divide() {
        if (num2 == 0) {
            System.out.println("ERRO Matemático! Divisão por zero...");
            return;
        }
        double resultado = num1 / num2;
        mostrarResultado(resultado);
    }

    public void exponencial() {
        double resultado = Math.pow(num1, num2);
        mostrarResultado(resultado);
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }
    //#endregion
}
