import java.util.Scanner;

class Imobiliaria {
    String nome;
    String telefone;
    String cidade;

    Apartamento[] apto;
    int numApto;

    public Imobiliaria() {
        this.apto = new Apartamento[30]; //Array contendo 30 posições
        this.numApto = 0;
    }

    void addApartamento(String endereco, int numQuartos, double area, double aluguel) {
        if (this.numApto >= 30) {
            System.out.println("Não é possível cadastrar mais apartamentos.");
            return;
        }

        Apartamento apto = new Apartamento(endereco, numQuartos, area, aluguel);


        this.apto[numApto] = apto;
        this.numApto++;

        System.out.println("Apartamento cadastrado com sucesso!");
    }

    void ajustaAluguel() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do apartamento: ");
        int numApartamento = sc.nextInt();

        if (numApartamento < 1 || numApartamento > this.numApto) {
            System.out.println("Apartamento não encontrado.");
            return;
        }

        Apartamento apartamento = this.apto[numApartamento - 1];
        for (int i = 0; i < this.numApto; i++) {
            Apartamento apto = this.apto[i];
            if (apto != null) {
                apto.aluguel += (apto.aluguel*0.05); //Ajuste de 5% no aluguel
            }
        }
        System.out.println("Aluguel ajustado em 5%.");
    }

    double mediaArea() {
        double somaArea = 0;
        int numApto2QuartosOuMenos = 0;

        for (int i = 0; i < this.numApto; i++) {
            Apartamento apto = this.apto[i];
            if (apto != null && apto.numQuartos <= 2) {
                somaArea += apto.area;
                numApto2QuartosOuMenos++;
            }
        }

        if (numApto2QuartosOuMenos > 0) {
            return somaArea / numApto2QuartosOuMenos;
        } else {
            System.out.println("Não há apartamentos com 2 quartos ou menos cadastrados.");
            return 0;
        }
    }

    public void mostraInfo() {

                System.out.println("Informações da imobiliária:");
                System.out.println("Nome: " + this.nome);
                System.out.println("Telefone: " + this.telefone);
                System.out.println("Cidade: " + this.cidade);

            System.out.println("\nApartamentos cadastrados:");
            for (int i = 0; i < this.numApto; i++) {
                if (this.apto[i] != null) {
                    Apartamento apto = this.apto[i];
                    System.out.println("Apartamento " + (i + 1) + ":");
                    System.out.println("Endereço: " + apto.endereco);
                    System.out.println("Número de quartos: " + apto.numQuartos);
                    System.out.println("Área: " + apto.area + "m²");
                    System.out.println("Valor do aluguel: R$" + String.format("%,.2f", apto.aluguel));
                    System.out.println();
                }
            }
        }
    }
