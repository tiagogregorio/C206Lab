public class Carrinho extends Brinquedo {
    public Carrinho(String modelo, String cor) {
        super(modelo, cor);
    }
    @Override
    public void mostrarInfos() {
        System.out.println("--- Infos do Carrinho --- ");
        super.mostrarInfos();
    }
    @Override
    public void ligar() {
        System.out.println("O carrinho está ligado com controle remoto.");
    }
    @Override
    public void mover() {
        System.out.println("O carrinho está se movendo no chão.");
    }
}
