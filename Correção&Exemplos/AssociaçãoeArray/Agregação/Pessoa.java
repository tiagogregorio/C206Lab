import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir os dados da pessoa
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", idade: " + idade);
    }
}

/*Neste exemplo agregação "cristal aberto", utilizamos um array para armazenar objetos do tipo Pessoa.
A classe Pessoa possui dois atributos públicos (nome e idade) e um construtor que recebe
esses dois valores. No Main, criamos um array de tamanho 2 e adicionamos dois objetos Pessoa ao array.
Em seguida, iteramos pelo array e imprimimos o nome e idade de cada objeto Pessoa.
É importante lembrar que, ao utilizar atributos públicos, não há necessidade de utilizar
métodos get e set para acessá-los.
A agregação é um relacionamento entre duas classes em que uma delas é composta por instâncias da outra,
mas as instâncias da classe que está sendo agregada podem existir independentemente da classe que está
agregando.

No exemplo a classe Main cria um array de objetos Pessoa e, em seguida, adiciona objetos
Pessoa a esse array. Cada objeto Pessoa é independente do array e pode existir sem ele.
Além disso, a classe Pessoa não é destruída quando o array é destruído, o que significa que
o relacionamento entre as duas classes é de agregação.
Já a composição é um relacionamento em que uma classe é composta por instâncias de outras classes,
 e as instâncias da classe que está sendo composta não podem existir independentemente da classe que
  está compondo. Em outras palavras, a classe que está sendo composta faz parte da classe que está
  compondo.*/
