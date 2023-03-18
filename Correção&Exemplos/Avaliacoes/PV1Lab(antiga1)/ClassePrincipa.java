import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ClassePrincipa {
    public static void main(String[] args) {

        Produto[] produto = new Produto[100];
        Scanner cin = new Scanner(System.in);

        Empresa empresa1;
        empresa1=new Empresa("JFL");

        boolean flag=true;

        while(flag)
        {
            System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao menu de informações da empresa:");
            System.out.println("1 - Adicionar um produto a empresa.");
            System.out.println("2 - Mostrar as informações da empresa e do produto");
            System.out.println("3 - Nomes dos produtos de um fabricante especifico");
            System.out.println("4 - Porcentagem dos produtos com avaliacao maior ou igual a 3 e disponiveis. ");
            System.out.println("5- Comprar um produto. ");
            System.out.println("6- Sair do menu");


            //System.out.println("3 - Alugar o livro.");
            //System.out.println("4 - Para sair do menu.");

            int op = cin.nextInt();
            switch (op){
                case 1:
                    System.out.println("Entre com o nome do produto:");
                    cin.nextLine();
                    String nome = cin.nextLine();
                    System.out.println("Entre com a nota do produto:");
                    int nota = cin.nextInt();
                    cin.nextLine();
                    System.out.println("Entre com o PN do produto:");
                    String PN = cin.nextLine();
                    System.out.println("Entre com a quantidade de produtos:");
                    int quant = cin.nextInt();
                    cin.nextLine();
                    System.out.println("Entre com o nome do fabricante:");
                    String nomefab = cin.nextLine();
                    System.out.println("Entre com o CNPJ do fabricante:");
                    String cnpjfab = cin.nextLine();
                    Produto prod = new Produto(nome, nota, PN, quant, nomefab, cnpjfab);
                    empresa1.adicionaProduto(prod);
                    break;
                case 2:
                    empresa1.mostraInfo();
                    break;
                case 3:
                    cin.nextLine();
                    System.out.println("Entre com o cnpj do fabricante especifico:");
                    String cnpjfabricante= cin.nextLine();
                    empresa1.mostraProdutosEspecificos(cnpjfabricante);
                    break;
                case 4:
                    empresa1.verificaMelhoresProdutos();
                case 5:
                    cin.nextLine();
                    System.out.println("Entre com o PN do produto:");
                    String pn = cin.nextLine();
                    empresa1.comprarProduto(pn);
                    if(empresa1.comprarProduto(pn)==false)
                        System.out.println("Produto se encontra indisponivel para venda");
                    else
                        System.out.println("Seu produto foi comprado com sucesso");
                case 6:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }


    }


}
