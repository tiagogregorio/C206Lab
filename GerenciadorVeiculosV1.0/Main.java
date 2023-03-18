public class Main {
    public static void main(String[] args) {
        System.out.println("\n* Gerenciador de Veículos *\n");

        Motor motor1 = new Motor(111, "1.8 Flex");
        Carro carro1 = new Carro("Grafite", "Chevrolet", 180, 150, motor1);

        Motor motor2 = new Motor(84, "1.0 TotalFlex");
        Carro carro2 = new Carro("Branco", "Volkswagen", 164, 80, motor2);

        Motor motor3 = new Motor(155, "2.0 i-VTEC FlexOne");
        Carro carro3 = new Carro("Cinza", "Honda", 272, 30, motor3);

        Motor motor4 = new Motor(176, "1.5 3C Ti-VCT");
        Carro carro4 = new Carro("Vermelho", "Ford", 180, 100, motor4);

        carro1.ligar();
        motor1.mostraInfos();
        carro1.mostraInfos();
        carro1.acelerar();
        System.out.println();

        carro2.ligar();
        motor2.mostraInfos();
        carro2.mostraInfos();
        carro2.acelerar();
        System.out.println();

        carro3.ligar();
        motor3.mostraInfos();
        carro3.mostraInfos();
        carro3.acelerar();
        System.out.println();

        carro4.ligar();
        motor4.mostraInfos();
        carro4.mostraInfos();
        carro4.acelerar();
        System.out.println();
    }
}
