public class Carro {

    private String cor;
    private String marca;
    private double velocidadeMax;
    private double velocidadeAtual;
    private Motor motor;

    public Carro(String cor, String marca, double velocidadeMax, double velocidadeAtual, Motor motor) {
        this.cor = cor;
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void ligar() {
        System.out.println("O carro está ligado.");
    }
    public void acelerar() {
        velocidadeAtual++;
        System.out.println("Acelerando para " + velocidadeAtual + " km/h.");
    }
    public void mostraInfos() {
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade máxima: " + velocidadeMax + " km/h");
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

}
