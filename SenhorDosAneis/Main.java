public class Main {
    public static void main(String[] args) {

        //Criando os herois e suas armas
        Anao anao1 = new Anao("Feliz", 20, 1000);
        anao1.setAltura(120);
        anao1.setReino("Tormenta");
        Arma anaoarma = new Arma("Machado", false);
        anao1.arma = anaoarma;

        Elfo elfo1 = new Elfo("Legolas", 120, 5000);
        elfo1.setTribo("Tolkien");
        Arma elfoarma = new Arma("Arco", false);
        elfo1.arma = elfoarma;

        Mago mago1 = new Mago("Karthus", 1000, 10000);
        mago1.setCor("Black");
        Arma magoarma = new Arma("Cajado", true);
        mago1.arma = magoarma;

        TerraMedia terra = new TerraMedia(); //Instanciando "criando" a TerraMedia
        //Adicionando os objetos, os heróis a terra media
        terra.addHabitante(anao1);
        terra.addHabitante(elfo1);
        terra.addHabitante(mago1);

        terra.listarHabitantes(); // Mostrando as informações de habitantes

        System.out.println("Quantidade Total de Habitantes: " + Habitante.getContador());
    }
}
