public abstract class Habitante { //Habitantes com classe abstrata
    // Características gerais dos habitantes da terra média
    public static int contador = 0; //Contador Estatico
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    //Agregação
    Arma arma; //Habitante pode ter uma arma ou não

    //Construtor da classe Habitante
    public Habitante(String nome, int idade, float energia) {
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        contador++;//incrementa a quantidade de habitantes criados
        this.id = contador;
    }

    //Getter contador de habitantes
    public static int getContador() {
        if (contador == 0) {
            System.out.println("Não existem habitantes!");
        }
        return contador;
    }

    // Métodos gerais dos habitantes da terra média
    public void atacar() {
        System.out.println("Arma utilizada: " + arma.getNomeArma());
        if (arma.isMagica()) {//ja testa se é verdadeiro
            energia -= 20;
            System.out.println("A arma é mágica, energia gasta (20)");
        } else {
            energia -= 10;
            System.out.println("A arma não é magica, energia gasta (10)");
        }
        System.out.println("Energia atual: " + energia);
    }

    public void mostraInfo() {
        System.out.println("Identificação: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Energia atual: " + energia);
    }
}
