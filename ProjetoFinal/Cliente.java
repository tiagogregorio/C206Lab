public abstract class Cliente { //Cliente com classe abstrata
    // Características gerais dos cliente relacionado ao produto
    public static int contador = 0; //Contador Estatico
    protected int id;
    protected String nome;
    protected float valor;
    //Agregação
    Promocao promocao; //Promocao pode ter uma promo ou não

    //Construtor da classe Cliente
    public Cliente(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
        this.id = contador;
        contador++;//incrementa a quantidade de cliente criados na simulação
    }


    //Getter contador de clientes
    public static int getContador() {
        if (contador == 0) {
            System.out.println("Não existem Clientes cadastrados!");
        }
        return contador;
    }

    // Métodos gerais dos clientes
    public void analise() {
        System.out.println("Promoção Taxa Zero: " + promocao.getNomePromocao());
        if (promocao.isContemplado()) {//ja testa se é verdadeiro
            valor += 0; //Taxa zero na corretagem
            System.out.println("Cliente ganhou acesso aos relatórios dos Analistas e taxa zero para realizar corretagens.");
        } else {
            valor -= 10;
            System.out.println("Promoção encerrada! Cobrança de 10 para realizar operação.");
            System.out.println("Taxa cobrada: 10,00 reais");
        }
        System.out.println("Valor atual: " + valor);
    }

    public void mostraInfo() {
        System.out.println("Identificação: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Valor diponível: " + valor);
    }
}
