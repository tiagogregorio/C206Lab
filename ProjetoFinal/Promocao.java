public class Promocao {
    // Atributos ( Características gerais da Promoção)
    private String nomePromocao; // Nome da promoção
    private boolean contemplado; // Indica se a promoção foi contemplada

    public Promocao(String nomePromocao, boolean contemplado) {
        this.nomePromocao = nomePromocao; // Inicializa o nome da promoção com o valor fornecido
        this.contemplado = contemplado; // Inicializa o status de contemplação com o valor fornecido
    }

    // Getters (permitem acessar as características da promoção)

    public boolean isContemplado() {
        return contemplado; // Retorna o status de contemplação da promoção
    }

    public String getNomePromocao() {
        return nomePromocao; // Retorna o nome da promoção
    }

}
