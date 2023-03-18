public class Escola {
    //#region Atributos
    //Atributos explícitos - Apresentado na UML
    String nome;
    String email;
    String numTelefone;
    String endereco;

    //Atributos implicitos - Não está na UML, mas está presente no texto
    Estudante[] estudantes = new Estudante[300]; //Array com 300 estudantes - AGREGAÇÃO

    //#endregion

    //#region Construtores
    //Construtor da Escola
    public Escola(String nome, String email, String numTelefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    //#endregion

    //#region Metodos
    /* Metódos para implementação no menu - Todos os metódos para as opções
    do menu devem estar em escola e não na main
     */

    //#region Metodo addEstudante
    void addEstudantes(Estudante e) {
        /*Aqui percorremos o array de "estudantes" que foi criado por agregação na parte superior*/
        for (int i = 0; i < this.estudantes.length; i++) {
            /*Lembre-se que em uma array por objetos todas as posições(Caso não preenchidas com objetos anteriormente)
             * Terão valor null, o que estamos fazendo aqui é verificando se a posição i que queremos está vazia*/
            if (this.estudantes[i] == null) {
                this.estudantes[i] = e; // Atribuimos o estudante adicionado através do menu na posição i
                /* O break é ESSENCIAL, ele para a execução na posição onde você quer o estudante,
                sem ele todos as posições do array poderão ter o mesmo estudante
                 */
                break;
            }
        }
    }
    //endregion

    //#region Metodo qtdEstudantesAno
    void qtdEstudantesAno() {
        // Variáveis locais que serã utilizadas no meu metódo
        int contaPrimeiro = 0; // Armazena a quantidade de alunos no primeiro ano
        int contaSegundo = 0;// Armazena a quantidade de alunos no segundo ano
        int contaTerceiro = 0; // Armazena a quantidade de alunos no terceiro ano

        // Aqui são mostradas todas as informações dos estudantes
        // Percorrendo o array de estudantes, como feito anteriormente
        for (int i = 0; i < estudantes.length; i++) {
            /*Neste momento a verificação não é se as posições estão vazias, mas sim se temos estudantes naquela posição,
            lembrando que em todas as posições temos null, nas posições onde temos valores diferentes
            de null temos estudantes*/
            if (estudantes[i] != null) {
                if (estudantes[i].ano.toUpperCase().equals("PRIMEIRO")) {
                    contaPrimeiro++;
                }
                if (estudantes[i].ano.toUpperCase().equals("SEGUNDO")) {
                    contaSegundo++;
                }
                if (estudantes[i].ano.toUpperCase().equals("TERCEIRO")) {
                    contaTerceiro++;
                }
            }
        }
        System.out.println();
        System.out.println("++++ QUANTIDADE DE ALUNOS POR ANO +++");
        System.out.println("1º ANO : " + contaPrimeiro);
        System.out.println("2º ANO: " + contaSegundo);
        System.out.println("3º ANO: " + contaTerceiro);
    }
    //#endregion

    //#region Metodo MostrarInfos
    void mostrarInfos() {
        System.out.println("### INFORMAÇÕES DA ESCOLA ###");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.numTelefone);
        System.out.println("Endereço: " + this.endereco);
        // INFORMAÇÕES DO ESTUDANTE
        // Percorrendo o array de estudantes, como feito anteriormente
        for (int i = 0; i < estudantes.length; i++) {
            /*Neste momento a verificação não é se as posições estão vazias, mas sim se temos estudantes naquela posição,
            lembrando que em todas as posições temos null, nas posições onde temos valores diferentes
            de null temos estudantes*/
            if (estudantes[i] != null) {
                System.out.println();
                System.out.println("*********************************");
                System.out.println("Aluno na posição [" + i + "] do meu array");
                estudantes[i].mostrarInfos();
            }
        }
    }
    //#endregion

    //#endregion

}
