import java.util.Scanner;

class Imobiliaria {
    String nome;
    String telefone;
    String cidade;

    Apartamento[] apartamentos = new Apartamento[10];


    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }


    void addApartamento(Apartamento apto) {

        //Se quantidade de apartamento for menor que 30 consigo cadastrar
        for (int i = 0; i <this.apartamentos.length ; i++) {
            if (apartamentos[i] == null) {
                apartamentos[i] = apto;
                break;
            }
            System.out.println("Apartamento cadastrado com sucesso!");
        }
    }

    void ajustaAluguel() {

        for (int i = 0; i <this.apartamentos.length ; i++) {
            if (apartamentos[i] != null) {
                this.apartamentos[i].aluguel+=apartamentos[i].aluguel*0.05;
            }

        }
        System.out.println("Aluguel ajustado em 5%.");
    }

    double mediaArea() {
        int somaArea = 0;
        int contaApartamento=0;

        for (int i = 0; i <this.apartamentos.length ; i++) {
            if (apartamentos[i] != null && apartamentos[i].numQuartos<=2) {
                somaArea += apartamentos[i].area;
                contaApartamento++;
            }

        }
        return (somaArea/contaApartamento);
    }

    public void mostraInfo() {

        System.out.println("Informações da imobiliária:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Cidade: " + this.cidade);

        System.out.println("\nApartamentos cadastrados:");
        for (int i = 0; i <apartamentos.length ; i++) {
            if (apartamentos[i] != null) {
                apartamentos[i].mostraInfo();
            }
        }
    }

}
