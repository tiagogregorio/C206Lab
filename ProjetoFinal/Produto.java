public class Produto {
    // Atributos implícitos de produto
    private Cliente[] usuario;//array de clientes

    public Produto() {
        this.usuario = new Cliente[10];//Inicializa o array com 10 posições (composição)
    }

    // Métodos própios da classe
    // 1- Permite adicionar Clientes em Produto
    public void addCliente(Cliente cliente) {
        for (int i = 0; i < usuario.length; i++) {
            if (usuario[i] == null) { //se aquela posição i está vazia
                usuario[i] = cliente;
                break;
            }
        }
    }

    //2 - Listar Clientes ( Mostrar todas as infos dos clientes )
    public void listarClientes() {
        for (int i = 0; i < usuario.length; i++) {//For para percorrer todos os cleintes
            if (usuario[i] != null) { //Verificando se existe um cliente na posição i
                // Verificando de qual tipo
                if (usuario[i] instanceof Cdb) {
                    // Realizando casting para Cdb
                    Cdb cdb = (Cdb) usuario[i];
                    cdb.mostraInfo();
                    cdb.protecao();
                    cdb.liquidez();
                    cdb.analise();
                } else if (usuario[i] instanceof Selic) {
                    // Realizando casting para Selic
                    Selic selic = (Selic) usuario[i];
                    selic.mostraInfo();
                    selic.protecao();
                    selic.liquidez();
                    selic.analise();
                }
            }
        }
        System.out.println();
    }
}
