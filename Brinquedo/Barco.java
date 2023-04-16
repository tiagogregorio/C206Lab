public class Barco extends Brinquedo {
    public Barco(String modelo, String cor) {
        super(modelo, cor);

    }
    @Override
    public void mostrarInfos() {
        System.out.println("--- Infos do Barco ---");
        super.mostrarInfos();
    }
    @Override
    public void mover() {
        System.out.println("O Barco está se movendo...");
    }
    @Override
    public void ligar() {
        System.out.println("\nO barco está ligado.");
    }
}
