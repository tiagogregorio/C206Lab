public class Main {
    public static void main(String[] args) {

        Anao anao1 = new Anao(Habitante.contador, "Feliz", 20, 1000);
        anao1.setAltura(120);
        anao1.setReino("Tormenta");
        Arma anaoarma = new Arma("Machado", false);

        Elfo elfo1 = new Elfo(Habitante.contador, "Legolas", 120, 5000);
        elfo1.setTribo("Tolkien");
        Arma elfoarma = new Arma("Arco", false);

        Mago mago1 = new Mago(Habitante.contador, "Karthus", 1000, 10000);
        mago1.setCor("Black");
        Arma magoarma = new Arma("Cajado", true);

        TerraMedia terra = new TerraMedia(); //Instanciando a Terra
        //Adicionando os objetos
        terra.addHabitante(anao1);
        terra.addHabitante(elfo1);
        terra.addHabitante(mago1);

        terra.listarHabitantes();

        System.out.println("Quantidade Total de Habitantes: " + Habitante.getContador());

    }
}
