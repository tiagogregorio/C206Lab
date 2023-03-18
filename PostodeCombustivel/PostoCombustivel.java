import java.util.Scanner;

public class PostoCombustivel {
    //#region declaram variáveis de instância privadas na classe
    private char tipo; // declara uma variável de instância do tipo char chamada tipo, que armazena o tipo de combustível (A - álcool ou G-Gasolina)
    private int litros; // declara uma variável de instância do tipo int chamada litros, que armazena a quantidade de litros de combustível a ser abastecida.
    private double precoLitro; // declara uma variável de instância do tipo double chamada precoLitro, armazena o preço do litro do combustível.
    private double desconto; //declara uma variável de instância do tipo double chamada desconto, armazena o valor do desconto a ser aplicado no preço total.
    private double precoTotal; //declara uma variável de instância do tipo double chamada precoTotal, armazena o preço total do abastecimento (quantidade de litros multiplicada pelo preço do litro, com o desconto aplicado).
    //#endregion

    //#region Construtor
    //define o construtor da classe PostoCombustivel. Um construtor é um método especial que é chamado quando um objeto da classe é criado usando a palavra-chave new.
    // Nesse caso, o construtor recebe dois parâmetros: tipo e litros.
    public PostoCombustivel(char tipo, int litros) {
        this.tipo = tipo; //significa que o atributo tipo da classe está sendo inicializado com o valor do parâmetro tipo passado para o construtor. O this é usado para se referir ao objeto atual da classe.
        this.litros = litros; //faz o mesmo para o atributo litros. Ele inicializa o atributo litros da classe com o valor do parâmetro litros passado para o construtor.
    }
    //#endregion

    //#region testes, descontos realizados de acordo com tipo de combustivel, calcularpreçototal
    /*O método público calcularPrecoTotal() é responsável por calcular o preço total a ser pago pelo cliente.
    Ele não retorna nenhum valor, mas atualiza o valor da variável precoTotal na instância da classe PostoCombustivel. O cálculo é feito com base nas informações
     de tipo, litros, precoLitro e desconto da instância atual da classe. O resultado é armazenado na variável precoTotal.
     */
    public void calcularPrecoTotal() {
        if (tipo == 'G') {
            while (litros <= 0) {
                System.out.println("Quantidade invalida, entre com valores maiores que zero");
                System.out.print("Informe a quantidade de litros vendidos: ");
                litros = new Scanner(System.in).nextInt();
            }
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
            precoLitro = 6.0;
        } else {
            while (litros <= 0) {
                System.out.println("Quantidade invalida, entre com valores maiores que zero");
                System.out.print("Informe a quantidade de litros vendidos: ");
                litros = new Scanner(System.in).nextInt();
            }
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
            precoLitro = 4.9;
        }
        precoTotal = litros * precoLitro * (1 - desconto);
    }
//#endregion

    //#region retornar com o preço total
    public double PrecoTotal() {//método público da classe PostoCombustivel que retorna o valor da variável precoTotal
        return precoTotal;
    }
    //#endregion
}
