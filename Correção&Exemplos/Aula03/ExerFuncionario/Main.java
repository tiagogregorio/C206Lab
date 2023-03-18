
public class Main {
    public static void main(String[] args) {

        //instanciando novos funcionarios
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
       // Funcionario f2 = new Funcionario(21, "victor" , 1111111 , 500);

        //atributos do funcionario f1
        f1.salario = 500;
        f1.cpf = 123;
        f1.nome=" Victor";
        f1.idade=21;

        //atributos do funcionario f2
        f2.salario = 400;
        f2.cpf = 232332;
        f2.nome = " Yves";
        f2.idade = 20;

        //igualando os ponteiros
        f1 = f2;

        if(f1==f2){
            System.out.println("Sao os mesmos objetos");
        }
        else
            System.out.println("Sao objetos diferentes");


        //metodos do funcionario f1
        System.out.println("O salario anual do victor eh: ");
        System.out.println(f1.salarioAnual());
        System.out.println();

        f1.tirarFerias("junho", 27);
    }
}
