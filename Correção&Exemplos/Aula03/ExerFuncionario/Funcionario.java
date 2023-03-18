
public class Funcionario {


    //atributos
    int idade;//idade do funcionario
    String nome;//nome do funcionario
    int cpf;//cpf do funcionario
    float salario;//salario do funcionario

    /*
    //construtor do funcionario
       public Funcionario(int idade, String nome, int cpf, float salario) {
        System.out.println("Criou um novo funcionario");
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
     */

    //METODOS DOS FUNCIONARIOS
    public void tirarFerias(String mes, int qtddias)
    {
        System.out.println("O funcionario " + nome + " tirou ferias no mes de " + mes + " durante " + qtddias + " dias.");
    }

    public float salarioAnual()
    {
        float salaAnual = salario *12;
        return salaAnual;
    }

    public float salarioAnual(float decimoterceiro)
    {
        float salaAnual = salario *12;
        return salaAnual + decimoterceiro;
    }

    public float salarioAnual(float decimoterceiro, float decimoquarto)
    {
        float salaAnual = salario *12;
        return salaAnual +decimoterceiro+ decimoquarto;

    }
}
