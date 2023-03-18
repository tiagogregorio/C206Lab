import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para permitir a entrada de dados

        System.out.print("Qual o tipo de combustível --> (A-Álcool, G-Gasolina): ");
        char tipo = sc.next().charAt(0); // Lê o tipo de combustível (A para alcool e G para gasolina)

        System.out.print("Informe a quantidade de litros vendidos: ");
        int litros = sc.nextInt(); // Lê a quantidade de litros vendidos

        /*Instanciando uma nova classe 'PostoCombustivel' e os parametros tipo e litros são passados para o construtor da classe 'PostoCombustivel'
        Isso quer dizer que podemos acessar os metodos e variaveis da instancia criada usando a referencia 'posto'*/
        PostoCombustivel posto = new PostoCombustivel(tipo, litros);

        //invoca o método 'calcularPrecoTotal()' no objeto 'posto' criado a partir da classe PostoCombustivel e depois imprime o resultado que retornou na tela
        posto.calcularPrecoTotal();
        System.out.printf("Total a pagar: R$ %.2f", posto.PrecoTotal());//"%.2f indica que o valor do preço total deve ser exibido com duas casas decimais
        sc.close(); //Fechar Scanner
    }
}
