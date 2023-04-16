public class Aviao extends Brinquedo {
    private int qtdMotores;
    public Aviao(String modelo, String cor) {
        super(modelo, cor);
    }
    public void setQtdMotores(int qtdMotores) {
        if (qtdMotores <= 4 && qtdMotores > 0) //Setando valores maximos e minimos para o motor do aviao
            this.qtdMotores = qtdMotores;
        else {
            System.out.println("Não existe aviao com essa quantidade de motores...");
        }
    }
    @Override //Reescrita do metodo para qtdMotores
    public void mostrarInfos() {
        System.out.println("--- Infos do Aviao ---");
        super.mostrarInfos();//chamando o método mostrar infos da classe mãe
        System.out.println("Quantidade Motores: " + qtdMotores);
        System.out.println(" ");
    }
    @Override
    public void ligar() {
                System.out.println("\nO Aviao está ligado...");
    }
    @Override
    public void mover() {
                System.out.println("O Aviao está voando...");
    }
}
