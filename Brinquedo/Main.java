public class Main {
    public static void main(String[] args) {
        //Letra A (adicionar um brinquedo de cada tipo na coleção de brinquedos
        Aviao avi = new Aviao("Jato", "Grafite");
        avi.setQtdMotores(4);
        Carrinho car = new Carrinho("Mustang", " Cinza");
        Barco barc = new Barco("Veleiro", "Branco");

        ColecaoBrinquedos colecao = new ColecaoBrinquedos(); // instanciando uma coleção de brinquedos
        //Adicionando os 3 objetos
        colecao.adicionarBrinquedos(avi);
        colecao.adicionarBrinquedos(car);
        colecao.adicionarBrinquedos(barc);

        //Letra B - Apresentar a informação de cada um desses brinquedos através do método listarBrinquedos() da coleção de brinquedos
        //Letra C - Mostrar tbm que foi realizado polimorfismo de maneira correta e conseguiu mover e livar o carrinho e o aviao.
        //No metodo para listarBrinquedos tbm tera que chamar os métodos de mover e ligar das respectivas classes
        colecao.listarBrinquedos();

        //Letra D - Mostra quantidade de brinquedos que foram criados utilizando membro estático da classe de brinquedo
        System.out.println("Quantidade de Brinquedos: " + Brinquedo.getQtdBrinquedos());
    }
}
