import java.util.ArrayList;

public class CarrinhoDeCompra {
    private CupomDesconto cupom;
    private ArrayList<Biscoito> biscoitos = new ArrayList<>(); //Homogenea

    public void addBiscoito(Biscoito bisc) {
        System.out.println("Adicionando no carrinho de compras um biscoito: " + bisc.getNome());
        try {
            if (bisc.getQtd() <= 0) {
                throw new NumeroNegativoException(bisc.getQtd());
            } else {
                biscoitos.add(bisc);
            }
        } catch (NumeroNegativoException num) {

        }
    }

    private double totalComDesconto(double total, double desc) {
        return total - (total * (desc / 100));
    }

    public double somaTotal() {
        double total = 0.0;
        for (Biscoito biscoito : biscoitos) {
            total += biscoito.getValor() * biscoito.getQtd();
        }
        if (cupom != null) {
            double totalComDesconto = totalComDesconto(total, cupom.getValorDesconto());
            return totalComDesconto;
        }
        return total;
    }

    public void setCupom(CupomDesconto cupom) {
        this.cupom = cupom;
    }
}
