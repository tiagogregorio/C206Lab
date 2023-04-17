public abstract class Habitante { //Habitantes com classe abstrata
    public static int contador = 0; //Contador Estatico
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    public Habitante(int id, String nome, int idade, float energia) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        contador++;//incrementa a quantidade de habitantes criados
    }

    public static int getContador() {
        if (contador == 0) {
            System.out.println("Não existem habitantes!");
        }
        return contador;
    }

    public void atacar() {

    }

    public abstract void curar();

    public void mostraInfo() {
        System.out.println("Identificação: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Energia atual: " + energia);
    }
}
