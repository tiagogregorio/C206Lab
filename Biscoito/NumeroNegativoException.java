public class NumeroNegativoException extends Exception {
    public NumeroNegativoException(double quantidade) {
        System.out.println("Impossível adicionar valores negativos ou nulos, favor rever a quantidade de biscoitos adicionados");
    }
}
